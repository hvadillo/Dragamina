package org.si.dragamina.interf;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Dimentzioak{

	private static Dimentzioak nDimentzioak = null;
	
	private Dimentzioak(){
		
	}
	
	public static Dimentzioak getDimentzioak(){
		if(nDimentzioak==null){
			nDimentzioak = new Dimentzioak();
		}
		return nDimentzioak;
	}
	
	public static void lehioarenDimentzioakAldatu(int pZail){
		if(System.getProperty("os.name").equals("Mac OS X")){			//MAC OSX-erako dimentzioak
			switch (pZail){
				case 0:	System.out.println("Hau ez");
						break;
				case 1:	Leihoa.getLeihoa().setSize(330, 309);
						break;
				case 2:	Leihoa.getLeihoa().setSize(495, 408);
						break;
				case 3:	Leihoa.getLeihoa().setSize(825, 474);
			}
		}
		else{	
			if(Toolkit.getDefaultToolkit().getScreenSize().height==1080 && Toolkit.getDefaultToolkit().getScreenSize().width==1920){
				switch (pZail){												//WINDOWS-erako dimentzioak 1920x1080
				case 1:	Leihoa.getLeihoa().setSize(336, 335);
						break;
				case 2:	Leihoa.getLeihoa().setSize(501, 434);
						break;
				case 3:	Leihoa.getLeihoa().setSize(831, 500);
				}
			}
			else{
				switch (pZail){												//WINDOWS-erako dimentzioak
				case 1:	Leihoa.getLeihoa().setSize(336, 325);
						break;
				case 2:	Leihoa.getLeihoa().setSize(501, 424);
						break;
				case 3:	Leihoa.getLeihoa().setSize(831, 491);
				}
			}
		}
	}
	public static void jokalariarenDimentzioak(){
		if(System.getProperty("os.name").equals("Mac OS X")){
			Leihoa.getLeihoa().setSize(440, 130);			//MAC-OSX dimentzioak
		}
		else{
			if(Toolkit.getDefaultToolkit().getScreenSize().height==1080 && Toolkit.getDefaultToolkit().getScreenSize().width==1920){
				Leihoa.getLeihoa().setSize(300, 150);		//WINDOWS-erako dimentzioak 1920x1080
			}
			else{
				Leihoa.getLeihoa().setSize(300, 135);		//WINDOWS-erako dimentzioak
			}
		}
	}
	
	public static Dimension guriBuruzDimentzioak(){
		if(System.getProperty("os.name").equals("Mac OS X")){
			return new Dimension(300, 170);
		}
		else{
			return new Dimension(300, 250);
		}
	}

	public static Dimension ArgibideakDimentzioak(){
		if(System.getProperty("os.name").equals("Mac OS X")){
			return new Dimension(550, 600);
		}
		else{
			return new Dimension(500, 600);
		}
	}
}
