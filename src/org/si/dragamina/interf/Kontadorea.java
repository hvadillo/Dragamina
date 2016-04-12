package org.si.dragamina.interf;

import javax.swing.JPanel;

import org.si.dragamina.interf.Baliabideak.Irudiak;
import org.si.dragamina.logic.MinaKontagailua;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;
import java.awt.Color;
import java.awt.Dimension;

public class Kontadorea extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	private static Kontadorea nKontadorea = null;
	private JLabel[] zenbakiak = new JLabel[3];

	private Kontadorea() {
		MinaKontagailua.getMinaKontagailua().addObserver(this);
		setBackground(new Color(250, 250, 250));
		GridLayout g = new GridLayout(1, 3, 0, 0);
		setLayout(g);
		kontadoreaEraiki();
	}
	
	public static Kontadorea getKontadorea(){
		if(nKontadorea==null){
			nKontadorea = new Kontadorea();
		}
		return nKontadorea;
	}
	
	private void kontadoreaEraiki() {
		for(int i=0; i<zenbakiak.length; i++) {
			zenbakiak[i] = new JLabel();
			zenbakiak[i].setPreferredSize(new Dimension(13, 23));
			zenbakiak[i].setIcon(Irudiak.kontadore[0]);
			add(zenbakiak[i]);
		}
	}
	
	private void eguneratu(int pMinak){
		zenbakiak[0].setIcon(Irudiak.kontadore[pMinak/100]);
		zenbakiak[1].setIcon(Irudiak.kontadore[(pMinak/10)%10]);
		zenbakiak[2].setIcon(Irudiak.kontadore[pMinak%10]);
	}

	@Override
	public void update(Observable o, Object arg) {
		eguneratu((int) arg);
	}
}
