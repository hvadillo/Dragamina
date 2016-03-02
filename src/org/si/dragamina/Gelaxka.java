package org.si.dragamina;

import javax.swing.*;

public abstract class Gelaxka {

	private int[][] posizioa;
	protected ImageIcon irudia;
	
	public Gelaxka(int[][] pPosizioa){
		posizioa = pPosizioa;
	}
	
	protected abstract void gelaIreki();{
		
	}
	
	public ImageIcon getIrudia(){
		return irudia;
	}
}
