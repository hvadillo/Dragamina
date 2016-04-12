package org.si.dragamina.logic;

import org.si.dragamina.logic.GelaxkaEgoerak.egoera; 

public class GelaZenbakia extends Gelaxka{

	private int minaInguruan;
	
	public GelaZenbakia(int pX, int pY){
		super(pX, pY);
		minaInguruan = 1;
	}
	
	@Override
	protected void gelaIreki() {
		if(e == egoera.ITXITA || e == egoera.GALDERA){
			e = egoera.ZABALDUA;
			int[] pos = new int[3]; 
			pos[0] = x;
			pos[1] = y;
			pos[2] = minaInguruan;
			setChanged();
			notifyObservers(pos);
		}
	}

	@Override
	public void eguneratu() {
		minaInguruan = minaInguruan + 1;
	}
}
