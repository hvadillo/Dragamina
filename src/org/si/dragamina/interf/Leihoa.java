package org.si.dragamina.interf;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

import java.util.Observable;
import java.util.Observer;

import org.si.dragamina.interf.Baliabideak.Irudiak;
import org.si.dragamina.interf.Baliabideak.Textua;
import org.si.dragamina.logic.Panela;

public class Leihoa extends JFrame implements Observer{

	private static final long serialVersionUID = 1L;
	private static Leihoa nLeihoa = null;
	
	public Leihoa() {
		Irudiak.kargatu();
		Textua.kargatu();
		
		Kronometroa.getKronometroa();
		
		setTitle("DRAGAMINA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(Irudiak.ikonoa);
		setBackground(new Color(250, 250, 250));
		
		this.addWindowListener(new WindowAdapter() {					//Leihoa ixtean aterako den mezua
			public void windowClosing(WindowEvent e) {
			    int confirmed = JOptionPane.showConfirmDialog(null, 
			        Textua.itxiTextua, Textua.itxiTextuaIzenburu,
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, Irudiak.smiley[4]);
			    if (confirmed == JOptionPane.YES_OPTION) {
			    	//TopLeihoa.getTopLeihoa().dispose();
			    	//dispose();
			    	System.exit(0);
			    }
			}
		});
		Panela.getPanela().addObserver(this);
	}
	
	public static Leihoa getLeihoa(){
		if(nLeihoa == null){
			try {
				nLeihoa = new Leihoa();			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		return nLeihoa;
	}
	
	public void jokalariarenIzena(){
		setJMenuBar(null);
		getContentPane().removeAll();
		getContentPane().add(new ErabiltzailePanela(), BorderLayout.CENTER);
		Dimentzioak.jokalariarenDimentzioak();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void panelakEraiki(String pErabiltzaile){
		getContentPane().removeAll();
		setJMenuBar(new Menua(pErabiltzaile));											//Menua
		
		getContentPane().add(new JokoarenGoikoPanela(), BorderLayout.NORTH);			//Goiko panela (Smiley, kontadorea, kronometroa)
		
		getContentPane().add(KasilenPanela.getKasilenPanela(), BorderLayout.CENTER);	//Kasilak gehitu panelean
		setVisible(true);
	}
	
	public void leihoaAldatu(int pZail){							//Leihoen tamaina zailtasunaren arabera	
		Smiley.getSmiley().setIcon(Irudiak.smiley[0]);				//Hasierako egoeran jarri aurpegia
	
		Dimentzioak.lehioarenDimentzioakAldatu(pZail);
		int[] d = Panela.getPanela().dimentzioakKalkulatu(pZail);
		KasilenPanela.getKasilenPanela().kasilakSortu(d[1], d[0]);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void eguneratu(){
		Smiley.getSmiley().setIcon(Irudiak.smiley[0]);				//Hasierako egoeran jarri aurpegia
		KasilenPanela.getKasilenPanela().kasilakHasieratu();
	}
	
	public void menuaHasieratu(){
		setJMenuBar(null);
		setJMenuBar(new Menua(Panela.getPanela().jokalariIzenaLortu()));
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Boolean){
			boolean irabaziGaldu = (Boolean) arg;
			if(irabaziGaldu) irabazi();
			else galdu();
		}
		if(arg instanceof Integer){
			Integer z = (Integer) arg;
			if(z==0){
				eguneratu();
			}
			else{
				leihoaAldatu(z.intValue());
			}
		}
	}
	
	public void irabazi(){
		Smiley.getSmiley().setIcon(Irudiak.smiley[1]);							//Irabazi smiley-a erakutzi
		KasilenPanela.getKasilenPanela().mouseListenerrakGuztiakKendu();		//Botoien MouseListener kendu
	}
	
	public void galdu(){
		Smiley.getSmiley().setIcon(Irudiak.smiley[2]);							//Galdu "smiley-a" erakutzi
		KasilenPanela.getKasilenPanela().mouseListenerrakGuztiakKendu();		//Botoien MouseListener kendu
	}
}