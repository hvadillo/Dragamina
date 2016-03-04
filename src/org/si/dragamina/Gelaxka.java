package org.si.dragamina;

import javax.swing.*;

public abstract class Gelaxka {

	protected int x;
	protected int y;
	protected String irudiIzena;
	protected boolean zabaldua;
	
	public Gelaxka(int pX, int pY){
		x = pX;
		y = pY;
		zabaldua = false;
	}
	
	protected abstract void gelaIreki();{
		
	}
	
	protected abstract void eguneratu();{
		
	}
	
	protected String getIrudia(){
		return irudiIzena;
	}
}
