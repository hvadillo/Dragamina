package org.si.dragamina;

public abstract class Gelaxka {

	protected int x;
	protected int y;
	protected boolean zabaldua;
	protected String mota;
	
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
