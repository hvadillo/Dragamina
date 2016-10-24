package org.si.dragamina.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.dragamina.logic.Panela;

public class ZailaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Panela.getPanela().partidaBerria(3);
	}

}
