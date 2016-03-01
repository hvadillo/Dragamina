package org.si.dragamina;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

public class Leihoa extends JFrame {
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Leihoa frame = new Leihoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Leihoa() {
		int x=12;int y=25;
		getContentPane().setLayout(new GridLayout(x, y));
		
		int size = x*y;
		for(int i=0; i<size; i++){
			JButton b1 = new JButton();
			getContentPane().add(b1);
		}
	}

}
