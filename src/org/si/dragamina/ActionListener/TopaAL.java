package org.si.dragamina.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.dragamina.interf.TopLeihoa;

public class TopaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		TopLeihoa.getTopLeihoa().informazioaEguneratu();
		TopLeihoa.getTopLeihoa().setVisible(true);
	}
}
