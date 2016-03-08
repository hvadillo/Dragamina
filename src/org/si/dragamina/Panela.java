package org.si.dragamina;

public class Panela{
	
	private static Panela nPanela;
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
	
	public void panelaEraiki(int pZail){
		Leihoa.getLeihoa().setZailtasuna(pZail);
		int[] dim = dimentzioakKalkulatu(pZail);
		Leihoa.getLeihoa().leihoaAldatu(dim[0], dim[1]);
		Leihoa.getLeihoa().setVisible(true);
		matrizea = new MatrizeGelaxka(pZail, dim[0],dim[1]);
	}
	
	public void matrizeaEguneratu(){
		Leihoa.getLeihoa().kasilakItxi();
		int zail = Leihoa.getLeihoa().getZailtasuna();
		int[] dim = dimentzioakKalkulatu(zail);
		matrizea = new MatrizeGelaxka(zail,dim[0],dim[1]);
	}
	
	public int[] dimentzioakKalkulatu(int pZ){
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
	
	public void ireki(int pX, int pY){
		matrizea.gelaIreki(pX, pY);
	}
	
	public void partidaGaldu(){
		matrizea.minakErakutzi();
		Smiley.getSmiley().setIcon(Irudiak.smiley[2]);
		Leihoa.getLeihoa().galdu();
	}
}
