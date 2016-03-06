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
import java.awt.Point;

public class Leihoa extends JFrame {

	private static Leihoa nLeihoa = null;
	private JMenuBar menuBar;
	private JMenu mnJokoa, mnLaguntza;
	private JMenuItem mntmErraza, mntmNormala, mntmZaila, mntmArgibidea;
	private JButton smileB;
	private JButton[] kasilak ;
	private int zail;
	private JPanel panel;
	
	public Leihoa() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(340, 299);
		//setLocationRelativeTo(null); 
		
		zail = 1;
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnJokoa = new JMenu("Jokoa"){
	        {
	            setSize(55, 33);
	            setMaximumSize(getSize());
	        }
	    };
		menuBar.add(mnJokoa);
		
		mntmErraza = new JMenuItem("Erraza");
		mntmErraza.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(zail!=1){	
					zail = 1;
					Panela.getPanela().panelaEraiki(zail);
				}
				else{
					Panela.getPanela().matrizeaAldatu();
					kasilakItxi();
				}
			}
		});
		mnJokoa.add(mntmErraza);
		
		mntmNormala = new JMenuItem("Normala");
		mntmNormala.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(zail!=2){	
					zail = 2;
					Panela.getPanela().panelaEraiki(zail);
				}
				else{
					Panela.getPanela().matrizeaAldatu();
					kasilakItxi();
				}
			}
		});
		mnJokoa.add(mntmNormala);
		
		mntmZaila = new JMenuItem("Zaila");
		mntmZaila.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(zail!=3){	
					zail = 3;
					Panela.getPanela().panelaEraiki(zail);
				}
				else{
					Panela.getPanela().matrizeaAldatu();
					kasilakItxi();
				}
			}
		});
		mnJokoa.add(mntmZaila);
		
		mnLaguntza = new JMenu("Laguntza"){
	        {
	            setSize(77, 33);
	            setMaximumSize(getSize());
	        }
	    };
		menuBar.add(mnLaguntza);
		
		mntmArgibidea = new JMenuItem("Argibidea");
		mntmArgibidea.addActionListener(new ActionListener()	{
			@Override
			public void actionPerformed(ActionEvent e) {
					//mezu bat bota
			}
		});
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
					Panela.getPanela().matrizeaAldatu();
					kasilakItxi();
			}
		});
		menuBar.add(smileB);
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
			case 1:	setSize(340, 299);
					break;
			case 2:	setSize(510, 408);
					break;
			case 3:	setSize(825, 476);
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
						ImageIcon image = createImageIcon("open.png");
						b1.setIcon(image);
						for( ActionListener al : b1.getActionListeners() ) {	//Action listener erabili ondoren borratu egingo du
							b1.removeActionListener( al );
						}
				}
			});
			kasilak[i] = b1;
			getContentPane().add(kasilak[i]);
		}
	}
	
	private void kasilakItxi(){
		ImageIcon image = createImageIcon("close.png");
		for(int i=0; i<kasilak.length; i++){
			JButton b1 = kasilak[i];
			b1.setIcon(image);
			b1.addActionListener(new ActionListener()	{
				@Override
				public void actionPerformed(ActionEvent e) {
						ImageIcon image = createImageIcon("open.png");
						b1.setIcon(image);
						for( ActionListener al : b1.getActionListeners() ) {	//Action listener erabili ondoren borratu egingo du
							b1.removeActionListener( al );
						}
				}
			});
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