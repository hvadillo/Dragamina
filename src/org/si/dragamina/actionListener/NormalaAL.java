package org.si.dragamina.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.dragamina.logic.Panela;

public class NormalaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Panela.getPanela().partidaBerria(2);
	}

}
