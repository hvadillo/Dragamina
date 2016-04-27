package org.si.dragamina.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.dragamina.interf.Leihoa;
import org.si.dragamina.interf.TopLeihoa;

public class IrtenAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		//Leihoa.getLeihoa().dispose();
		//TopLeihoa.getTopLeihoa().dispose();
		System.exit(0);
	}
	
}
