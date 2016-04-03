package org.si.dragamina.interf;

import java.awt.Image;
import java.net.URL;
import javax.swing.*;

public class Irudiak {

	public static ImageIcon[] zenbakiak = new ImageIcon[9];
	public static ImageIcon[] smiley = new ImageIcon[5];
	public static ImageIcon[] bloke = new ImageIcon[5];
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
		zenbakiak[1] = createImageIcon("1.png",33,33);
		zenbakiak[2] = createImageIcon("2.png",33,33);
		zenbakiak[3] = createImageIcon("3.png",33,33);
		zenbakiak[4] = createImageIcon("4.png",33,33);
		zenbakiak[5] = createImageIcon("5.png",33,33);
		zenbakiak[6] = createImageIcon("6.png",33,33);
		zenbakiak[7] = createImageIcon("7.png",33,33);
		zenbakiak[8] = createImageIcon("8.png",33,33);
	}
	
	private static void smileyKargatu(){
		smiley[0] = createImageIcon("smile.png", 25,25);
		smiley[1] = createImageIcon("win.png",25,25);
		smiley[2] = createImageIcon("loose.png",25,25);
		smiley[3] = createImageIcon("click.png",25,25);
		smiley[4] = createImageIcon("cry.png",33,33);
	}
	
	private static void blokeakKargatu(){
		bloke[0] = createImageIcon("close.png",33,33);
		bloke[1] = createImageIcon("open.png",33,33);
		bloke[2] = createImageIcon("mine.png",33,33);
		bloke[3] = createImageIcon("flag.png",33,33);
		bloke[4] = createImageIcon("think.png",33,33);
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
		URL r = Irudiak.class.getResource("icon.png");
		ImageIcon image = new ImageIcon(r);  	
		ikonoa = image.getImage(); 
	}
	
	private static ImageIcon createImageIcon(String pHelbideIzena, int pZ, int pA){
		URL r = Irudiak.class.getResource(pHelbideIzena);
		ImageIcon image = new ImageIcon(r);  	
		Image img = image.getImage();
		Image newimg = resize(img, pZ, pA) ;  
		image = new ImageIcon( newimg );
		return image;
	}
	
	private static Image resize(Image pIrudia,int pZabal,int pAlt){
		return pIrudia.getScaledInstance( pZabal, pAlt,  java.awt.Image.SCALE_SMOOTH ) ;  
	}
}
