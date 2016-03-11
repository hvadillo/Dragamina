package org.si.dragamina.logic;

public abstract class Gelaxka {

	protected int x;
	protected int y;
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
}
