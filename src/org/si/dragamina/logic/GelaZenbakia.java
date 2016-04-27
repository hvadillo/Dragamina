package org.si.dragamina.logic;

public class GelaZenbakia extends Gelaxka{

	private int minaInguruan;
	
	public GelaZenbakia(int pX, int pY){
		super(pX, pY);
		minaInguruan = 1;
	}
	
	@Override
	protected void gelaIreki() {
		if(getEgoera() == Egoera.ITXITA || getEgoera() == Egoera.GALDERA || getEgoera() == Egoera.BANDERA){
			egoeraAldatu(Egoera.ZABALDUA);
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
