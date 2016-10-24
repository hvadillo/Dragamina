package org.si.dragamina.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import org.si.dragamina.interf.Dimentzioak;
import org.si.dragamina.interf.Leihoa;
import org.si.dragamina.interf.Baliabideak.Textua;

public class ArgibideaAL implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog p = new JDialog(Leihoa.getLeihoa(), Textua.argibidea);
		
		JTextPane textua = new JTextPane();
		textua.setContentType("text/html");
      	textua.setText(Textua.argibideaTextua);
      	textua.setEditable(false);
		
        JScrollPane scrollPane = new JScrollPane(textua, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(0,0,0,0);
        
        p.add(scrollPane);
        p.setResizable(true);
        p.setSize(Dimentzioak.ArgibideakDimentzioak());
        p.setLocationRelativeTo(Leihoa.getLeihoa());
        p.setVisible(true);
	}
}
