package org.si.dragamina;

public class GelaHutsa extends Gelaxka {

	public GelaHutsa(int pX, int pY){
		super(pX,pY);
		mota = "hutsa";
	}

	@Override
	protected void gelaIreki() {
		if(!zabaldua){
			zabaldua = true;
			gelaHutsakIreki();
		}
	}
	
	private void gelaHutsakIreki(){
		Leihoa.getLeihoa().hutsaPantailaratu(x, y);
		Panela.getPanela().ireki(x, y-1);
		Panela.getPanela().ireki(x, y+1);
		Panela.getPanela().ireki(x+1, y-1);
		Panela.getPanela().ireki(x+1, y+1);
		Panela.getPanela().ireki(x-1, y-1);
		Panela.getPanela().ireki(x-1, y+1);
		Panela.getPanela().ireki(x+1, y);
		Panela.getPanela().ireki(x-1, y);
	}

	@Override
	public void eguneratu() {
		// TODO Auto-generated method stub
		
	}
}
