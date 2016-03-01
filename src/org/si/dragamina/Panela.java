package org.si.dragamina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panela{
	
	private Panela nPanela = null;
	private MatrizeGelaxka matrizea;
	
	private Panela(){
		matrizea = new MatrizeGelaxka();
	}
	
	public Panela getPanela(){
		if(nPanela == null){
			nPanela = new Panela();
		}
		return nPanela;
	}
	
	public void jokatu(){
		
	}
	
	private void panelHutzaEraiki(){
		
	}
	
	private void panelaEraiki(){
		
	}
	
	private void ireki(){
		
	}
	
	private void actionPerformed(ActionEvent e){
		
	}
}
