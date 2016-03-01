package org.si.dragamina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panela{
	
	private Panela nPanela = null;
	
	private Panela(){
		
	}
	
	public Panela getPanela(){
		if(nPanela == null){
			nPanela = new Panela();
		}
		return nPanela;
	}
}
