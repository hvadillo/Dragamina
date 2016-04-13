package org.si.dragamina.interf;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import org.si.dragamina.interf.Baliabideak.Irudiak;
import org.si.dragamina.logic.Panela;

public class Kasila extends JButton implements MouseListener{
	
	private static final long serialVersionUID = 1L;
	private int zutabe;
	private int errenkada;
	
	public Kasila(int pZ, int pE){
		setBorder(BorderFactory.createEmptyBorder());
		setFocusPainted(false);
		setBorder(null);
		setContentAreaFilled(false);
		zutabe = pZ;
		errenkada = pE;
		addMouseListener(this);
		setIcon(Irudiak.bloke[0]);
	}
	
	public void itxi(){
		addMouseListener(this);
		setIcon(Irudiak.bloke[0]);
	}
	
	public void kenduMouseListener(){
		removeMouseListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(!getIcon().equals(Irudiak.bloke[3])){			//Bandera ez badago aldatu smiley-a
			if(e.getButton() == MouseEvent.BUTTON1){
				Smiley.getSmiley().setIcon(Irudiak.smiley[3]);
			}
		}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Smiley.getSmiley().setIcon(Irudiak.smiley[0]);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1){
			Panela.getPanela().klikEgin(zutabe, errenkada);
		}
		else{													//ESKUMAKO BOTOIA
			Panela.getPanela().eskuinKlika(zutabe, errenkada);
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {}		//Ez dugu behar

	@Override
	public void mouseExited(MouseEvent e) {}		//Ez dugu behar
}
