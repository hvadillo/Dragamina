package org.si.dragamina.interf;

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
	
	public void lehioarenDimentzioakAldatu(int pZail){
		if(System.getProperty("os.name").equals("Mac OS X")){			//MAC OS-erako dimentzioak
			switch (pZail){
				case 0:Leihoa.getLeihoa().setSize(200, 100);
						break;
				case 1:	Leihoa.getLeihoa().setSize(330, 309);
						break;
				case 2:	Leihoa.getLeihoa().setSize(495, 408);
						break;
				case 3:	Leihoa.getLeihoa().setSize(825, 474);
			}
		}
		else{
			switch (pZail){												//WINDOWS-erako dimentzioak
			case 1:	Leihoa.getLeihoa().setSize(372, 357);
					break;
			case 2:	Leihoa.getLeihoa().setSize(547, 462);
					break;
			case 3:	Leihoa.getLeihoa().setSize(897, 532);
			}
		}
	}
	
	public int[] dimentzioakKalkulatu(int pZ){
		int[] dim = new int[2];
		switch (pZ) {
			case 1: dim[0] = 7;
					dim[1] = 10;
					break;
			case 2: dim[0] = 10;
					dim[1] = 15;
					break;
			case 3: dim[0] = 12;
					dim[1] = 25;
					break;
		}
		return dim;
	}
	
}
