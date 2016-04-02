package org.si.dragamina.interf;

import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

public class Kronometroa extends JPanel{

	private static final long serialVersionUID = 1L;
	private static Kronometroa nKronometroa = null;
	private Timer chronometer;
	private int denbora;
	private JLabel[] zenbakiak = new JLabel[3];

	private Kronometroa() {
		chronometer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				denbora++;
				eguneratu();
			}
		});
		setBackground(new Color(250, 250, 250));
		GridLayout g = new GridLayout(1, 3, 0, 0);
		setLayout(g);
		KronometroaEraiki();
		denbora = 0;
	}
	
	public static Kronometroa getKronometroa(){
		if(nKronometroa==null){
			nKronometroa = new Kronometroa();
		}
		return nKronometroa;
	}
	
	private void KronometroaEraiki() {
		for(int i=0; i<zenbakiak.length; i++) {
			zenbakiak[i] = new JLabel();
			//zenbakiak[i].setMargin(new Insets(0, 0, 0, 0));
			zenbakiak[i].setPreferredSize(new Dimension(13, 23));
			zenbakiak[i].setIcon(Irudiak.kontadore[0]);
			add(zenbakiak[i]);
		}
		eguneratu();
	}
	
	public void kronometroaHasieratu(){
		chronometer.stop();
		denbora = 0;
		eguneratu();
	}
	
	public void kronometroaHasi(){
		chronometer.start();
	}
	
	public void kronometroaBukatu(){
		chronometer.stop();
		eguneratu();
	}
	
	private void eguneratu(){
		if(denbora<=999){
			zenbakiak[0].setIcon(Irudiak.kontadore[(int)Math.round(denbora)/100]);
			zenbakiak[1].setIcon(Irudiak.kontadore[((int)Math.round(denbora)/10)%10]);
			zenbakiak[2].setIcon(Irudiak.kontadore[(int)Math.round(denbora)%10]);
		}
		else{
			zenbakiak[0].setIcon(Irudiak.kontadore[9]);
			zenbakiak[1].setIcon(Irudiak.kontadore[9]);
			zenbakiak[2].setIcon(Irudiak.kontadore[9]);
		}
		
	}
}
