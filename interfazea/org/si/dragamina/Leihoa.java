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
import java.util.Random;

import javax.swing.*;
import javax.swing.JButton;

public class Leihoa extends JFrame {

	private static Leihoa nLeihoa=null;
	private JMenuBar menuBar;
	private JMenu mnJokoa, mnLaguntza;
	private JMenuItem mntmErraza, mntmNormala, mntmZaila, mntmArgibidea;
	private JButton smileB;
	private JButton[] kasilak ;

	/*public static void main(String[] args) {
		
	}*/
	
	public Leihoa() {
		MatrizeGelaxka m = new MatrizeGelaxka(1);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 276);
		
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
		mnJokoa.add(mntmErraza);
		
		mntmNormala = new JMenuItem("Normala");
		mnJokoa.add(mntmNormala);
		
		mntmZaila = new JMenuItem("Zaila");
		mnJokoa.add(mntmZaila);
		
		mnLaguntza = new JMenu("Laguntza"){
	        {
	            setSize(77, 20);
	            setMaximumSize(getSize());
	        }
	    };
		menuBar.add(mnLaguntza);
		
		mntmArgibidea = new JMenuItem("Argibidea");
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
					Panela.getPanela().panelaEraiki(1);
			}
		});
		menuBar.add(smileB);
		
		getContentPane().setLayout(new GridLayout(7, 10, 0, 0));
		int kasilaKop=70;
		kasilak = new JButton[kasilaKop+1];
		for(int i = kasilaKop; i > 0; i--){
			JButton b1 = new JButton();
			b1.setIcon(createImageIcon("close.png"));
			b1.addActionListener(new ActionListener()	{
				@Override
				public void actionPerformed(ActionEvent e) {
						Random rand = new Random();
						int xPos = rand.nextInt(7);
						int yPos = rand.nextInt(10);
						String iIzen = m.gelaIreki(xPos, yPos);
						ImageIcon image = createImageIcon(iIzen);
						b1.setIcon(image);
						//Panela.getPanela().ireki();
				}
			});
			kasilak[i] = b1;
			getContentPane().add(kasilak[i]);
		}
	}
	
	public static Leihoa getLeihoa(){
		if(nLeihoa==null){
			try {
				nLeihoa = new Leihoa();			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return nLeihoa;
	}
	
	private void kailakSortu(){
		
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

