package org.si.dragamina.interf;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.si.dragamina.interf.Baliabideak.Textua;
import org.si.dragamina.logic.Partida;
import org.si.dragamina.logic.TopPartidak;
import org.si.dragamina.salbuespenak.PartidarikEz;

public class TopLeihoa extends JDialog implements Observer{

	private static final long serialVersionUID = 1L;
	private static TopLeihoa nTopLeihoa = null;
	private JTabbedPane tab;
	
	private TopLeihoa(){
		setTitle(Textua.aukTopa);
		TopPartidak.getTopPartidak().addObserver(this);
		JPanel panela = new JPanel(new GridLayout(1, 1));
		tab = new JTabbedPane();
		
		informazioaEguneratu();
	        
	    panela.add(tab);
        add(panela);
		
		pack();
		setLocationRelativeTo(null);
		setSize(400, 400);
		setResizable(false);
	}
	
	public static TopLeihoa getTopLeihoa(){
		if(nTopLeihoa == null){
			nTopLeihoa = new TopLeihoa();
		}
		return nTopLeihoa;
	}
	
	private JPanel topaLortu(int pZail){
		JPanel informazioa = new JPanel(new GridLayout(11,1));
		informazioa.setBackground(new Color(229, 229, 229));
		
		JPanel jokInformazioPanela = new JPanel(new GridLayout(1, 4));
		jokInformazioPanela.add(new JLabel());
		jokInformazioPanela.add(new JLabel(Textua.izena));
		jokInformazioPanela.add(new JLabel(Textua.puntuak));
		jokInformazioPanela.add(new JLabel(Textua.data));
		jokInformazioPanela.setBackground(new Color(229, 229, 229));
		informazioa.add(jokInformazioPanela);
		
		Partida[] p = TopPartidak.getTopPartidak().topaLortu(pZail);
		
		for(int x=0; x<p.length; x++){
			try {
				if(p[x]==null){
					{throw new PartidarikEz();}
				}	
				JPanel jokalariarenPanela = new JPanel(new GridLayout(1, 4));
				Integer pos = x+1;
				jokalariarenPanela.add(new JLabel(pos.toString() + "."));
				jokalariarenPanela.add(new JLabel(p[x].getIzena()));
				Integer punt = p[x].getPuntuak();
				jokalariarenPanela.add(new JLabel(punt.toString()));
				jokalariarenPanela.add(new JLabel(p[x].getData()));
				informazioa.add(jokalariarenPanela);
			} catch (PartidarikEz e) {}	
		}
		return informazioa;
	}
	
	public void informazioaEguneratu(){
		tab.removeAll();
			
		tab.addTab(Textua.aukErraza, topaLortu(0));
		tab.addTab(Textua.aukNorlama, topaLortu(1));
		tab.addTab(Textua.aukZaila, topaLortu(2));
	}

	@Override
	public void update(Observable o, Object arg) {
		informazioaEguneratu();
	}
}
