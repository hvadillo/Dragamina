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
		zenbakiak[1] = new ImageIcon(Irudiak.class.getResource("1.png"));
		zenbakiak[2] = new ImageIcon(Irudiak.class.getResource("2.png"));
		zenbakiak[3] = new ImageIcon(Irudiak.class.getResource("3.png"));
		zenbakiak[4] = new ImageIcon(Irudiak.class.getResource("4.png"));
		zenbakiak[5] = new ImageIcon(Irudiak.class.getResource("5.png"));
		zenbakiak[6] = new ImageIcon(Irudiak.class.getResource("6.png"));
		zenbakiak[7] = new ImageIcon(Irudiak.class.getResource("7.png"));
		zenbakiak[8] = new ImageIcon(Irudiak.class.getResource("8.png"));
	}
	
	private static void smileyKargatu(){
		smiley[0] = new ImageIcon(Irudiak.class.getResource("smile.png"));
		smiley[1] = new ImageIcon(Irudiak.class.getResource("win.png"));
		smiley[2] = new ImageIcon(Irudiak.class.getResource("loose.png"));
		smiley[3] = new ImageIcon(Irudiak.class.getResource("click.png"));
		smiley[4] = new ImageIcon(Irudiak.class.getResource("cry.png"));
	}
	
	private static void blokeakKargatu(){
		bloke[0] = new ImageIcon(Irudiak.class.getResource("close.png"));
		bloke[1] = new ImageIcon(Irudiak.class.getResource("open.png"));
		bloke[2] = new ImageIcon(Irudiak.class.getResource("mine.png"));
		bloke[3] = new ImageIcon(Irudiak.class.getResource("flag.png"));
		bloke[4] = new ImageIcon(Irudiak.class.getResource("think.png"));
		bloke[5] = new ImageIcon(Irudiak.class.getResource("noflag.png"));
	}
	
	private static void kontadoreaKargatu(){
		kontadore[0] = new ImageIcon(Irudiak.class.getResource("display0.png"));
		kontadore[1] = new ImageIcon(Irudiak.class.getResource("display1.png"));
		kontadore[2] = new ImageIcon(Irudiak.class.getResource("display2.png"));
		kontadore[3] = new ImageIcon(Irudiak.class.getResource("display3.png"));
		kontadore[4] = new ImageIcon(Irudiak.class.getResource("display4.png"));
		kontadore[5] = new ImageIcon(Irudiak.class.getResource("display5.png"));
		kontadore[6] = new ImageIcon(Irudiak.class.getResource("display6.png"));
		kontadore[7] = new ImageIcon(Irudiak.class.getResource("display7.png"));
		kontadore[8] = new ImageIcon(Irudiak.class.getResource("display8.png"));
		kontadore[9] = new ImageIcon(Irudiak.class.getResource("display9.png"));
	}
	
	private static void ikonoaKargatu(){
		ImageIcon image = new ImageIcon(Irudiak.class.getResource("icon.png"));	
		ikonoa = image.getImage(); 
	}
}
