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
}
