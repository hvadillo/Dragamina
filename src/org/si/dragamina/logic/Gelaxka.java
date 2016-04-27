package org.si.dragamina.logic;

import java.util.Observable;

import org.si.dragamina.interf.KasilenPanela;

public abstract class Gelaxka extends Observable{
	
	private int x;
	private int y;
	private Egoera e;
	
	public Gelaxka(int pX, int pY){
		addObserver(KasilenPanela.getKasilenPanela());
		x = pX;
		y = pY;
		e = Egoera.ITXITA;
	}
	
	protected abstract void gelaIreki();
	
	protected abstract void eguneratu();
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	protected Egoera getEgoera(){
		return e;
	}
	
	public boolean itxitaDago(){
		if(e.equals(Egoera.ZABALDUA)) return false;
		else return true;
	}
	
	public boolean banderaDu(){
		if(e.equals(Egoera.BANDERA)) return true;
		else return false;
	}
	
	protected void egoeraAldatu(Egoera pEgo){
		e = pEgo;
		eguneratuIrudia();
	}
	
	protected int eskuinKlik(){
		int bueltaSeinalea = 0; //0 ezer aldatu ez bada
		if(e.equals(Egoera.ITXITA)){
			if(MinaKontagailua.getMinaKontagailua().kendu()!=-1){
				e = Egoera.BANDERA;
				bueltaSeinalea = 1; //1 bandera jarri bada
			}
		}
		else if(e.equals(Egoera.BANDERA)){
			MinaKontagailua.getMinaKontagailua().gehitu();
			e = Egoera.GALDERA;
			bueltaSeinalea = -1; //-1 bandera kendu bada
		}
		else if(e.equals(Egoera.GALDERA)){
			e = Egoera.ITXITA;
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
