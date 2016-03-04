package org.si.dragamina;

public class Panela{
	
	private static Panela nPanela = null;
	private MatrizeGelaxka matrizea;
	
	private Panela(){
		Leihoa.getLeihoa().setVisible(true);
	}
	
	public static Panela getPanela(){
		if(nPanela == null){
			nPanela = new Panela();
		}
		return nPanela;
	}
	
	public void jokatu(){
		panelHutzaEraiki();
		panelaEraiki(1);
	}
	
	private void panelHutzaEraiki(){
		Leihoa.getLeihoa().setVisible(true);
	}
	
	public void panelaEraiki(int pZail){
		matrizea = new MatrizeGelaxka(pZail);
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
	
	public String ireki(int pX, int pY){
		return matrizea.gelaIreki(pX, pY);
	}
}
