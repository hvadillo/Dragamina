package org.si.dragamina.interf;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.si.dragamina.interf.Baliabideak.Textua;
import org.si.dragamina.logic.Panela;
import org.si.dragamina.salbuespenak.IzenEzEgokia;

public class ErabiltzailePanela extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel izenaLabel;
	private JTextField jokIzena;
	private JButton okBotoia;
	private ButtonGroup zailTaldea;
	private JRadioButton batZail;
	private JRadioButton biZail;
	private JRadioButton hiruZail;

	public ErabiltzailePanela(){
		setLayout(new GridLayout(3,1));
		
		JPanel izenP = new JPanel();
		JPanel zailP = new JPanel();
		JPanel okP = new JPanel();
		
		izenaLabel = new JLabel(Textua.izenaSartu);
		jokIzena = new JTextField();
		jokIzena.setPreferredSize(new Dimension(150,20));
		jokIzena.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (jokIzena.getText().length()>=15){
				     e.consume();
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
		});
		jokIzena.addActionListener(new AbstractAction(){
			private static final long serialVersionUID = 1L;
			@Override
		    public void actionPerformed(ActionEvent e){
		        okeyAkzioa();
		    }
		});
		
		okBotoia = new JButton();
		okBotoia.setText("OK");
		
		zailTaldea = new ButtonGroup();
		batZail = new JRadioButton(Textua.aukErraza);
		biZail = new JRadioButton(Textua.aukNorlama);
		hiruZail = new JRadioButton(Textua.aukZaila);
		
		zailTaldea.add(batZail);
		zailTaldea.add(biZail);
		zailTaldea.add(hiruZail);
		zailTaldea.setSelected(batZail.getModel(), true);
		
		izenP.add(izenaLabel);
		izenP.add(jokIzena);
		
		zailP.add(batZail);
		zailP.add(biZail);
		zailP.add(hiruZail);

		okP.add(okBotoia);
		
		add(izenP);
		add(zailP);
		add(okP);
		
		okBotoia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				okeyAkzioa();
			}
		});
	}
	
	private void okeyAkzioa(){
		String izena = jokIzena.getText();
		try{
			if(izena.contains("---") || izena.contains("###")){
				{throw new IzenEzEgokia(jokIzena);}
			}
			if(!izena.isEmpty()){
				int autatuZai = 1;
				if(batZail.isSelected()){
					autatuZai = 1;
				}
				else if(biZail.isSelected()){
					autatuZai = 2;
				}
				else if(hiruZail.isSelected()){
					autatuZai = 3;
				}
				Panela.getPanela().unekoJokalariaAldatu(jokIzena.getText()); 			 //Jokalariaren izena pasatue
				Leihoa.getLeihoa().panelakEraiki(izena);
				Panela.getPanela().partidaBerria(autatuZai);
			}
			}catch (IzenEzEgokia e){
				e.karaktereEzEgokiakEzabatu();
			}	
	}
}
