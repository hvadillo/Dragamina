package org.si.dragamina.logic;

import org.si.dragamina.interf.KasilenPanela;

public class GelaHutsa extends Gelaxka {

	public GelaHutsa(int pX, int pY){
		super(pX,pY);
	}

	@Override
	protected void gelaIreki() {
		zabaldua = true;
		gelaHutsakIreki();
	}
	
	private void gelaHutsakIreki(){
		KasilenPanela.getKasilenPanela().hutsaErakutzi(x, y);		//Gela hau bera zabaldu
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
