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
		if(System.getProperty("os.name").equals("Mac OS X")){			//MAC OS-erako dimentzioak
			switch (pZail){
				case 0:System.out.println("aaaa");
						break;
				case 1:	Leihoa.getLeihoa().setSize(330, 309);
						break;
				case 2:	Leihoa.getLeihoa().setSize(495, 408);
						break;
				case 3:	Leihoa.getLeihoa().setSize(825, 474);
			}
		}
		else{	
			if(Toolkit.getDefaultToolkit().getScreenSize().height==1080 && Toolkit.getDefaultToolkit().getScreenSize().height==1080){
				switch (pZail){												//WINDOWS-erako dimentzioak
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
			Leihoa.getLeihoa().setSize(440, 130);
		}
		else{
			if(Toolkit.getDefaultToolkit().getScreenSize().height==1080 && Toolkit.getDefaultToolkit().getScreenSize().height==1080){
				Leihoa.getLeihoa().setSize(300, 150);
			}
			else{
				Leihoa.getLeihoa().setSize(300, 135);
			}
		}
	}
	
	public static Dimension guriBuruzDimentzioak(){
		if(System.getProperty("os.name").equals("Mac OS X")){
			return new Dimension(300, 160);
		}
		else{
			return new Dimension(300, 220);
		}
	}

	
}
