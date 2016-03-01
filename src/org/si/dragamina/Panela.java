package org.si.dragamina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panela{
	
	public void setBoard(){
		JFrame frame = new JFrame();
	    frame.add(addCells());
	
	    frame.pack();
	    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
		public JPanel addCells(){
	    JPanel panel = new JPanel(new GridLayout(10,10));
	    return panel;
	}
}
