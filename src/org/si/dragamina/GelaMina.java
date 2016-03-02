package org.si.dragamina;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class GelaMina extends Gelaxka {
	
	public GelaMina(int[][] pPosizioa){
		super(pPosizioa);
		try
        {
			irudia = new ImageIcon(ImageIO.read(
	                new URL("https://raw.githubusercontent.com/mercient/Minesweeper/master/mine.png")));  
			Image img = irudia.getImage();
			Image newimg = img.getScaledInstance( 33, 33,  java.awt.Image.SCALE_SMOOTH ) ;  
			irudia = new ImageIcon( newimg );
        }
        catch(MalformedURLException mue)
        {
            mue.printStackTrace();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }       
		
	}

	@Override
	protected void gelaIreki() {
		// TODO Auto-generated method stub
		
	}
}
