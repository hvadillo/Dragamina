package org.si.dragamina.logic;

import org.si.dragamina.logic.GelaxkaEgoerak.egoera;

import java.util.ArrayList;

public class MatrizeGelaxka{

	private Gelaxka[][] gelaxkak;
	private ProduktuBuilder gureBuilder;
	private ArrayList<Gelaxka> minak;
	private ArrayList<Gelaxka> banderak;
	private int zut;
	private int err;
	private int kasilaItxiak;						//Minak ez diren zenbak kasila geratzen diren
	
	public MatrizeGelaxka(int pZail){
		gureBuilder = new ProduktuBuilder(pZail);
		gelaxkak = new Gelaxka[zut][err];
		minak = new ArrayList<Gelaxka>();
		banderak = new ArrayList<Gelaxka>();
		gelaxkak = gureBuilder.GelaHutsakSortu();
	}
	
	public void matrizeaSortu(int irekiZut, int irekiErr){
		gelaxkak = gureBuilder.matrizeaSortu(irekiZut, irekiErr);
		minak = gureBuilder.getMinenArraya();
		banderak = gureBuilder.getBanderenArraya();
		kasilaItxiak = gureBuilder.getKasilaItxiak();
	}
	
	public void banderakErakutzi(){
		for(int x=0; x<minak.size(); x++){
			minak.get(x).egoeraAldatu(egoera.BANDERA);
		}
	}
	
	public void galdu(){
		for(int x=0; x<minak.size(); x++){
			if(minak.get(x).itxitaDago()){
				minak.get(x).egoeraAldatu(egoera.MINA);
			}
		}
		for(int x=0; x<banderak.size(); x++){
			if(banderak.get(x).banderaDu() && !(banderak.get(x) instanceof GelaMina)){
				banderak.get(x).egoeraAldatu(egoera.EZBANDERA);
			}
		}
	}
	
	public void gelaIreki(int pX, int pY){
		if(gureBuilder.matrizeBarruan(pX,pY)){								//Gela matrize barruan dagoela zihurtatu
			if(gelaxkak[pX][pY].itxitaDago()){	//Gela dagoeneko zabalik dagoen konprobatu
				if(gelaxkak[pX][pY].banderaDu()){
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
	
	public void eskuinKlika(int pX, int pY){
		int s = gelaxkak[pX][pY].eskuinKlik();
		if(s==1){			//bandera jarri
			banderak.add(gelaxkak[pX][pY]);
		}
		else if(s==-1){		//bandera kendu
			banderak.remove(gelaxkak[pX][pY]);
		}
	}
	
	public boolean banderaDu(int pX, int pY){
		if(gelaxkak[pX][pY].banderaDu()){
			return true;
		}
		else return false;
	}
}
