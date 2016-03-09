package org.si.dragamina.interf;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;

public class Leihoa extends JFrame{

	private static final long serialVersionUID = 1L;
	private static Leihoa nLeihoa = null;
	private Menua mnMenua = new Menua();
	private int zail;
	private JPanel gPanela;
	private BotoienPanela botoiak = new BotoienPanela();
	
	public Leihoa() {
		setTitle("DRAGAMINA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(Irudiak.ikonoa);
		
		this.addWindowListener(new WindowAdapter() {					//Leihoa ixtean aterako den mezua
			  public void windowClosing(WindowEvent e) {
			    int confirmed = JOptionPane.showConfirmDialog(null, 
			        "Ziur zaude DRAGAMINAtik irten nahi duzula?", "DRAGAMINA ITXI",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, Irudiak.smiley[4]);

			    if (confirmed == JOptionPane.YES_OPTION) {
			      dispose();
			    }
			  }
			});
		
		setJMenuBar(mnMenua);											//Menua
		
		gPanela = new JPanel();											//Smiley-rako panela
		gPanela.setBackground(new Color(250, 250, 250));
		getContentPane().add(gPanela, BorderLayout.NORTH);
		gPanela.add(Smiley.getSmiley(), BorderLayout.CENTER);
		
		getContentPane().add(botoiak, BorderLayout.CENTER);
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
	
	public void leihoaAldatu(int pZail, int pErre, int pZut){			//Leihoen tamaina zailtasunaren arabera
		zail = pZail;
		switch (zail){
			case 1:	setSize(330, 317);
					break;
			case 2:	setSize(495, 416);
					break;
			case 3:	setSize(825, 470);
		}
		setLocationRelativeTo(null); 
		botoiak.kasilakSortu(pZut, pErre);
	}
	
	public void kasilakItxi(){
		botoiak.botoiakItxi();
	}
	
	public void zenbakiaPantailaratu(int pZenb, int pZut, int pErr){
		botoiak.zenbakiaErakutzi(pZenb, pZut, pErr);
	}
	
	public void hutsaPantailaratu(int zut, int err){
		botoiak.hutsaErakutzi(zut, err);
	}
	
	public int getZailtasuna(){
		return zail;
	}

	public void minaErakutzi(int x, int y) {
		botoiak.minaErakutzi(x, y);
	}
	
	/*public void irabazitakoMinak(int x, int y){
		botoiak.irabazitakoMinak(x, y);
	}*/
	
	public void galdu(){
		botoiak.galdu();
	}
	
	/*public void irabazi(){
		botoiak.irabazi();
	}*/
}