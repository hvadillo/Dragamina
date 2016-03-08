package org.si.dragamina;

public class GelaMina extends Gelaxka {
	
	public GelaMina(int x, int y){
		super(x,y);
		mota = "mina";
	}

	@Override
	protected void gelaIreki() {
		if(!zabaldua){
			estanda();
			zabaldua = true;
			Panela.getPanela().partidaGaldu();
		}
		estanda();
	}
	
	private void estanda(){
		Leihoa.getLeihoa().minaErakutzi(x, y);
	}

	@Override
	public void eguneratu() {
		// TODO Auto-generated method stub	
	}
}
