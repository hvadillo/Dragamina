package org.si.dragamina.logic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Partida {

	private String izena;
	private int zailtasuna;
	private int klikak;
	private int denbora;
	private int puntuak;
	private Date partidaData;
	
	public Partida(String pIzena){
		izena = pIzena;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		partidaData = new Date();
	}
	
	public void partidaIrabazi(int pDenbora){
		denbora = pDenbora;
		puntuakKalkulatu();
	}
	
	private void puntuakKalkulatu(){
		puntuak = (int) (((double)klikak/(double)denbora) * 1000);
		TopPartidak.getTopPartidak().topaEguneratu(this, zailtasuna, puntuak);
	}
	
	public void klikGehitu(){
		klikak++;
	}
	 
	public void zailtasunaAldatu(int pZail){
		zailtasuna = pZail;
	}
	
	public String getIzena(){
		return izena;
	}
	
	public boolean puntuGehiago(int pPunt){
		if(puntuak>=pPunt){
			return true;
		}
		else{
			return false;
		} 
	}
}
