package org.si.dragamina.logic;

import org.si.dragamina.interf.Leihoa;

public abstract class Main {
	
	public static void main(String[] args) {
		int hastekoZailtasuna = 1;
		Panela.getPanela().panelaEraiki(hastekoZailtasuna);
		Leihoa.getLeihoa().leihoaAldatu(hastekoZailtasuna);
	}
}
