package org.si.dragamina;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Smiley.getSmiley().setIcon(Irudiak.smiley[3]);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Panela.getPanela().ireki(zutabe, errenkada);
		Smiley.getSmiley().setIcon(Irudiak.smiley[0]);
		removeMouseListener(this);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
