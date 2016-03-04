package org.si.dragamina;

public class GelaMina extends Gelaxka {
	
	public GelaMina(int x, int y){
		super(x,y);
		irudiIzena = "mina.png";
	}

	@Override
	protected void gelaIreki() {
		estanda();
		zabaldua = true;
	}
	
	private void estanda(){
		
	}

	@Override
	public void eguneratu() {
		// TODO Auto-generated method stub
		
	}
}
