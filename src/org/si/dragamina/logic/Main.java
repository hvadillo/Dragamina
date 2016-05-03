package org.si.dragamina.logic;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.si.dragamina.interf.Leihoa;

public abstract class Main {
	
	public static void main(String[] args) {
		try {											//PROGRAMAREN ESTILO GRAFIKOA ALDATU
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
		
		Leihoa.getLeihoa().jokalariarenIzena();
	}
}
