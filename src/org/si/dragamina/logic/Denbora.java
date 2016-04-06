package org.si.dragamina.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.Timer;

public class Denbora extends Observable{

	private static Denbora nDenbora = null;
	private Timer chronometer;
	private int denbora;
	
	private Denbora(){
		chronometer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				denbora++;
				setChanged();
				notifyObservers(denbora);
			}
		});
	}
	
	public static Denbora getDenbora(){
		if(nDenbora==null){
			nDenbora = new Denbora();
		}
		return nDenbora;
	}
	
	public void hasieratu(){
		chronometer.stop();
		denbora = 0;
		setChanged();
		notifyObservers(denbora);
	}
	
	public void hasi(){
		System.out.println();
		chronometer.start();
		setChanged();
		notifyObservers(denbora);
	}
	
	public int gelditu(){
		chronometer.stop();
		setChanged();
		notifyObservers(denbora);
		return denbora;
	}
}
