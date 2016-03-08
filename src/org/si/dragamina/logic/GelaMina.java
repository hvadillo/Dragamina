package org.si.dragamina.logic;

import org.si.dragamina.interf.Leihoa;

public class GelaMina extends Gelaxka {
	
	public GelaMina(int x, int y){
		super(x,y);
		mota = "mina";
	}

	@Override
	protected void gelaIreki() {
		Leihoa.getLeihoa().minaErakutzi(x, y);
		if(!zabaldua){
			zabaldua = true;
			Panela.getPanela().partidaGaldu();
		}
	}

	@Override
	public void eguneratu() {}			//GelaZenbakian bakarrik erabiliko da
}
