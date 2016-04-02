package org.si.dragamina.logic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Partida {

	private String izena;
	private int zailtasuna;
	private double puntuak;
	private Date partidaData;
	
	public Partida(String pIzena){
		izena = pIzena;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		partidaData = new Date();
	}
	
	public void setPuntuak(double pPuntuak, int pZail){
		puntuak = pPuntuak;
		zailtasuna = pZail;
	}
}
