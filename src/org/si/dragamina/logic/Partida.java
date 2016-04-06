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
	
	public void setDenbora(int pDenbora){
		denbora = pDenbora;
	}
	
	public int puntuakKalkulatu(){
		puntuak = (int) (((double)klikak/(double)denbora) * 1000);
		return puntuak;
	}
	
	public void klikGehitu(){
		klikak++;
	}
	 
	public void zailtasunaAldatu(int pZail){
		zailtasuna = pZail;
	}
}
