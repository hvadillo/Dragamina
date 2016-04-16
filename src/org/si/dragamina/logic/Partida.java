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
	private String partidaData;
	
	public Partida(String pIzena){
		izena = pIzena;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		partidaData = dateFormat.format(new Date());
	}
	
	public Partida(int pZail, String pIzena, String pPuntuak, String pData){
		zailtasuna = pZail;
		izena = pIzena;
		puntuak = Integer.parseInt(pPuntuak);
		partidaData = pData;
	}
	
	public void partidaIrabazi(int pDenbora){
		denbora = pDenbora;
		puntuakKalkulatu();
	}
	
	private void puntuakKalkulatu(){
		puntuak = (int) (((double)klikak/((double)denbora) * 1000) * zailtasuna);
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
	
	public int getPuntuak(){
		return puntuak;
	}
	
	public String getData(){
		return partidaData;
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
