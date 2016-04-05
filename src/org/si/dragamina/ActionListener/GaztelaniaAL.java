package org.si.dragamina.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.dragamina.interf.Leihoa;
import org.si.dragamina.interf.Baliabideak.Textua;

public class GaztelaniaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Textua.gaztelaniaKargatu();
		Leihoa.getLeihoa().menuaHasieratu();
	}

}
