package org.si.dragamina.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.dragamina.interf.Leihoa;
import org.si.dragamina.interf.Baliabideak.Textua;

public class EuskeraAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Textua.euskeraKargatu();
		Leihoa.getLeihoa().menuaHasieratu();
	}

}
