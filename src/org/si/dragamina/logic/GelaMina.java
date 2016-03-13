package org.si.dragamina.logic;

import org.si.dragamina.interf.KasilenPanela;

public class GelaMina extends Gelaxka {
	
	public GelaMina(int x, int y){
		super(x,y);
	}

	@Override
	protected void gelaIreki() {
		KasilenPanela.getKasilenPanela().minaErakutzi(x, y);
		zabaldua = true;
		Panela.getPanela().partidaGaldu();
	}

	@Override
	public void eguneratu() {}	 	//GelaZenbakian bakarrik erabiliko da
}
