package org.si.dragamina.interf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import org.si.dragamina.interf.Baliabideak.Irudiak;
import org.si.dragamina.logic.GelaHutsa;
import org.si.dragamina.logic.GelaMina;
import org.si.dragamina.logic.GelaZenbakia;
import org.si.dragamina.logic.GelaxkaEgoerak.egoera;

public class KasilenPanela extends JPanel implements Observer{
	
	private static final long serialVersionUID = 1L;
	private static KasilenPanela nKasilenPanela = null;
	private Kasila[][] botoiak;
		
	private KasilenPanela(){
		setBackground(new Color(0,250,250));
			
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
		
	public void kasilakHasieratu(){
		for(int j=0; j<botoiak[0].length; j++){
			for(int i=0; i<botoiak.length; i++){
				botoiak[i][j].kenduMouseListener();
				botoiak[i][j].itxi();
			}
		}
	}		
	
	public void mouseListenerrakGuztiakKendu(){
		for(int j=0; j<botoiak[0].length; j++){
			for(int i=0; i<botoiak.length; i++){
				botoiak[i][j].kenduMouseListener();
			}
		}
	}		

	@Override
	public void update(Observable o, Object arg) {
		if(arg instanceof int[]){
			int[] pos = (int[]) arg;
			if(o instanceof GelaMina){
				botoiak[pos[0]][pos[1]].setIcon(Irudiak.bloke[2]);
			}
			else if(o instanceof GelaHutsa){
				botoiak[pos[0]][pos[1]].setIcon(Irudiak.bloke[1]);
			}
			else if(o instanceof GelaZenbakia){
				botoiak[pos[0]][pos[1]].setIcon(Irudiak.zenbakiak[pos[2]]);
			}
			botoiak[pos[0]][pos[1]].kenduMouseListener();
		}
		else if(arg instanceof Object[]){
			Object[] obj = (Object[]) arg;
			egoera e = (egoera) obj[0];
			int x = (Integer) obj[1];
			int y = (Integer)obj[2];
			switch (e) {
			case BANDERA: 	botoiak[x][y].setIcon(Irudiak.bloke[3]);
					break;
			case GALDERA: 	botoiak[x][y].setIcon(Irudiak.bloke[4]);
					break;
			case ITXITA: 	botoiak[x][y].setIcon(Irudiak.bloke[0]);
					break;
			case MINA: 		botoiak[x][y].setIcon(Irudiak.bloke[2]);
					break;
			case EZBANDERA:	botoiak[x][y].setIcon(Irudiak.bloke[5]);
				break;
			default:
				break;
			}
		}
	}
}
