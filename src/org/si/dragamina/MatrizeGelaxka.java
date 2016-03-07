package org.si.dragamina;

import java.util.Random;

public class MatrizeGelaxka {

	private Gelaxka[][] gelaxkak;
	private int zut;
	private int err;
	
	public MatrizeGelaxka(int pZailt){
		int[] d = Panela.getPanela().dimentzioakKalkulatu(pZailt);
		zut = d[1];
		err = d[0];
		gelaxkak = new Gelaxka[zut][err];
		matrizeaSortu(pZailt);
	}
	
	public void matrizeaSortu(int pZailt){
		int minaKop = pZailt * zut;
		minakSortu(minaKop);
		gelaxkaHutzakSortu(pZailt);
	}
	
	private void gelaxkaHutzakSortu(int pZ){
		for(int y=0; y<err; y++){
			for(int x=0; x<zut; x++){
				if(gelaxkak[x][y] == null){
					gelaxkak[x][y] = new GelaHutsa(x,y);
				}
			}
		}
	}
	
	private void minakSortu(int pMinaKop){
		int xPos, yPos;
		while(pMinaKop>0){
			Random rand = new Random();
			xPos = rand.nextInt(zut);
			yPos = rand.nextInt(err);
			if(gelaxkak[xPos][yPos]==null){
				gelaxkak[xPos][yPos] = new GelaMina(xPos,yPos);
				kasilakEguneratu(xPos,yPos);
				pMinaKop = pMinaKop - 1;
			}
		}
	}
	
	private void kasilakEguneratu(int pX, int pY){
		eguneratu(pX+1,pY);
		eguneratu(pX,pY+1);
		eguneratu(pX+1,pY+1);
		eguneratu(pX-1,pY);
		eguneratu(pX,pY-1);
		eguneratu(pX-1,pY);
		eguneratu(pX+1,pY-1);
		eguneratu(pX-1,pY+1);
	}
	
	private void eguneratu(int pZut, int pErr){
		if(matrizeBarruan(pZut, pErr)){
			if(gelaxkak[pZut][pErr]==null){
				gelaxkak[pZut][pErr] = new GelaZenbakia(pZut, pErr);
			}
			else if(gelaxkak[pZut][pErr].mota == "zenbakia"){
				gelaxkak[pZut][pErr].eguneratu();
			}
		}
	}
	
	private boolean matrizeBarruan(int pZut, int pErr){
		boolean barruan = false;
		if(pZut<zut && pZut>=0){
			if(pErr<err && pErr>=0){
				barruan = true;
			}
		}
		return barruan;
	}
	
	public void minakErakutzi(){
		
	}
	
	public void gelaIreki(int pX, int pY){
		if(matrizeBarruan(pX,pY)){
			System.out.println(pX + " " + pY);
			gelaxkak[pX][pY].gelaIreki();
		}
	}
}
