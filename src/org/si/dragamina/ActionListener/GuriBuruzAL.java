package org.si.dragamina.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import org.si.dragamina.interf.Leihoa;

public class GuriBuruzAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog guriBuruz  = new JDialog(Leihoa.getLeihoa(),"Guri Buruz");
		JLabel etiqueta = new JLabel("LIUV TALDEA");
		guriBuruz.getContentPane().add(etiqueta);
		guriBuruz.pack();
		guriBuruz.setLocationRelativeTo(null);
		guriBuruz.setSize(300, 200);
		guriBuruz.setResizable(false);
		guriBuruz.setVisible(true);
	}

}
