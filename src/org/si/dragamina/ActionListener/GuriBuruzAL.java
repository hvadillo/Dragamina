package org.si.dragamina.ActionListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import org.si.dragamina.interf.Dimentzioak;
import org.si.dragamina.interf.Leihoa;
import org.si.dragamina.interf.Baliabideak.Textua;

public class GuriBuruzAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog guriBuruz  = new JDialog(Leihoa.getLeihoa(), Textua.guriBuruz);
		JPanel p = new JPanel(new BorderLayout());
		
		JTextPane textua = new JTextPane();
		textua.setContentType("text/html");
		textua.setText(Textua.guriburuzTextua);
		textua.setEditable(false);
		
		
		JTextPane url = new JTextPane();
		url.setContentType("text/html");
		url.setText(Textua.url);
		url.addMouseListener(new UrlAL());
		url.setEditable(false);
		
		p.add(textua,BorderLayout.NORTH);
		p.add(url,BorderLayout.CENTER);
		
		guriBuruz.getContentPane().add(p);
		guriBuruz.pack();
		guriBuruz.setLocationRelativeTo(null);
		guriBuruz.setSize(Dimentzioak.guriBuruzDimentzioak());
		guriBuruz.setResizable(false);
		guriBuruz.setVisible(true);
	}

}
