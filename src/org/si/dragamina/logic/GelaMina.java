package org.si.dragamina.logic;

public class GelaMina extends Gelaxka {
	
	public GelaMina(int x, int y){
		super(x,y);
	}

	@Override
	protected void gelaIreki() {
		if(getEgoera() == Egoera.ITXITA || getEgoera() == Egoera.GALDERA || getEgoera() == Egoera.BANDERA){
			egoeraAldatu(Egoera.ZABALDUA);
			int[] pos = new int[2]; 
			pos[0] = getX();
			pos[1] = getY();
			setChanged();
			notifyObservers(pos);
			Panela.getPanela().partidaGaldu();
		}
	}

	@Override
	public void eguneratu() {}	 	//GelaZenbakian bakarrik erabiliko da
}
