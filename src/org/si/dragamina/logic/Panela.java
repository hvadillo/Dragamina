package org.si.dragamina.logic;

import org.si.dragamina.interf.Irudiak;
import org.si.dragamina.interf.KasilenPanela;
import org.si.dragamina.interf.Kontadorea;
import org.si.dragamina.interf.Kronometroa;
import org.si.dragamina.interf.Leihoa;
import org.si.dragamina.interf.Smiley;

public class Panela{
	
	private static Panela nPanela = null;
	private MatrizeGelaxka matrizea;
	
	private Panela(){
		Irudiak.kargatu();
	}
	
	public static Panela getPanela(){
		if(nPanela == null){
			nPanela = new Panela();
		}
		return nPanela;
	}
	
	public void panelaEraiki(int pZail){					//Partida berria sortu (zailtasun berria)
		Smiley.getSmiley().setIcon(Irudiak.smiley[0]);		//Hasierako egoeran jarri aurpegia
		int[] dim = dimentzioakKalkulatu(pZail);
		Leihoa.getLeihoa().leihoaAldatu(pZail, dim[0], dim[1]);
		matrizea = new MatrizeGelaxka(dim[0],dim[1]);
		Leihoa.getLeihoa().setVisible(true);
	}
	
	public void matrizeaEguneratu(){						//Partida berria sortu (zailtasun berina aurreko partidarekiko)
		Smiley.getSmiley().setIcon(Irudiak.smiley[0]);		//Hasierako egoeran jarri aurpegia
		KasilenPanela.getKasilenPanela().botoiakItxi();
		int zail = Leihoa.getLeihoa().getZailtasuna();
		int[] dim = dimentzioakKalkulatu(zail);
		matrizea = new MatrizeGelaxka(dim[0],dim[1]);
		Kontadorea.getKontadorea().partidaBerria(minaKopurua());
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
		int z = Leihoa.getLeihoa().getZailtasuna();
		int[] d = dimentzioakKalkulatu(z);
		return z * d[0];
	}
	
	public void ireki(int pX, int pY){
		matrizea.gelaIreki(pX, pY);
	}
	
	public void partidaIrabazi(){
		Kronometroa.getKronometroa().kronometroaBukatu();						//Kronometroa gelditu partida irabaztean
		Kontadorea.getKontadorea().irabazi(); 									//Bomba kontadorea 0-n jarri
		Smiley.getSmiley().setIcon(Irudiak.smiley[1]);							//Irabazi smiley-a erakutzi
		matrizea.banderakErakutzi();											//Minak banderarekin pantailaratu
		KasilenPanela.getKasilenPanela().mouseListenerrakGuztiakKendu();		//Botoien MouseListener kendu
	}
	
	public void partidaGaldu(){
		Kronometroa.getKronometroa().kronometroaBukatu();						//Kronometroa gelditu partida irabaztean
		Smiley.getSmiley().setIcon(Irudiak.smiley[2]);							//Galdu "smiley-a" erakutzi
		matrizea.minakErakutzi();												//Minak non dauden pantailaratu
		KasilenPanela.getKasilenPanela().mouseListenerrakGuztiakKendu();		//Botoien MouseListener kendu
	}
}
