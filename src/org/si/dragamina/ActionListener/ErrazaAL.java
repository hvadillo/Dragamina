package org.si.dragamina.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.dragamina.logic.Panela;

public class ErrazaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Panela.getPanela().partidaBerria(1);
	}

}
