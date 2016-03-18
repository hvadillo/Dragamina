package org.si.dragamina.interf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class KasilenPanela extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private static KasilenPanela nKasilenPanela = null;
	private Kasila[][] botoiak;
		
	private KasilenPanela(){
		setBackground(new Color(250,250,250));
			
		JPanel bereizgarri = new JPanel();								//botoien eta smiley-aren arteko tartea
		bereizgarri.setBackground(new Color(250, 250, 250));
		add(bereizgarri, BorderLayout.NORTH);
	}
	
	public static KasilenPanela getKasilenPanela(){
		if(nKasilenPanela==null){
			nKasilenPanela = new KasilenPanela();
		}
		return nKasilenPanela;
	}
	
	public void kasilakSortu(int pZutabe, int pErrenkada){
		removeAll();
		setLayout(new GridLayout(pErrenkada, pZutabe, 0, 0));
		botoiak = new Kasila[pZutabe][pErrenkada];
		for(int j=0; j<pErrenkada; j++){
			for(int i=0; i<pZutabe; i++){
				botoiak[i][j] = new Kasila(i,j);
				add(botoiak[i][j]);
			}
		}
	}	
		
	public void botoiakItxi(){
		for(int j=0; j<botoiak[0].length; j++){
			for(int i=0; i<botoiak.length; i++){
				botoiak[i][j].itxi();
			}
		}
	}							
	
	public void zenbakiaErakutzi(int pZenb, int pZut, int pErr){
		botoiak[pZut][pErr].kenduMouseListener();		//Mouse listenerra kendu behin kasilan dagoena erakutzita berriro klikatu ez dadin.
		botoiak[pZut][pErr].setIcon(Irudiak.zenbakiak[pZenb]);
	}
	
	public void hutsaErakutzi(int pZut, int pErr){
		if(botoiak[pZut][pErr].getIcon() == Irudiak.bloke[3]){
			Kontadorea.getKontadorea().minaJarri();
		}
		botoiak[pZut][pErr].kenduMouseListener();		//Mouse listenerra kendu behin kasilan dagoena erakutzita berriro klikatu ez dadin.
		botoiak[pZut][pErr].setIcon(Irudiak.bloke[1]);
	}
	
	public void minaErakutzi(int pZut, int pErr){
		botoiak[pZut][pErr].setIcon(Irudiak.bloke[2]);
	}
	
	public void banderaErakutzi(int pZut, int pErr){
		botoiak[pZut][pErr].setIcon(Irudiak.bloke[3]);
	}
	
	public void mouseListenerrakGuztiakKendu(){
		for(int j=0; j<botoiak[0].length; j++){
			for(int i=0; i<botoiak.length; i++){
				botoiak[i][j].kenduMouseListener();
			}
		}
	}
}
