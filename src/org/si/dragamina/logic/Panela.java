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
		MinaKontagailua.getMinaKontagailua().hasieratu();
		Denbora.getDenbora().hasieratu();
	}
	
	public void klikEgin(int pX, int pY){
		if(!hasita){
			panelaEraiki(pX, pY);
			Denbora.getDenbora().hasi();
			hasita = true;
		}
		ireki(pX, pY);
		unekoJok.klikGehitu();
	}
	
	public void eskuinKlika(int pX, int pY){
		if(hasita){
			matrizea.eskuinKlika(pX, pY);
		}
	}
	
	public void ireki(int pX, int pY){
		matrizea.gelaIreki(pX, pY);
	}
	
	public boolean banderaDAuka(int pX, int pY){
		if(hasita){
			return matrizea.banderaDu(pX, pY);
		}
		else return false;
	}
	
	public void partidaIrabazi(){
		int denb = Denbora.getDenbora().gelditu();
		MinaKontagailua.getMinaKontagailua().irabazi();
		matrizea.banderakErakutzi();											//Minak banderarekin pantailaratu
		setChanged();
		notifyObservers(true);
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
		zailtasuna = 0;
		unekoJok = new Partida(pIzena);
	}
}
