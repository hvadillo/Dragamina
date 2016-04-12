package org.si.dragamina.logic;

import org.si.dragamina.logic.GelaxkaEgoerak.egoera;

public class GelaHutsa extends Gelaxka {

	public GelaHutsa(int pX, int pY){
		super(pX,pY);
	}

	@Override
	protected void gelaIreki() {
		if(e == egoera.ITXITA || e == egoera.GALDERA || e == egoera.BANDERA){
			e = egoera.ZABALDUA;
			gelaHutsakIreki();
		}
	}
	
	private void gelaHutsakIreki(){
		int[] pos = new int[2]; 
		pos[0] = x;
		pos[1] = y;
		setChanged();
		notifyObservers(pos);
		Panela.getPanela().ireki(x, y-1);							//Ondoan dituen gela guztiak zabaldu		
		Panela.getPanela().ireki(x, y+1);
		Panela.getPanela().ireki(x+1, y-1);
		Panela.getPanela().ireki(x+1, y+1);
		Panela.getPanela().ireki(x-1, y-1);
		Panela.getPanela().ireki(x-1, y+1);
		Panela.getPanela().ireki(x+1, y);
		Panela.getPanela().ireki(x-1, y);
	}

	@Override
	public void eguneratu() {}										//GelaZenbakian bakarrik erabiliko da
}
