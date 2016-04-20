package org.si.dragamina.logic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		try {
			fitxategia.createNewFile();
		} catch (IOException e) {}
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
			Scanner f = new Scanner(new FileReader(fitxategia));
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
			fitxategia.createNewFile();
			fw = new FileWriter(fitxategia.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for(int x=0; x<topak.length;x++){
				bw.write(s[x]);
				for(int y=0; y<3; y++){
					try {
						if(topak[x][y]==null){
							{throw new Exception();}
						}	
						bw.write(" ### " + topak[x][y].getIzena() + "---" + topak[x][y].getPuntuak() + "---" + topak[x][y].getData());
					} catch (Exception e) {}	
				}
				bw.newLine();
			}
			bw.close();
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
		setChanged();
		notifyObservers();
		fitxategiaGorde();
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
	
	public Partida[] topaLortu(int pZail){
		return topak[pZail];
	}
}
