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
		minakFaltan = Panela.getPanela().minaKopurua();
		setChanged();
		notifyObservers(minakFaltan);
	}
	
	public void gehitu(){
		minakFaltan++;
		setChanged();
		notifyObservers(minakFaltan);
	}
	
	public int  kendu(){
		if(minakFaltan>0){
			minakFaltan--;
			setChanged();
			notifyObservers(minakFaltan);
			return 0;
		}
		else return -1; 
	}
	
	public void irabazi(){
		minakFaltan = 0;
		setChanged();
		notifyObservers(minakFaltan);
	}
}
