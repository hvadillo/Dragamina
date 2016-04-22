package org.si.dragamina.logic;

import java.util.ArrayList;
import java.util.Random;

import org.si.dragamina.logic.GelaxkaEgoerak.egoera;

public class ProduktuBuilder {
	
	private Gelaxka[][] gelaxkak;
	private ArrayList<Gelaxka> minak;
	private ArrayList<Gelaxka> banderak;
	private int err;
	private int zut;
	private int zailtasuna;
	private int kasilaItxiak;
	
	protected ProduktuBuilder(int pZail){
		zailtasuna = pZail;
		int[] d = dimentzioakKalkulatu(zailtasuna);
		err = d[0];
		zut = d[1];
		gelaxkak = new Gelaxka[zut][err];
		minak = new ArrayList<Gelaxka>();
		banderak = new ArrayList<Gelaxka>();	
	}
	
	protected Gelaxka[][] GelaHutsakSortu(){
		for(int y=0; y<err; y++){
			for(int x=0; x<zut; x++){
				if(gelaxkak[x][y] == null){
					gelaxkak[x][y] = new GelaHutsa(x,y);
				}
			}
		}
		return gelaxkak;
	}
	
	protected Gelaxka[][] matrizeaSortu(int irekiZut, int irekiErr){
		kasilaItxiak = (zut * err) - minaKopurua();
		minakSortu(irekiErr,irekiZut);
		for(int x=0;x<banderak.size(); x++){
			if(!banderak.get(x).equals(gelaxkak[banderak.get(x).getX()][banderak.get(x).getY()])){ 		//Kasila aldatu bada
				if(gelaxkak[banderak.get(x).getX()][banderak.get(x).getY()].itxitaDago()){				//Konprobatu kasila berria zabaldu den
					gelaxkak[banderak.get(x).getX()][banderak.get(x).getY()].egoeraAldatu(egoera.BANDERA);//Zabaldu ez bada bandera jarri
				}
				else{
					banderak.remove(x);															////Zabaldu bada banderetatik kendu
					MinaKontagailua.getMinaKontagailua().kendu();								//Zabaldu bada kontadoretik bandera kendu
				}
			}
		}
		return gelaxkak;
	}
	
	private void minakSortu(int irekiErr, int irekiZut){
		int xPos, yPos;
		int minaKop = minaKopurua();
		while(minaKop>0){
			Random rand = new Random();
			xPos = rand.nextInt(zut);
			yPos = rand.nextInt(err);
			if(minaJarDaiteke(xPos, yPos, irekiZut, irekiErr)){
				if(gelaxkak[xPos][yPos]==null || !(gelaxkak[xPos][yPos] instanceof GelaMina)){
					gelaxkak[xPos][yPos] = new GelaMina(xPos,yPos);
					minak.add(gelaxkak[xPos][yPos]);
					kasilakEguneratu(xPos,yPos);
					minaKop = minaKop - 1;
				}
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
			if(gelaxkak[pZut][pErr]==null || gelaxkak[pZut][pErr] instanceof GelaHutsa){
				gelaxkak[pZut][pErr] = new GelaZenbakia(pZut, pErr);
			}
			else if(gelaxkak[pZut][pErr] instanceof GelaZenbakia){
				gelaxkak[pZut][pErr].eguneratu();
			}
		}
	}
	
	private boolean minaJarDaiteke(int x, int y, int ireX, int ireY){
		if(x == ireX && y == ireY) return false;
		else if(x == ireX+1 && y == ireY) return false;
		else if(x == ireX+1 && y == ireY+1) return false;
		else if(x == ireX && y == ireY+1) return false;
		else if(x == ireX-1 && y == ireY+1) return false;
		else if(x == ireX-1 && y == ireY) return false;
		else if(x == ireX-1 && y == ireY-1) return false;
		else if(x == ireX && y == ireY-1) return false;
		else if(x == ireX+1 && y == ireY-1) return false;
		return true;
	}
	
	protected boolean matrizeBarruan(int pZut, int pErr){
		boolean barruan = false;
		if((pZut<zut && pZut>=0) && (pErr<err && pErr>=0)){
			barruan = true;
		}
		return barruan;
	}
	
	protected ArrayList<Gelaxka> getMinenArraya(){
		return minak;
	}
	
	protected ArrayList<Gelaxka> getBanderenArraya(){
		return banderak;
	}
	
	protected int getKasilaItxiak(){
		return kasilaItxiak;
	}
	
	private int minaKopurua(){
		return zailtasuna * err;
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
}
