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
		if(getEgoera() == egoera.ITXITA || getEgoera() == egoera.GALDERA || getEgoera() == egoera.BANDERA){
			egoeraAldatu(egoera.ZABALDUA);
			int[] pos = new int[3]; 
			pos[0] = getX();
			pos[1] = getY();
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
