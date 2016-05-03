package org.si.dragamina.interf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class JokoarenGoikoPanela extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public JokoarenGoikoPanela(){
		setLayout(new GridLayout(1,3));
		setBackground(new Color(250, 250, 250));
		
		JPanel gPanela1 = new JPanel();									//Kontadorerako-rako panela
		gPanela1.setLayout(new FlowLayout(FlowLayout.LEFT));
		gPanela1.setBackground(new Color(250, 250, 250));
		gPanela1.add(Kontadorea.getKontadorea());
		add(gPanela1, BorderLayout.WEST);
	
		JPanel gPanela2 = new JPanel();									//Smiley-rako panela
		gPanela2.setLayout(new FlowLayout(FlowLayout.CENTER));
		gPanela2.setBackground(new Color(250, 250, 250));
		gPanela2.add(Smiley.getSmiley());
		add(gPanela2, BorderLayout.CENTER);
		
		JPanel gPanela3 = new JPanel();									//Kronometro-rako panela
		gPanela3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		gPanela3.setBackground(new Color(250, 250, 250));
		gPanela3.add(Kronometroa.getKronometroa());
		add(gPanela3, BorderLayout.EAST);
	}
}
