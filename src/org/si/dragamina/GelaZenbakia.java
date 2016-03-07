package org.si.dragamina;

public class GelaZenbakia extends Gelaxka{

	private int minaInguruan;
	
	public GelaZenbakia(int pX, int pY){
		super(pX, pY);
		minaInguruan = 1;
		mota = "zenbakia";
	}
	
	@Override
	protected void gelaIreki() {
		if(!zabaldua){
			zabaldua = true;
			zenbakiaErakutzi();
		}
	}
	
	private void zenbakiaErakutzi(){
		Leihoa.getLeihoa().zenbakiaPantailaratu(minaInguruan, x, y);
	}

	@Override
	public void eguneratu() {
		minaInguruan = minaInguruan + 1;
	}
}
