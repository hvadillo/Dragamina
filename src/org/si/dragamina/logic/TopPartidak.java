package org.si.dragamina.logic;

import java.io.File;

public class TopPartidak {

	private static TopPartidak ntTopPartidak = null;
	private int tamaina;
	private Partida[][] topak;
	private File fitxategia;
	
	private TopPartidak(){
		fitxategia = new File("Ranking.txt");
		try {
			if (!fitxategia.exists()){
				{throw new Exception();}
			}
			fitxategia.createNewFile();
		}catch (Exception e){
			fitxategia = new File("Ranking.txt");
		}
		tamaina = 10;
		topak = new Partida[3][tamaina];		//3 top (zailtasunak) 10 partida bakoitzean
	}
	
	public static TopPartidak getTopPartidak(){
		if(ntTopPartidak==null){
			ntTopPartidak = new TopPartidak();
		}
		return ntTopPartidak;
	}
	
	public void fitxategiaKargatu(){
		
	}
	
	private void fitxategiaGorde(){
		try {
			if (!fitxategia.exists()){
				{throw new Exception();}
			}
			fitxategia.createNewFile();
		}catch (Exception e){
			fitxategia = new File("Ranking.txt");
		}
		
		
	}
	
	public void topaEguneratu(Partida pPart, int pZail, int pPunt){
		pZail--;
		int pos = hutzuneaTopatu(pZail);
		if(pos!=-1){
			topak[pZail][pos] = pPart;
		}
		else{
			pos = puntuGeihago(pZail, pPunt);
			if(pos!=-1){
				txertatu(pPart, pos, pZail);
			}
		}
		fitxategiaGorde();
	}
	
	private int hutzuneaTopatu(int pZail){
		int x = 0;
		while(x<topak[pZail].length){
			if(topak[pZail][x]==null){
				return x;
			}
			x++;
		}
		return -1;
	}
	
	private int puntuGeihago(int pZail, int pPunt){
		boolean topatua = false;
		int x = 0;
		while(!topatua && x<topak[pZail].length){
			if(!topak[pZail][x].puntuGehiago(pPunt)){
				topatua = true;
				return x;
			}
		}
		return -1;
	}
	
	private void txertatu(Partida pPart, int pPos, int pZail){
		Partida pHunekoa = pPart;
		Partida pLaguntzaile;
		for(int x=pPos; x<topak[pZail].length; x++){
			pLaguntzaile = topak[pZail][x];
			topak[pZail][x] = pHunekoa;
			pHunekoa = pLaguntzaile;
		}
	}
	
	public Partida[] topaLortu(int pZail){
		return topak[pZail];
	}
}
