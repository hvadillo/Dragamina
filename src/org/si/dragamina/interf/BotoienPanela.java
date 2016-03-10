package org.si.dragamina.interf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class BotoienPanela extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private Kasila[][] botoiak;
		
	public BotoienPanela(){
		setBackground(new Color(250,250,250));
			
		JPanel bereizgarri = new JPanel();								//botoien eta smiley-aren arteko tartea
		bereizgarri.setBackground(new Color(250, 250, 250));
		add(bereizgarri, BorderLayout.NORTH);
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
		botoiak[pZut][pErr].setIcon(Irudiak.zenbakiak[pZenb]);
	}
	
	public void hutsaErakutzi(int zut, int err){
		botoiak[zut][err].setIcon(Irudiak.bloke[1]);
	}
	
	public void minaErakutzi(int x, int y){
		botoiak[x][y].setIcon(Irudiak.bloke[2]);
	}
	
	public void mouseListenerrakKendu(){
		for(int j=0; j<botoiak[0].length; j++){
			for(int i=0; i<botoiak.length; i++){
				botoiak[i][j].kenduMouseListener();
			}
		}
	}
}
