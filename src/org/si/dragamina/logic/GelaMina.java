package org.si.dragamina.logic;

import org.si.dragamina.logic.GelaxkaEgoerak.egoera;

public class GelaMina extends Gelaxka {
	
	public GelaMina(int x, int y){
		super(x,y);
	}

	@Override
	protected void gelaIreki() {
		if(e == egoera.ITXITA){
			e = egoera.ZABALDUA;
			int[] pos = new int[2]; 
			pos[0] = x;
			pos[1] = y;
			setChanged();
			notifyObservers(pos);
			Panela.getPanela().partidaGaldu();
		}
	}

	@Override
	public void eguneratu() {}	 	//GelaZenbakian bakarrik erabiliko da
}
