package org.si.dragamina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panela{
	
	private static Panela nPanela = null;
	private MatrizeGelaxka matrizea;
	
	private Panela(){
		matrizea = new MatrizeGelaxka();
	}
	
	public static Panela getPanela(){
		if(nPanela == null){
			nPanela = new Panela();
		}
		return nPanela;
	}
	
	public void jokatu(){
		panelHutzaEraiki();
	}
	
	private int zailtasuna(){
		int za = 1;
		
		return za;
	}
	
	private void panelHutzaEraiki(){
		int z = zailtasuna();
		panelaEraiki(z);
	}
	
	private void panelaEraiki(int pZail){
		
	}
	
	public void ireki(){
		
	}
}
