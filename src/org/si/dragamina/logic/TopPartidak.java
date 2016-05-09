package org.si.dragamina.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Observable;
import java.util.Scanner;

public class TopPartidak extends Observable{

	private static TopPartidak ntTopPartidak = null;
	private int tamaina;
	private Partida[][] topak;
	private File fitxategia = new File("Ranking.txt");
	
	private TopPartidak(){
		try{
			if(fitxategia.createNewFile()){
				sortuHasierakoFitxategia();
			}
		} catch (IOException e) {
			e.printStackTrace();
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
		try {
			try {
				if(fitxategia.createNewFile()){
					sortuHasierakoFitxategia();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			Scanner f = new Scanner(fitxategia);
			String lerroa;
			int z = 0;
			while(f.hasNext()){
				lerroa = f.nextLine();
				String[] items = lerroa.split(" ### ");
				for(int x=1; x<items.length; x++){
					String[] jokItems = items[x].split("---");
					topak[z][x-1] = new Partida(z,jokItems[0],jokItems[1], jokItems[2]);	
				}
				z++;
			}
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void fitxategiaGorde(){
		String[] s = {"ERREZA", "NORMALA", "ZAILA"};
		FileWriter fw;
		try {
			if(fitxategia.createNewFile()){
				sortuHasierakoFitxategia();
			}
			fw = new FileWriter(fitxategia);
			for(int x=0; x<topak.length;x++){
				fw.write(s[x]);
				for(int y=0; y<topak[x].length; y++){
					try {
						if(topak[x][y]==null){
							{throw new Exception();}
						}	
						fw.write(" ### " + topak[x][y].getIzena() + "---" + topak[x][y].getPuntuak() + "---" + topak[x][y].getData());
					} catch (Exception e) {}	
				}
				fw.write("\n");	
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void topaEguneratu(Partida pPart, int pZail, int pPunt){
		pZail--;
		int pos = txertatzekoPosizioa(pZail, pPunt);
		if(pos!=-1){
			txertatu(pPart, pos, pZail);
		}
		fitxategiaGorde();
		setChanged();
		notifyObservers();
	}
	
	private int txertatzekoPosizioa(int pZail, int pPunt){
		boolean topatua = false;
		int x = 0;
		try{
			if(topak[pZail][x]==null){
				{throw new Exception();}
			}
			while(!topatua && x<topak[pZail].length){
				if(!topak[pZail][x].puntuGehiago(pPunt)){
					topatua = true;
					return x;
				}
				x++;
			}
		}catch(Exception e){return x;}
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
	
	private void sortuHasierakoFitxategia(){
		FileWriter fw;
		try {
			fw = new FileWriter(fitxategia);
			fw.write("ERREZA ### Robert Donner---1600---1990-05-22 ### Aimar Ugarte---1500---1996-04-08 ### Hector Vadillo---1400---1996-04-04\n"
					+"NORMALA ### Robert Donner---1800---1990-05-22 ### Aimar Ugarte---1700---1996-04-08 ### Hector Vadillo---1600---1996-04-04\n"
					+"ZAILA ### Robert Donner---2000---1990-05-22 ### Aimar Ugarte---1900---1996-04-08 ### Hector Vadillo---1800---1996-04-04");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Partida[] topaLortu(int pZail){
		return topak[pZail];
	}
}
