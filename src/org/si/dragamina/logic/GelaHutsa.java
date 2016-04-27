package org.si.dragamina.logic;

public class GelaHutsa extends Gelaxka {

	public GelaHutsa(int pX, int pY){
		super(pX,pY);
	}

	@Override
	protected void gelaIreki() {
		if(getEgoera() == Egoera.ITXITA || getEgoera() == Egoera.GALDERA || getEgoera() == Egoera.BANDERA){
			egoeraAldatu(Egoera.ZABALDUA);
			gelaHutsakIreki();
		}
	}
	
	private void gelaHutsakIreki(){
		int x = getX();
		int y = getY();
		
		int[] pos = {x,y};
		
		setChanged();
		notifyObservers(pos);
													//Ondoan dituen gela guztiak zabaldu	
		Panela.getPanela().ireki(x-1, y-1);
		Panela.getPanela().ireki(x-1, y+1);
		Panela.getPanela().ireki(x-1, y);
		Panela.getPanela().ireki(x+1, y-1);
		Panela.getPanela().ireki(x, y-1);			
		Panela.getPanela().ireki(x, y+1);
		Panela.getPanela().ireki(x+1, y+1);
		Panela.getPanela().ireki(x+1, y);
	}

	@Override
	public void eguneratu() {}										//GelaZenbakian bakarrik erabiliko da
}
