package org.si.dragamina.logic;

import java.util.Observable;

import org.si.dragamina.logic.Egoera.e;

public abstract class Gelaxka extends Observable{
	
	protected int x;
	protected int y;
	protected boolean zabaldua;
	//private Egoera egoera;
	
	public Gelaxka(int pX, int pY){
		x = pX;
		y = pY;
		//egoera = e.ITXITA;
		zabaldua = false;
	}
	
	protected abstract void gelaIreki();
	
	protected abstract void eguneratu();
}
