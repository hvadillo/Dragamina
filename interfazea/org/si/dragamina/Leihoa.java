package org.si.dragamina;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;
import javax.swing.JButton;

public class Leihoa extends JFrame {

	private static Leihoa nLeihoa = null;
	private JMenuBar menuBar;
	private JMenu mnJokoa, mnLaguntza;
	private JMenuItem mntmErraza, mntmNormala, mntmZaila, mntmArgibidea;
	private JButton smileB;
	private JButton[] kasilak ;
	private int zail;
	
	public Leihoa() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 340, 299);
		setLocationRelativeTo(null); 
		
		zail = 1;
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnJokoa = new JMenu("Jokoa"){
	        {
	            setSize(55, 20);
	            setMaximumSize(getSize());
	        }
	    };
		menuBar.add(mnJokoa);
		
		mntmErraza = new JMenuItem("Erraza");
		mntmErraza.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
					zail = 1;
					Panela.getPanela().panelaEraiki(zail);
			}
		});
		mnJokoa.add(mntmErraza);
		
		mntmNormala = new JMenuItem("Normala");
		mntmNormala.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
					zail = 2;
					Panela.getPanela().panelaEraiki(zail);
			}
		});
		mnJokoa.add(mntmNormala);
		
		mntmZaila = new JMenuItem("Zaila");
		mntmZaila.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
					zail = 3;
					Panela.getPanela().panelaEraiki(zail);
			}
		});
		mnJokoa.add(mntmZaila);
		
		mnLaguntza = new JMenu("Laguntza"){
	        {
	            setSize(77, 20);
	            setMaximumSize(getSize());
	        }
	    };
		menuBar.add(mnLaguntza);
		
		mntmArgibidea = new JMenuItem("Argibidea");
		/*mntmArgibidea.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
					//mezu bat bota
			}
		});*/
		mnLaguntza.add(mntmArgibidea);
		
		smileB = new JButton(){
	        {
	            setSize(33, 33);
	            setMaximumSize(getSize());
	        }
	    };
		smileB.setIcon(createImageIcon("smile.png"));
		smileB.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
					Panela.getPanela().panelaEraiki(zail);
			}
		});
		menuBar.add(smileB);

		kasilakSortu(7,10);
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
			case 1:	setBounds(0, 0, 340, 299);
					break;
			case 2:	setBounds(0, 0, 510, 408);
					break;
			case 3:	setBounds(0, 0, 825, 476);
		}
		setLocationRelativeTo(null); 
		kasilakSortu(pErre,pZut);
	}
	
	private void kasilakSortu(int pErre, int pZut){
		getContentPane().removeAll();
		getContentPane().setLayout(new GridLayout(pErre, pZut, 0, 0));
		int kasilaKop = pErre*pZut;
		kasilak = new JButton[kasilaKop];
		for(int i = 0; i < kasilaKop; i++){
			JButton b1 = new JButton();
			b1.setIcon(createImageIcon("close.png"));
			b1.addActionListener(new ActionListener()	{
				@Override
				public void actionPerformed(ActionEvent e) {
						//String iIzen = m.gelaIreki(xPos, yPos);
						ImageIcon image = createImageIcon("3.png");
						b1.setIcon(image);
					
				}
			});
			kasilak[i] = b1;
			getContentPane().add(kasilak[i]);
		}
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

