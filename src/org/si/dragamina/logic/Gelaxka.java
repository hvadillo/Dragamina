package org.si.dragamina.logic;

import java.util.Observable;

import org.si.dragamina.interf.KasilenPanela;
import org.si.dragamina.logic.GelaxkaEgoerak.egoera;

public abstract class Gelaxka extends Observable{
	
	protected int x;
	protected int y;
	protected egoera e;
	
	public Gelaxka(int pX, int pY){
		addObserver(KasilenPanela.getKasilenPanela());
		x = pX;
		y = pY;
		e = egoera.ITXITA;
	}
	
	protected abstract void gelaIreki();
	
	protected abstract void eguneratu();
}
