package org.si.dragamina;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Smiley extends JButton{
	
	private static final long serialVersionUID = 1L;
	private static Smiley nSmiley;
	
	private Smiley(){
		setBorder(BorderFactory.createEmptyBorder());
		setContentAreaFilled(false);
		setSize(33, 33);
		setMaximumSize(getSize());
		setIcon(Irudiak.smiley[0]);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setIcon(Irudiak.smiley[0]);
		    	Panela.getPanela().matrizeaEguneratu();
		    }
		});
	}
	
	public static Smiley getSmiley(){
		if(nSmiley==null){
			nSmiley = new Smiley();
		}
		return nSmiley;
	}
}
