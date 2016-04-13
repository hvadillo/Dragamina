package org.si.dragamina.interf.Baliabideak;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Irudiak {

	public static Icon[] zenbakiak = new Icon[9];
	public static ImageIcon[] smiley = new ImageIcon[5];
	public static ImageIcon[] bloke = new ImageIcon[6];
	public static ImageIcon[] kontadore = new ImageIcon[10];
	public static Image ikonoa; 
	
	public static void kargatu(){
		zenbakiakKargatu();
		smileyKargatu();
		blokeakKargatu();
		kontadoreaKargatu();
		ikonoaKargatu();
	}
	
	private static void zenbakiakKargatu(){
		zenbakiak[0] = null;
		zenbakiak[1] = new ImageIcon("Irudiak/1.png");
		zenbakiak[2] = new ImageIcon("Irudiak/2.png");
		zenbakiak[3] = new ImageIcon("Irudiak/3.png");
		zenbakiak[4] = new ImageIcon("Irudiak/4.png");
		zenbakiak[5] = new ImageIcon("Irudiak/5.png");
		zenbakiak[6] = new ImageIcon("Irudiak/6.png");
		zenbakiak[7] = new ImageIcon("Irudiak/7.png");
		zenbakiak[8] = new ImageIcon("Irudiak/8.png");
	}
	
	private static void smileyKargatu(){
		smiley[0] = new ImageIcon("Irudiak/smile.png");
		smiley[1] = new ImageIcon("Irudiak/win.png");
		smiley[2] = new ImageIcon("Irudiak/loose.png");
		smiley[3] = new ImageIcon("Irudiak/click.png");
		smiley[4] = new ImageIcon("Irudiak/cry.png");
	}
	
	private static void blokeakKargatu(){
		bloke[0] = new ImageIcon("Irudiak/close.png");
		bloke[1] = new ImageIcon("Irudiak/open.png");
		bloke[2] = new ImageIcon("Irudiak/mine.png");
		bloke[3] = new ImageIcon("Irudiak/flag.png");
		bloke[4] = new ImageIcon("Irudiak/think.png");
		bloke[5] = new ImageIcon("Irudiak/noflag.png");
	}
	
	private static void kontadoreaKargatu(){
		kontadore[0] = new ImageIcon("Irudiak/display0.png");
		kontadore[1] = new ImageIcon("Irudiak/display1.png");
		kontadore[2] = new ImageIcon("Irudiak/display2.png");
		kontadore[3] = new ImageIcon("Irudiak/display3.png");
		kontadore[4] = new ImageIcon("Irudiak/display4.png");
		kontadore[5] = new ImageIcon("Irudiak/display5.png");
		kontadore[6] = new ImageIcon("Irudiak/display6.png");
		kontadore[7] = new ImageIcon("Irudiak/display7.png");
		kontadore[8] = new ImageIcon("Irudiak/display8.png");
		kontadore[9] = new ImageIcon("Irudiak/display9.png");
	}
	
	private static void ikonoaKargatu(){
		ImageIcon image = new ImageIcon("Irudiak/icon.png");  	
		ikonoa = image.getImage(); 
	}
}
