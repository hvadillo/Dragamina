package org.si.dragamina;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Smiley extends JButton{

	private Smiley nSmiley;
	
	public Smiley(){
		setBorder(BorderFactory.createEmptyBorder());
		setContentAreaFilled(false);
		setSize(33, 33);
		setMaximumSize(getSize());
		setIcon(Irudiak.smiley[0]);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
		    	Panela.getPanela().matrizeaEguneratu();
		    }
		});
	}
	
	public void aldatu(){
		if(getIcon() == Irudiak.smiley[1]){
			setIcon(Irudiak.smiley[0]);
		}
		else{
			setIcon(Irudiak.smiley[1]);
		}
		
	}
}
