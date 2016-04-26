package org.si.dragamina.ActionListener;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import org.si.dragamina.interf.Leihoa;
import org.si.dragamina.interf.Baliabideak.Textua;

public class ArgibideaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog argibidea  = new JDialog(Leihoa.getLeihoa(), Textua.argibidea);
		JPanel p = new JPanel();
		
		JTextPane textua = new JTextPane();
		textua.setContentType("text/html");
		textua.setText(Textua.argibideaTextua);
		textua.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(textua);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		p.add(scroll);
		
		argibidea.getContentPane().setLayout(new BorderLayout());
		argibidea.getContentPane().add(p, BorderLayout.CENTER);
		//argibidea.getContentPane().add(scroll, BorderLayout.EAST);
		argibidea.pack();
		argibidea.setLocationRelativeTo(null);
		argibidea.setSize(450, 500);
		argibidea.setResizable(false);
		argibidea.setVisible(true);
	}
}
