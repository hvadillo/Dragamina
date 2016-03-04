package org.si.dragamina;

public class GelaHutsa extends Gelaxka {

	public GelaHutsa(int pX, int pY){
		super(pX,pY);
		irudiIzena = "0.png";
	}

	@Override
	protected void gelaIreki() {
		gelaHutsakIreki();
		zabaldua = true;
	}
	
	private void gelaHutsakIreki(){
		
	}

	@Override
	public void eguneratu() {
		// TODO Auto-generated method stub
		
	}
}
