package org.si.dragamina.logic;

public class ProduktuBuilder {
	
	private MatrizeGelaxka gelzkak;
	
	private ProduktuBuilder(){}
	
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
}
