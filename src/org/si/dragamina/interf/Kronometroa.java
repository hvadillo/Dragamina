package org.si.dragamina.interf;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

public class Kronometroa extends JPanel {

	private static final long serialVersionUID = 1L;
	private static Kronometroa nKronometroa = null;
	private JButton[] zenbakiak = new JButton[3];

	private Kronometroa() {
		setBackground(new Color(250, 250, 250));
		GridLayout g = new GridLayout(1, 3, 0, 0);
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
			zenbakiak[i] = new JButton();
			zenbakiak[i].setMargin(new Insets(0, 0, 0, 0));
			zenbakiak[i].setPreferredSize(new Dimension(13, 23));
			zenbakiak[i].setIcon(Irudiak.kontadore[0]);
			add(zenbakiak[i]);
		}
		eguneratu();
	}
	
	private void eguneratu(){
		zenbakiak[0].setIcon(Irudiak.kontadore[0]);
		zenbakiak[1].setIcon(Irudiak.kontadore[0]);
		zenbakiak[2].setIcon(Irudiak.kontadore[0]);
	}
}
