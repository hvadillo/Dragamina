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
	
	protected void egoeraAldatu(egoera pEgo){
		e = pEgo;
		eguneratuIrudia();
	}
	
	protected void eskuinKlik(){
		if(e.equals(egoera.ITXITA)){
			if(MinaKontagailua.getMinaKontagailua().kendu()!=-1){
				e = egoera.BANDERA;
			}
		}
		else if(e.equals(egoera.BANDERA)){
			MinaKontagailua.getMinaKontagailua().gehitu();
			e = egoera.GALDERA;
		}
		else if(e.equals(egoera.GALDERA)){
			e = egoera.ITXITA;
		}
		eguneratuIrudia();
	}
	
	private void eguneratuIrudia(){
		Object[] n = {e, x, y};
		setChanged();
		notifyObservers(n);
	}
}
