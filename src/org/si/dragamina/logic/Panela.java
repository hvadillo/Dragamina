package org.si.dragamina.logic;

import java.util.Observable;

public class Panela extends Observable{
	
	private int zailtasuna;
	private static Panela nPanela = null;
	private MatrizeGelaxka matrizea = null;
	
	private Panela(){
		zailtasuna = 0;
	}
	
	public static Panela getPanela(){
		if(nPanela == null){
			nPanela = new Panela();
		}
		return nPanela;
	}
	
	public void panelaEraiki(int zut, int err){			//Partida berria sortu (zailtasun berria)
		int[] dim = dimentzioakKalkulatu(zailtasuna);
		matrizea = new MatrizeGelaxka(dim[0],dim[1], zut, err);
	}
	
	private int[] dimentzioakKalkulatu(int pZ){
		int[] dim = new int[2];
		switch (pZ) {
			case 1: dim[0] = 7;
					dim[1] = 10;
					break;
			case 2: dim[0] = 10;
					dim[1] = 15;
					break;
			case 3: dim[0] = 12;
					dim[1] = 25;
					break;
		}
		return dim;
	}
	
	public int minaKopurua(){
		int[] d = dimentzioakKalkulatu(zailtasuna);
		return zailtasuna * d[0];
	}
	
	public void setZailtasuna(int pZ){
		zailtasuna = pZ;
	}
	
	public void ireki(int pX, int pY){
		matrizea.gelaIreki(pX, pY);
	}
	
	public void partidaIrabazi(){
		matrizea.banderakErakutzi();											//Minak banderarekin pantailaratu
		setChanged();
		notifyObservers(true);
	}
	
	public void partidaGaldu(){
		matrizea.minakErakutzi();												//Minak non dauden pantailaratu
		setChanged();
		notifyObservers(false);
	}
	
	public void jokalariaSortu(String pIzena){
		Partida p = new Partida(pIzena);
	}
}
