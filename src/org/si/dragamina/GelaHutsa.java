package org.si.dragamina;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

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
