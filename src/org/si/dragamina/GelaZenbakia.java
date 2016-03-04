package org.si.dragamina;

public class GelaZenbakia extends Gelaxka{

	private int minaInguruan;
	
	public GelaZenbakia(int pX, int pY){
		super(pX, pY);
	}
	
	private void setIrudiIzena(){
		switch (minaInguruan) {
			case 1:	irudiIzena = "1.png";
					break;
			case 2:	irudiIzena = "2.png";
					break;
			case 3:	irudiIzena = "3.png";
					break;
			case 4:	irudiIzena = "4.png";
					break;
			case 5:	irudiIzena = "5.png";
					break;
			case 6:	irudiIzena = "6.png";
					break;
			case 7:	irudiIzena = "7.png";
					break;
			case 8:	irudiIzena = "8.png";
					break;
		}
	}
	
	@Override
	protected void gelaIreki() {
		zenbakiaErakutzi();
		zabaldua = true;
	}
	
	private void zenbakiaErakutzi(){
		
	}

	@Override
	public void eguneratu() {
		minaInguruan = minaInguruan + 1;
		setIrudiIzena();
	}
}
