package org.si.dragamina.ActionListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import org.si.dragamina.interf.Leihoa;
import org.si.dragamina.interf.Baliabideak.Textua;

public class ArgibideaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog argibidea  = new JDialog(Leihoa.getLeihoa(), Textua.argibidea);
		JPanel p = new JPanel(new BorderLayout());
		
		JTextPane textua = new JTextPane();
		textua.setContentType("text/html");
		textua.setText(Textua.argibideaTextua);
		textua.setEditable(false);
		
		p.add(textua,BorderLayout.CENTER);
		
		argibidea.getContentPane().add(p);
		argibidea.pack();
		argibidea.setLocationRelativeTo(null);
		argibidea.setSize(300, 160);
		argibidea.setResizable(false);
		argibidea.setVisible(true);
	}
}
