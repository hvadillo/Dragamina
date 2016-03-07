package org.si.dragamina;

import java.awt.Image;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;

public class Leihoa extends JFrame {

	private static Leihoa nLeihoa = null;
	private Menua mnMenua = new Menua();
	private Smiley smileB = new Smiley();
	private JButton[] kasilak ;
	private int zail = 0;
	private JPanel gPanela, bPanela;
	
	public Leihoa() {
		setTitle("DRAGAMINA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Irudiak.smiley[0].getImage());
		
		setJMenuBar(mnMenua);											//Menua
		
		gPanela = new JPanel();											//Smiley-rako panela
		gPanela.setBackground(new Color(250, 250, 250));
		getContentPane().add(gPanela, BorderLayout.NORTH);
		gPanela.add(smileB, BorderLayout.CENTER);
		
		bPanela = new JPanel();											//Botoientzako panela
		bPanela.setBackground(new Color(250, 250, 250));
		getContentPane().add(bPanela, BorderLayout.CENTER);
		
		JPanel bAzpiPanela = new JPanel();								//botoien eta smiley-aren arteko tartea
		bAzpiPanela.setBackground(new Color(250, 250, 250));
		bPanela.add(bAzpiPanela, BorderLayout.NORTH);
	}
	
	public static Leihoa getLeihoa(){
		if(nLeihoa == null){
			try {
				nLeihoa = new Leihoa();			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		return nLeihoa;
	}
	
	public void leihoaAldatu(int pErre, int pZut){
		kasilak = null;
		switch (zail){
			case 1:	setSize(330, 317);
					break;
			case 2:	setSize(495, 416);
					break;
			case 3:	setSize(825, 470);
		}
		setLocationRelativeTo(null); 
		kasilakSortu(pErre,pZut);
	}
	
	private void kasilakSortu(int pErre, int pZut){
		bPanela.removeAll();													//Botoien paneleko elemetu guztiak ezabatu
		bPanela.setLayout(new GridLayout(pErre, pZut, 0, 0));
	
		int kasilaKop = pErre*pZut;
		kasilak = new JButton[kasilaKop];
		for(int i = 0; i < kasilaKop; i++){
			JButton b1 = new JButton();
			b1.setIcon(Irudiak.bloke[0]);
			b1.addActionListener(new ActionListener()	{
				@Override
				public void actionPerformed(ActionEvent e) {
						b1.setIcon(Irudiak.bloke[1]);
						for( ActionListener al : b1.getActionListeners() ) {	//Action listener erabili ondoren borratu egingo du
							b1.removeActionListener( al );
							smileB.aldatu();
						}
				}
			});
			kasilak[i] = b1;
			bPanela.add(kasilak[i]);
		}
	}
	
	public void kasilakItxi(){
		for(int i=0; i<kasilak.length; i++){
			JButton b1 = kasilak[i];
			b1.setIcon(Irudiak.bloke[0]);
			b1.addActionListener(new ActionListener()	{
				@Override
				public void actionPerformed(ActionEvent e) {
						b1.setIcon(Irudiak.bloke[1]);
						for( ActionListener al : b1.getActionListeners() ) {	//Action listener erabili ondoren borratu egingo du
							b1.removeActionListener( al );
						}
				}
			});
		}
	}
	
	public int getZailtasuna(){
		return zail;
	}
	
	public void setZailtasuna(int pZail){
		zail = pZail;
	}
	
	private ImageIcon createImageIcon(String pHelbideIzena){
		URL r = Leihoa.class.getResource(pHelbideIzena);
		ImageIcon image = new ImageIcon(r);  	
		Image img = image.getImage();
		Image newimg = img.getScaledInstance( 33, 33,  java.awt.Image.SCALE_SMOOTH ) ;  
		image = new ImageIcon( newimg );
		return image;
	}
}