package org.si.dragamina;

import java.util.Random;

public class MatrizeGelaxka {

	private Gelaxka[][] gelaxkak;
	
	public MatrizeGelaxka(int pZailt){
		matrizeaSortu(pZailt);
		System.out.println(gelaxkak[0][0].irudiIzena);
	}
	
	private void gelaxkaHutzakSortu(int pZ){
		int[] dim = Panela.getPanela().dimentzioakKalkulatu(pZ);
		int x = 0, y = 0;
		while(y<=dim[1]){
			while(x>dim[0]){
				if(gelaxkak[x][y] ==null){
					gelaxkak[x][y] = new GelaHutsa(x,y);
				}
			}
		}
	}
	
	public void matrizeaSortu(int pZailt){
		int[] dim = Panela.getPanela().dimentzioakKalkulatu(pZailt);
		int minaKop = pZailt * dim[0];
		minakSortu(minaKop,dim[0], dim[1]);
		gelaxkaHutzakSortu(pZailt);
	}
	
	private void minakSortu(int pMinaKop, int pXMax, int pYMax){
		int xPos, yPos;
		while(pMinaKop>0){
			Random rand = new Random();
			xPos = rand.nextInt(pXMax);
			yPos = rand.nextInt(pYMax);
			gelaxkak[xPos][yPos] = new GelaMina(xPos,yPos);
			zenbakiaEguneratu(xPos,yPos);
			pMinaKop = pMinaKop - 1;
		}
	}
	
	private void zenbakiaEguneratu(int pX, int pY){
		if(gelaxkak[pX][pY]==null){
			gelaxkak[pX][pY] = new GelaZenbakia(pX, pY);
		}
		else if(!gelaxkak[pX][pY].irudiIzena.equals("mine.png")){
			gelaxkak[pX][pY].eguneratu();
		}
	}
	
	public boolean zabalduDa(int pX, int pY){
		return gelaxkak[pX][pY].zabaldua;
	}
	
	public void minakErakutzi(){
		
	}
	
	public String gelaIreki(int pX, int pY){
		gelaxkak[pX][pY].gelaIreki();
		return gelaxkak[pX][pY].irudiIzena;
	}
}
