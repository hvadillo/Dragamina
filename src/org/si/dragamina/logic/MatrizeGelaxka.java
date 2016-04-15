package org.si.dragamina.logic;

import java.util.Random;

import org.si.dragamina.logic.GelaxkaEgoerak.egoera;

import java.util.ArrayList;

public class MatrizeGelaxka{

	private Gelaxka[][] gelaxkak;
	private ArrayList<Gelaxka> minak;
	private ArrayList<Gelaxka> banderak;
	private int zut;
	private int err;
	private int kasilaItxiak;						//Minak ez diren zenbak kasila geratzen diren
	
	protected MatrizeGelaxka(int pErr, int pZut){
		zut = pZut;
		err = pErr;
		gelaxkak = new Gelaxka[zut][err];
		minak = new ArrayList<Gelaxka>();
		banderak = new ArrayList<Gelaxka>();
		gelaxkaHutzakSortu();
	}
	
	protected void matrizeaSortu(int irekiZut, int irekiErr){
		int minaKop = Panela.getPanela().minaKopurua();
		kasilaItxiak = (zut * err) - minaKop;
		minakSortu(minaKop,irekiZut,irekiErr);
		gelaxkaHutzakSortu();
		for(int x=0;x<banderak.size(); x++){
			if(!banderak.get(x).equals(gelaxkak[banderak.get(x).x][banderak.get(x).y])){ 		//Kasila aldatu bada
				if(!gelaxkak[banderak.get(x).x][banderak.get(x).y].e.equals(egoera.ZABALDUA)){	//Konprobatu kasila berria zabaldu den
					gelaxkak[banderak.get(x).x][banderak.get(x).y].egoeraAldatu(egoera.BANDERA);//Zabaldu ez bada bandera jarri
				}
				else{
					banderak.remove(x);															////Zabaldu bada banderetatik kendu
					MinaKontagailua.getMinaKontagailua().kendu();								//Zabaldu bada kontadoretik bandera kendu
				}
			}
		}
	}
	
	private void minakSortu(int pMinaKop, int irekiZut, int irekiErr){
		int xPos, yPos;
		while(pMinaKop>0){
			Random rand = new Random();
			xPos = rand.nextInt(zut);
			yPos = rand.nextInt(err);
			if(minaJarDaiteke(xPos, yPos, irekiZut, irekiErr)){
				if(gelaxkak[xPos][yPos]==null || !(gelaxkak[xPos][yPos] instanceof GelaMina)){
					gelaxkak[xPos][yPos] = new GelaMina(xPos,yPos);
					minak.add(gelaxkak[xPos][yPos]);
					kasilakEguneratu(xPos,yPos);
					pMinaKop = pMinaKop - 1;
				}
			}
		}
	}
	
	private boolean minaJarDaiteke(int x, int y, int ireX, int ireY){	//Zabaldutako lehenengo kasilan mina ez jartzeko (eta ingurukoetan)
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
	
	private void kasilakEguneratu(int pX, int pY){				//zenbakiak minen inguruan jarri
		eguneratu(pX+1,pY);
		eguneratu(pX+1,pY+1);
		eguneratu(pX,pY+1);
		eguneratu(pX-1,pY+1);
		eguneratu(pX-1,pY);
		eguneratu(pX-1,pY-1);
		eguneratu(pX,pY-1);
		eguneratu(pX+1,pY-1);
	}
	
	private void eguneratu(int pZut, int pErr){					//zenbaki kasilak mina inguruan izatekotan zenbakia +1
		if(matrizeBarruan(pZut, pErr)){
			if(gelaxkak[pZut][pErr]==null || gelaxkak[pZut][pErr] instanceof GelaHutsa){
				gelaxkak[pZut][pErr] = new GelaZenbakia(pZut, pErr);
			}
			else if(gelaxkak[pZut][pErr] instanceof GelaZenbakia){
				gelaxkak[pZut][pErr].eguneratu();
			}
		}
	}
	
	private boolean matrizeBarruan(int pZut, int pErr){
		boolean barruan = false;
		if((pZut<zut && pZut>=0) && (pErr<err && pErr>=0)){
			barruan = true;
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
	
	protected void banderakErakutzi(){
		for(int x=0; x<minak.size(); x++){
			minak.get(x).egoeraAldatu(egoera.BANDERA);
		}
	}
	
	protected void galdu(){
		for(int x=0; x<minak.size(); x++){
			if(minak.get(x).e.equals(egoera.ITXITA)){
				minak.get(x).egoeraAldatu(egoera.MINA);
			}
		}
		for(int x=0; x<banderak.size(); x++){
			if(banderak.get(x).e.equals(egoera.BANDERA) && !(banderak.get(x) instanceof GelaMina)){
				banderak.get(x).egoeraAldatu(egoera.EZBANDERA);
			}
		}
	}
	
	protected void gelaIreki(int pX, int pY){
		if(matrizeBarruan(pX,pY)){								//Gela matrize barruan dagoela zihurtatu
			if(!gelaxkak[pX][pY].e.equals(egoera.ZABALDUA)){	//Gela dagoeneko zabalik dagoen konprobatu
				if(gelaxkak[pX][pY].e.equals(egoera.BANDERA)){
					MinaKontagailua.getMinaKontagailua().gehitu();
				}
				gelaxkak[pX][pY].gelaIreki();
				kasilaItxiak--;
				if(kasilaItxiak<=0){							//Kasila guztiak zabalik badaude partida irabazi
				try {
					if(gelaxkak[pX][pY] instanceof GelaMina){
						{throw new Exception();}
					}
					Panela.getPanela().partidaIrabazi();
				} catch (Exception e) {}	
				}				
			}
		}
	}
	
	protected void eskuinKlika(int pX, int pY){
		int s = gelaxkak[pX][pY].eskuinKlik();
		if(s==1){			//bandera jarri
			banderak.add(gelaxkak[pX][pY]);
		}
		else if(s==-1){		//bandera kendu
			banderak.remove(gelaxkak[pX][pY]);
		}
	}
	
	protected boolean banderaDu(int pX, int pY){
		if(gelaxkak[pX][pY].e.equals(egoera.BANDERA)){
			return true;
		}
		else return false;
	}
}
