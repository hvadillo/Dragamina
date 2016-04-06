package org.si.dragamina.logic;

import java.util.Observable;

public class Panela extends Observable{
	
	private static Panela nPanela = null;
	private boolean hasita;
	private Integer zailtasuna;
	private MatrizeGelaxka matrizea;
	private Partida unekoJok;
	
	private Panela(){
		hasita = false;
		zailtasuna = 0;
	}
	
	public static Panela getPanela(){
		if(nPanela == null){
			nPanela = new Panela();
		}
		return nPanela;
	}
	
	public void panelaEraiki(int zut, int err){			//Gelaxkak sortu
		int[] dim = dimentzioakKalkulatu(zailtasuna);
		matrizea = new MatrizeGelaxka(dim[0],dim[1], zut, err);
	}
	
	public void partidaBerria(int pZail){
		Denbora.getDenbora().hasieratu();
		hasita = false;
		setChanged();
		if(pZail==zailtasuna || pZail==0){
			Integer v = 0;
			notifyObservers(v);
		}
		else{
			zailtasuna = pZail;
			notifyObservers(zailtasuna);
		}	
	}
	
	public void klikEgin(int pX, int pY){
		ireki(pX, pY);
		unekoJok.klikGehitu();
	}
	
	public void ezkerKlika(int pX, int pY){
		//TODO
	}
	
	public void ireki(int pX, int pY){
		if(hasita==false){
			panelaEraiki(pX, pY);
			Denbora.getDenbora().hasi();
			hasita = true;
		}
		matrizea.gelaIreki(pX, pY);
	}
	
	public void partidaIrabazi(){
		matrizea.banderakErakutzi();											//Minak banderarekin pantailaratu
		setChanged();
		notifyObservers(true);
		int denb = Denbora.getDenbora().gelditu();
		unekoJok.zailtasunaAldatu(zailtasuna);
		unekoJok.setDenbora(denb);
	}
	
	public void partidaGaldu(){
		Denbora.getDenbora().gelditu();
		matrizea.minakErakutzi();												//Minak non dauden pantailaratu
		setChanged();
		notifyObservers(false);
	}
	
	public int minaKopurua(){
		int[] d = dimentzioakKalkulatu(zailtasuna);
		return zailtasuna * d[0];
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
	
	public void jokalariaSortu(String pIzena){
		unekoJok = new Partida(pIzena);
	}
}
