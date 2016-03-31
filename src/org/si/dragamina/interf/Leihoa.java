package org.si.dragamina.interf;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

import java.util.Observable;
import java.util.Observer;

import org.si.dragamina.logic.Panela;

public class Leihoa extends JFrame implements Observer{

	private static final long serialVersionUID = 1L;
	private static Leihoa nLeihoa = null;
	private Menua mnMenua = new Menua();
	private Observable gurePanela;
	
	public Leihoa() {
		Irudiak.kargatu();
		
		setTitle("DRAGAMINA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(Irudiak.ikonoa);
		setBackground(new Color(250, 250, 250));
		
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
		
		gurePanela = Panela.getPanela();
		gurePanela.addObserver(this);
		
		panelakEraiki();
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
	
	private void panelakEraiki(){
		JPanel gPanela = new JPanel();									//Panel nagusia
		gPanela.setLayout(new GridLayout(1,3,0,0));
		gPanela.setBackground(new Color(250, 250, 250));
		getContentPane().add(gPanela, BorderLayout.NORTH);
		
		JPanel gPanela1 = new JPanel();									//Kontadorerako-rako panela
		gPanela1.setLayout(new FlowLayout(FlowLayout.LEFT));
		gPanela1.setBackground(new Color(250, 250, 250));
		gPanela1.add(Kontadorea.getKontadorea());
		gPanela.add(gPanela1, BorderLayout.WEST);
	
		JPanel gPanela2 = new JPanel();									//Smiley-rako panela
		gPanela2.setLayout(new FlowLayout(FlowLayout.CENTER));
		gPanela2.setBackground(new Color(250, 250, 250));
		gPanela2.add(Smiley.getSmiley());
		gPanela.add(gPanela2, BorderLayout.CENTER);
		
		JPanel gPanela3 = new JPanel();									//Kronometro-rako panela
		gPanela3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		gPanela3.setBackground(new Color(250, 250, 250));
		gPanela3.add(Kronometroa.getKronometroa());
		gPanela.add(gPanela3, BorderLayout.EAST);
		
		getContentPane().add(KasilenPanela.getKasilenPanela(), BorderLayout.CENTER);		//Kasilak gehitu panelean
	}
	
	public void leihoaAldatu(int pZail){			//Leihoen tamaina zailtasunaren arabera	
		Dimentzioak.getDimentzioak().lehioarenDimentzioakAldatu(pZail);
		setLocationRelativeTo(null);
		Kontadorea.getKontadorea().partidaBerria();
		int[] d = Dimentzioak.getDimentzioak().dimentzioakKalkulatu(pZail);
		KasilenPanela.getKasilenPanela().kasilakSortu(d[1], d[0]);
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Boolean){
			boolean irabaziGaldu = (Boolean) arg;
			if(irabaziGaldu) irabazi();
			else galdu();
		}
		else if(arg instanceof String){
			Smiley.getSmiley().setIcon(Irudiak.smiley[0]);				//Hasierako egoeran jarri aurpegia
			Kontadorea.getKontadorea().partidaBerria();					//Hasieratu kontadorea
			Kronometroa.getKronometroa().kronometroaHasieratu();		//Hasieratu kronometroa
			
			String agindua = (String) arg;
			if(agindua.equals("LEIHOA ALDATU")){
				
				leihoaAldatu(Panela.getPanela().getZailtasuna());
			}
			else if(agindua.equals("EGUNERATU")){
				KasilenPanela.getKasilenPanela().mouseListenerrakGuztiakKendu();
				KasilenPanela.getKasilenPanela().botoiakItxi();
			}
		}
	}
	
	public void irabazi(){
		Kronometroa.getKronometroa().kronometroaBukatu();						//Kronometroa gelditu partida bukatzean
		Kontadorea.getKontadorea().irabazi(); 									//Bomba kontadorea 0-n jarri
		Smiley.getSmiley().setIcon(Irudiak.smiley[1]);							//Irabazi smiley-a erakutzi
		KasilenPanela.getKasilenPanela().mouseListenerrakGuztiakKendu();		//Botoien MouseListener kendu
	}
	
	public void galdu(){
		Kronometroa.getKronometroa().kronometroaBukatu();						//Kronometroa gelditu partida bukatzean
		Smiley.getSmiley().setIcon(Irudiak.smiley[2]);							//Galdu "smiley-a" erakutzi
		KasilenPanela.getKasilenPanela().mouseListenerrakGuztiakKendu();		//Botoien MouseListener kendu
	}
}