package org.si.dragamina.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.si.dragamina.interf.Leihoa;

public class AldatuAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Leihoa.getLeihoa().jokalariarenIzena();
	}

}
