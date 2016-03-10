package org.si.dragamina.interf;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

public class Kontadorea extends JPanel {

	private static final long serialVersionUID = 1L;
	private static Kontadorea nKontadorea = null;
	private JButton[] zenbakiak = new JButton[3];
	private int minakFaltan;

	private Kontadorea() {
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
			zenbakiak[i] = new JButton();
			zenbakiak[i].setMargin(new Insets(0, 0, 0, 0));
			zenbakiak[i].setPreferredSize(new Dimension(13, 23));
			zenbakiak[i].setIcon(Irudiak.kontadore[0]);
			add(zenbakiak[i]);
		}
		eguneratu();
	}
	
	public void partidaBerria(int pMinak){
		minakFaltan=pMinak;
		eguneratu();
	}
	
	public void minaKendu(){
		minakFaltan--;
		eguneratu();
	}
	
	public void minaJarri(){
		minakFaltan++;
		eguneratu();
	}
	
	public void irabazi(){
		minakFaltan = 0;
		eguneratu();
	}
	
	private void eguneratu(){
		zenbakiak[0].setIcon(Irudiak.kontadore[minakFaltan/100]);
		zenbakiak[1].setIcon(Irudiak.kontadore[(minakFaltan/10)%10]);
		zenbakiak[2].setIcon(Irudiak.kontadore[minakFaltan%10]);
	}
}