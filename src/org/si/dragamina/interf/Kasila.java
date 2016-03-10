package org.si.dragamina.interf;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import org.si.dragamina.logic.Panela;

public class Kasila extends JButton implements MouseListener {

	private static final long serialVersionUID = 1L;
	private int zutabe;
	private int errenkada;
	
	public Kasila(int pZ, int pE){
		zutabe = pZ;
		errenkada = pE;
		addMouseListener(this);
		setIcon(Irudiak.bloke[0]);
	}
	
	public void itxi(){
		setIcon(Irudiak.bloke[0]);
		addMouseListener(this);
	}
	
	public void kenduMouseListener(){
		removeMouseListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Smiley.getSmiley().setIcon(Irudiak.smiley[3]);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Smiley.getSmiley().setIcon(Irudiak.smiley[0]);
		Panela.getPanela().ireki(zutabe, errenkada);
		removeMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {}		//Ez dugu behar
	
	@Override
	public void mouseEntered(MouseEvent e) {}		//Ez dugu behar

	@Override
	public void mouseExited(MouseEvent e) {}		//Ez dugu behar
}
