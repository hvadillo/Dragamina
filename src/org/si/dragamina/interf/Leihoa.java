package org.si.dragamina.interf;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import org.si.dragamina.logic.Panela;

public class Leihoa extends JFrame{

	private static final long serialVersionUID = 1L;
	private static Leihoa nLeihoa = null;
	private Menua mnMenua = new Menua();
	private int zail = 1;
	
	
	public Leihoa() {
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
	
	public void leihoaAldatu(int pZail, int pErre, int pZut){			//Leihoen tamaina zailtasunaren arabera
		zail = pZail;
		
		if(System.getProperty("os.name").equals("Mac OS X")){
			switch (zail){
				case 1:	setSize(330, 309);
						break;
				case 2:	setSize(495, 408);
						break;
				case 3:	setSize(825, 474);
			}
		}
		else{
			switch (zail){
			case 1:	setSize(330, 309);
					break;
			case 2:	setSize(495, 408);
					break;
			case 3:	setSize(825, 474);
			}
		}
		setLocationRelativeTo(null); 
		Kontadorea.getKontadorea().partidaBerria(Panela.getPanela().minaKopurua());
		KasilenPanela.getKasilenPanela().kasilakSortu(pZut, pErre);
	}
	
	public int getZailtasuna(){
		return zail;
	}
}