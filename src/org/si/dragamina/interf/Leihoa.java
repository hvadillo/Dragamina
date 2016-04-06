package org.si.dragamina.interf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

import java.util.Observable;
import java.util.Observer;

import org.si.dragamina.interf.Baliabideak.Irudiak;
import org.si.dragamina.interf.Baliabideak.Textua;
import org.si.dragamina.logic.Panela;

public class Leihoa extends JFrame implements Observer{

	private static final long serialVersionUID = 1L;
	private static Leihoa nLeihoa = null;
	private Observable gurePanela;
	private int zail = 0;
	private boolean hasita = false;
	
	public Leihoa() {
		Irudiak.kargatu();
		Textua.kargatu();
		
		setTitle("DRAGAMINA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(Irudiak.ikonoa);
		setBackground(new Color(250, 250, 250));
		
		this.addWindowListener(new WindowAdapter() {					//Leihoa ixtean aterako den mezua
			public void windowClosing(WindowEvent e) {
			    int confirmed = JOptionPane.showConfirmDialog(null, 
			        Textua.itxiTextua, Textua.itxiTextuaIzenburu,
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, Irudiak.smiley[4]);
			    if (confirmed == JOptionPane.YES_OPTION) {
			      dispose();
			    }
			}
		});
	
		gurePanela = Panela.getPanela();
		gurePanela.addObserver(this);
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
	
	public void jokalariarenIzena(){
		zail = 0;
		
		setJMenuBar(null);
		getContentPane().removeAll();
		
		JPanel gPanela = new JPanel();									//Jokalari panela
		//gPanela.setLayout(new GridLayout(3,3,0,0));
		gPanela.setBackground(new Color(250, 250, 250));
		getContentPane().add(gPanela, BorderLayout.CENTER);
		
		JTextField jokIzena = new JTextField();
		jokIzena.setText(Textua.izenaSartu);
		jokIzena.setBounds(0, 0, 50, 50);
		JButton okBotoia = new JButton();
		okBotoia.setText("OK");
		okBotoia.setBounds(0, 0, 10, 10);
		
		ButtonGroup zailTaldea = new ButtonGroup();
		JRadioButton batZail = new JRadioButton("1");
		JRadioButton biZail = new JRadioButton("2");
		JRadioButton hiruZail = new JRadioButton("3");
		zailTaldea.add(batZail);
		zailTaldea.add(biZail);
		zailTaldea.add(hiruZail);
		zailTaldea.setSelected(batZail.getModel(), true);
		
		gPanela.add(jokIzena);
		gPanela.add(batZail);
		gPanela.add(biZail);
		gPanela.add(hiruZail);
		
		gPanela.add(okBotoia);
		
		okBotoia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
				Panela.getPanela().jokalariaSortu(jokIzena.getText());  //Jokalariaren izena pasatu
				getContentPane().remove(gPanela);						//Text field-a borratu
				panelakEraiki();
				leihoaAldatu(autatuZai);
			}
		});
		
		setSize(350, 75);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void panelakEraiki(){
		setJMenuBar(new Menua());											//Menua
		
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
		if(pZail == zail){
			eguneratu();
		}
		else{
			zail = pZail;
			Panela.getPanela().setZailtasuna(zail);
			
			Smiley.getSmiley().setIcon(Irudiak.smiley[0]);				//Hasierako egoeran jarri aurpegia
			Kontadorea.getKontadorea().partidaBerria();					//Hasieratu kontadorea
			Kronometroa.getKronometroa().kronometroaHasieratu();		//Hasieratu kronometroa
			
			Dimentzioak.getDimentzioak().lehioarenDimentzioakAldatu(pZail);
			int[] d = Dimentzioak.getDimentzioak().dimentzioakKalkulatu(pZail);
			KasilenPanela.getKasilenPanela().kasilakSortu(d[1], d[0]);
			
			hasita = false;
			
			setLocationRelativeTo(null);
			setVisible(true);
		}
	}
	
	public void eguneratu(){
		Smiley.getSmiley().setIcon(Irudiak.smiley[0]);				//Hasierako egoeran jarri aurpegia
		Kontadorea.getKontadorea().partidaBerria();					//Hasieratu kontadorea
		Kronometroa.getKronometroa().kronometroaHasieratu();		//Hasieratu kronometroa
		
		KasilenPanela.getKasilenPanela().mouseListenerrakGuztiakKendu();
		KasilenPanela.getKasilenPanela().botoiakItxi();
		hasita = false;
	}
	
	public void menuaHasieratu(){
		setJMenuBar(null);
		setJMenuBar(new Menua());
		setVisible(true);
	}
	
	public boolean partidaHasita(){
		return hasita;
	}
	
	public void partidaHasi(){
		hasita = true;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof Boolean){
			boolean irabaziGaldu = (Boolean) arg;
			if(irabaziGaldu) irabazi();
			else galdu();
		}
		if(arg instanceof String){
			String agindua = (String) arg;
			if(agindua.equals("HASIERA")){
				jokalariarenIzena();
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