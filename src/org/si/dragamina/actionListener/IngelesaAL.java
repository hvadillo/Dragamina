package org.si.dragamina.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.dragamina.interf.Leihoa;
import org.si.dragamina.interf.Baliabideak.Textua;

public class IngelesaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Textua.ingelesaKargatu();
		Leihoa.getLeihoa().menuaHasieratu();
	}

}
