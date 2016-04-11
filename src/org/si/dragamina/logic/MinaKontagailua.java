package org.si.dragamina.logic;

import java.util.Observable;

public class MinaKontagailua extends Observable{

	private static MinaKontagailua nMinaKontagailua = null;
	private int minakFaltan;
	
	private MinaKontagailua(){
		minakFaltan = Panela.getPanela().minaKopurua();
	}
	
	public static MinaKontagailua getMinaKontagailua(){
		if(nMinaKontagailua==null){
			nMinaKontagailua = new MinaKontagailua();
		}
		return nMinaKontagailua;
	}
	
	public void hasieratu(){
		minakFaltan = 0;
		setChanged();
		notifyObservers(minakFaltan);
	}
	
	public void gehitu(){
		minakFaltan++;
		setChanged();
		notifyObservers(minakFaltan);
	}
	
	public void kendu(){
		minakFaltan--;
		setChanged();
		notifyObservers(minakFaltan);
	}
}
