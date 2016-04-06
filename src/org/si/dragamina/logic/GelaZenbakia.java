package org.si.dragamina.logic;

import org.si.dragamina.interf.KasilenPanela;
import org.si.dragamina.logic.GelaxkaEgoerak.egoera; 

public class GelaZenbakia extends Gelaxka{

	private int minaInguruan;
	
	public GelaZenbakia(int pX, int pY){
		super(pX, pY);
		minaInguruan = 1;
	}
	
	@Override
	protected void gelaIreki() {
		if(e == egoera.ITXITA){
			e = egoera.ZABALDUA;
			zabaldua = true;
			KasilenPanela.getKasilenPanela().zenbakiaErakutzi(minaInguruan, x, y);		//Zenbakia pantailaratu
		}
	}

	@Override
	public void eguneratu() {
		minaInguruan = minaInguruan + 1;
	}
}
