package org.si.dragamina.interf;

import javax.swing.JPanel;

import org.si.dragamina.interf.Baliabideak.Irudiak;
import org.si.dragamina.logic.Denbora;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import java.awt.Color;
import java.awt.Dimension;

public class Kronometroa extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	private static Kronometroa nKronometroa = null;
	private JLabel[] zenbakiak = new JLabel[3];

	private Kronometroa() {
		Denbora.getDenbora().addObserver(this);
		setBackground(new Color(250, 250, 250));
		GridLayout g = new GridLayout(1, 3, 0, 5);
		setLayout(g);
		KronometroaEraiki();
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
			zenbakiak[i].setPreferredSize(new Dimension(13, 23));
			zenbakiak[i].setIcon(Irudiak.kontadore[0]);
			add(zenbakiak[i]);
		}
	}
	
	private void eguneratu(int pDenbora){
		if(pDenbora<=999){
			zenbakiak[0].setIcon(Irudiak.kontadore[(int)Math.round(pDenbora)/100]);
			zenbakiak[1].setIcon(Irudiak.kontadore[((int)Math.round(pDenbora)/10)%10]);
			zenbakiak[2].setIcon(Irudiak.kontadore[(int)Math.round(pDenbora)%10]);
		}
		else{
			zenbakiak[0].setIcon(Irudiak.kontadore[9]);
			zenbakiak[1].setIcon(Irudiak.kontadore[9]);
			zenbakiak[2].setIcon(Irudiak.kontadore[9]);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		eguneratu((int) arg);
	}
}
