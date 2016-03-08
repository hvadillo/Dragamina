package org.si.dragamina.interf;

import java.awt.Image;
import java.net.URL;

import javax.swing.*;

public class Irudiak {

	public static ImageIcon[] zenbakiak = new ImageIcon[9];
	public static ImageIcon[] smiley = new ImageIcon[4];
	public static ImageIcon[] bloke = new ImageIcon[5];
	public static Image ikonoa; 
	
	public static void kargatu(){
		zenbakiakKargatu();
		smileyKargatu();
		blokeakKargatu();
		ikonoaKargatu();
	}
	
	private static void zenbakiakKargatu(){
		zenbakiak[0] = null;
		zenbakiak[1] = createImageIcon("1.png");
		zenbakiak[2] = createImageIcon("2.png");
		zenbakiak[3] = createImageIcon("3.png");
		zenbakiak[4] = createImageIcon("4.png");
		zenbakiak[5] = createImageIcon("5.png");
		zenbakiak[6] = createImageIcon("6.png");
		zenbakiak[7] = createImageIcon("7.png");
		zenbakiak[8] = createImageIcon("8.png");
	}
	
	private static void smileyKargatu(){
		smiley[0] = createImageIcon("smile.png");
		smiley[1] = createImageIcon("win.png");
		smiley[2] = createImageIcon("loose.png");
		smiley[3] = createImageIcon("click.png");
	}
	
	private static void blokeakKargatu(){
		bloke[0] = createImageIcon("close.png");
		bloke[1] = createImageIcon("open.png");
		bloke[2] = createImageIcon("mine.png");
		bloke[3] = createImageIcon("flag.png");
		bloke[4] = createImageIcon("think.png");
	}
	
	private static void ikonoaKargatu(){
		URL r = Irudiak.class.getResource("icon.png");
		ImageIcon image = new ImageIcon(r);  	
		ikonoa = image.getImage(); 
	}

	private static ImageIcon createImageIcon(String pHelbideIzena){
		URL r = Irudiak.class.getResource(pHelbideIzena);
		ImageIcon image = new ImageIcon(r);  	
		Image img = image.getImage();
		Image newimg = img.getScaledInstance( 33, 33,  java.awt.Image.SCALE_SMOOTH ) ;  
		image = new ImageIcon( newimg );
		return image;
	}
}
