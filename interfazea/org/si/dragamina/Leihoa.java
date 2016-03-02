package org.si.dragamina;

import java.awt.EventQueue;
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
import javax.imageio.*;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JButton;

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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 276);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//JMenu menu = new JMenu("");
		//menuBar.add(menu);
		
		JMenu mnJokoa = new JMenu("Jokoa");
		menuBar.add(mnJokoa);
		
		JMenuItem mntmErraza = new JMenuItem("Erraza");
		mnJokoa.add(mntmErraza);
		
		JMenuItem mntmNormala = new JMenuItem("Normala");
		mnJokoa.add(mntmNormala);
		
		JMenuItem mntmZaila = new JMenuItem("Zaila");
		mnJokoa.add(mntmZaila);
		
		JMenu mnLaguntza = new JMenu("Laguntza");
		menuBar.add(mnLaguntza);
		
		JMenuItem mntmArgibidea = new JMenuItem("Argibidea");
		mnLaguntza.add(mntmArgibidea);
		
		JButton button = new JButton(":)");
		menuBar.add(button);
		
		getContentPane().setLayout(new GridLayout(7, 10, 0, 0));
		for(int i = 70; i > 0; i--){
			JButton b1 = new JButton();
			b1.addActionListener(new ActionListener()	{
				@Override
				public void actionPerformed(ActionEvent e) {
					try
			        {
						ImageIcon image = new ImageIcon(ImageIO.read(
			                    new URL("https://raw.githubusercontent.com/mercient/Minesweeper/master/1.png")));  	
						Image img = image.getImage();
						Image newimg = img.getScaledInstance( 33, 33,  java.awt.Image.SCALE_SMOOTH ) ;  
						image = new ImageIcon( newimg );
						b1.setIcon(image);
			        }
			        catch(MalformedURLException mue)
			        {
			            mue.printStackTrace();
			        }
			        catch(IOException ioe)
			        {
			            ioe.printStackTrace();
			        }       
					Panela.getPanela().ireki();
				}
			});
			getContentPane().add(b1);
		}
	}

}

