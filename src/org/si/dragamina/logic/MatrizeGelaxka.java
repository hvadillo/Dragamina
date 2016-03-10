package org.si.dragamina.logic;

import java.util.Random;
import org.si.dragamina.interf.Leihoa;
import java.util.ArrayList;

public class MatrizeGelaxka {

	private Gelaxka[][] gelaxkak;
	private ArrayList<Gelaxka> minak;
	private int zut;
	private int err;
	private int kasilaItxiak;						//Minak ez diren zenbak kasila geratzen diren
	
	public MatrizeGelaxka(int pErr, int pZut){
		zut = pZut;
		err = pErr;
		gelaxkak = new Gelaxka[zut][err];
		minak = new ArrayList<Gelaxka>();
		matrizeaSortu();
	}
	
	public void matrizeaSortu(){
		int minaKop = Leihoa.getLeihoa().getZailtasuna() * err;
		kasilaItxiak = (zut * err) - minaKop;
		minakSortu(minaKop);
		gelaxkaHutzakSortu();
	}
	
	private void minakSortu(int pMinaKop){
		int xPos, yPos;
		while(pMinaKop>0){
			Random rand = new Random();
			xPos = rand.nextInt(zut);
			yPos = rand.nextInt(err);
			if(gelaxkak[xPos][yPos]==null || gelaxkak[xPos][yPos].mota!="mina"){
				gelaxkak[xPos][yPos] = new GelaMina(xPos,yPos);
				minak.add(gelaxkak[xPos][yPos]);
				kasilakEguneratu(xPos,yPos);
				pMinaKop = pMinaKop - 1;
			}
		}
	}
	
	private void kasilakEguneratu(int pX, int pY){
		eguneratu(pX+1,pY);
		eguneratu(pX+1,pY+1);
		eguneratu(pX,pY+1);
		eguneratu(pX-1,pY+1);
		eguneratu(pX-1,pY);
		eguneratu(pX-1,pY-1);
		eguneratu(pX,pY-1);
		eguneratu(pX+1,pY-1);
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
	
	private void gelaxkaHutzakSortu(){
		for(int y=0; y<err; y++){
			for(int x=0; x<zut; x++){
				if(gelaxkak[x][y] == null){
					gelaxkak[x][y] = new GelaHutsa(x,y);
				}
			}
		}
	}
	
	public void minakErakutzi(){
		for(int x=0; x<minak.size(); x++){
			if(!minak.get(x).zabaldua){
				minak.get(x).gelaIreki();
			}
		}
	}
	
	public void gelaIreki(int pX, int pY){
		if(matrizeBarruan(pX,pY)){
			if(!gelaxkak[pX][pY].zabaldua){
				kasilaItxiak--;
				if(kasilaItxiak==0){
					Panela.getPanela().partidaIrabazi();
				}
				gelaxkak[pX][pY].gelaIreki();
			}
		}
	}
}
