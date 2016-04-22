package org.si.dragamina.logic;

import java.util.Observable;

import org.si.dragamina.interf.KasilenPanela;
import org.si.dragamina.logic.GelaxkaEgoerak.egoera;

public abstract class Gelaxka extends Observable{
	
	private int x;
	private int y;
	private egoera e;
	
	public Gelaxka(int pX, int pY){
		addObserver(KasilenPanela.getKasilenPanela());
		x = pX;
		y = pY;
		e = egoera.ITXITA;
	}
	
	protected abstract void gelaIreki();
	
	protected abstract void eguneratu();
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	protected egoera getEgoera(){
		return e;
	}
	
	public boolean itxitaDago(){
		if(e.equals(egoera.ZABALDUA)) return false;
		else return true;
	}
	
	public boolean banderaDu(){
		if(e.equals(egoera.BANDERA)) return true;
		else return false;
	}
	
	protected void egoeraAldatu(egoera pEgo){
		e = pEgo;
		eguneratuIrudia();
	}
	
	protected int eskuinKlik(){
		int bueltaSeinalea = 0; //0 ezer aldatu ez bada
		if(e.equals(egoera.ITXITA)){
			if(MinaKontagailua.getMinaKontagailua().kendu()!=-1){
				e = egoera.BANDERA;
				bueltaSeinalea = 1; //1 bandera jarri bada
			}
		}
		else if(e.equals(egoera.BANDERA)){
			MinaKontagailua.getMinaKontagailua().gehitu();
			e = egoera.GALDERA;
			bueltaSeinalea = -1; //-1 bandera kendu bada
		}
		else if(e.equals(egoera.GALDERA)){
			e = egoera.ITXITA;
		}
		eguneratuIrudia();
		return bueltaSeinalea;
	}
	
	private void eguneratuIrudia(){
		Object[] n = {e, x, y};
		setChanged();
		notifyObservers(n);
	}
}
