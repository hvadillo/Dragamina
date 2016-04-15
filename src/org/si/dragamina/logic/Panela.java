package org.si.dragamina.logic;

import java.util.Observable;

public class Panela extends Observable{
	
	private static Panela nPanela = null;
	private boolean hasita;
	private Integer zailtasuna;
	private MatrizeGelaxka matrizea;
	private Partida unekoJok;
	
	private Panela(){
		TopPartidak.getTopPartidak().fitxategiaKargatu();
		hasita = false;
		zailtasuna = 0;
	}
	
	public static Panela getPanela(){
		if(nPanela == null){
			nPanela = new Panela();
		}
		return nPanela;
	}
	
	public void partidaBerria(int pZail){
		hasita = false;
		setChanged();
		if(pZail==zailtasuna || pZail==0){
			Integer v = 0;									//0 bada leihoa ez aldatu, kasilak itxi
			notifyObservers(v);								//Leihoari dimentzioak aldatzeko seinalea
		}
		else{
			zailtasuna = pZail;
			notifyObservers(zailtasuna);					//Leihoari dimentzioak aldatzeko seinalea
		}	
		int[] dim = dimentzioakKalkulatu(zailtasuna);
		matrizea = new MatrizeGelaxka(dim[0],dim[1]);		//Matrizean gelak hutzik sortu, minak lehenengo klikarekin sortzen dira
		MinaKontagailua.getMinaKontagailua().hasieratu();
		Denbora.getDenbora().hasieratu();
	}
	
	public void klikEgin(int zut, int err){		//Botoian klik egitean erabiltzeko
		if(!hasita){
			matrizea.matrizeaSortu(zut, err);	//Minak sortu
			Denbora.getDenbora().hasi();		//Denbora martxan
			hasita = true;		
		}
		if(!matrizea.banderaDu(zut, err)){		//Banderarik ez badu
			ireki(zut, err);					//Kasila ireki
			unekoJok.klikGehitu();				//Klik bat gehitu jokalariari
		}
	}
	
	public void eskuinKlika(int pX, int pY){
		matrizea.eskuinKlika(pX, pY);
	}
	
	public void ireki(int pX, int pY){			//zuzenean irekitzeko (Gelak zabaltzean bakarrik zuzen)
		matrizea.gelaIreki(pX, pY);
	}
	
	public void partidaIrabazi(){
		int denb = Denbora.getDenbora().gelditu();
		MinaKontagailua.getMinaKontagailua().irabazi();
		matrizea.banderakErakutzi();			//Minak banderarekin pantailaratu
		setChanged();
		notifyObservers(true);					//Irabazi seinalea Leihoari
		unekoJok.zailtasunaAldatu(zailtasuna);
		unekoJok.partidaIrabazi(denb);
	}
	
	public void partidaGaldu(){
		Denbora.getDenbora().gelditu();
		matrizea.galdu();						//Minak non dauden pantailaratu
		setChanged();
		notifyObservers(false);					//Galdu seinalea Leihoari
		
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
	
	public String jokalariIzenaLortu(){
		return unekoJok.getIzena();
	}
}
