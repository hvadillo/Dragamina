package org.si.dragamina.logic;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.si.dragamina.interf.Leihoa;

public abstract class Main {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		
		long startTime = System.nanoTime();
		
		Leihoa.getLeihoa().jokalariarenIzena();
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Ejekuzio denbora " + duration/1000000+"mseg");
	}
}
