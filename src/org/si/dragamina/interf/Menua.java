package org.si.dragamina.interf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.si.dragamina.logic.Panela;

public class Menua extends JMenuBar implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JMenu mnMenua, mnLaguntza;
	private JMenuItem mntmErraza, mntmNormala, mntmZaila, mntmIrten;
	private JMenuItem mntmArgibidea, mntmAboutThis;
	
	public Menua(){
		setBorder(null);
		
		mnMenua = new JMenu("Jokoa");
		mnLaguntza = new JMenu("Laguntza");
		
		mntmErraza = new JMenuItem("Erraza");
		mntmErraza.addActionListener(this);
		mntmNormala = new JMenuItem("Normala");
		mntmNormala.addActionListener(this);
		mntmZaila = new JMenuItem("Zaila");
		mntmZaila.addActionListener(this);
		mntmIrten = new JMenuItem("Irten");
		mntmIrten.addActionListener(this);
		
		mntmArgibidea = new JMenuItem("Argibidea");
		mntmAboutThis = new JMenuItem("About This");
		
		mnMenua.add(mntmErraza);
		mnMenua.add(mntmNormala);
		mnMenua.add(mntmZaila);
		mnMenua.addSeparator();
		mnMenua.add(mntmIrten);
		
		mnLaguntza.add(mntmArgibidea);
		mnLaguntza.addSeparator();
		mnLaguntza.add(mntmAboutThis);
		
		this.add(mnMenua);
		this.add(Box.createHorizontalGlue());
		this.add(mnLaguntza);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mntmErraza){
			if(Leihoa.getLeihoa().getZailtasuna()==1) Panela.getPanela().matrizeaEguneratu();
			else Panela.getPanela().panelaEraiki(1);
		}
		else if (e.getSource() == mntmNormala){
			if(Leihoa.getLeihoa().getZailtasuna()==2) Panela.getPanela().matrizeaEguneratu();
			else Panela.getPanela().panelaEraiki(2);
		}
		else if(e.getSource() == mntmZaila){
			if(Leihoa.getLeihoa().getZailtasuna()==3) Panela.getPanela().matrizeaEguneratu();
			else Panela.getPanela().panelaEraiki(3);
		}
		else if (e.getSource() == mntmIrten){
			/*int confirmed = JOptionPane.showConfirmDialog(null, 
			        "Are you sure you want to exit the program?", "DRAGAMINA ITXI",
			        JOptionPane.YES_NO_OPTION);

			    if (confirmed == JOptionPane.YES_OPTION) {
			    	Leihoa.getLeihoa().dispose();
			    }*/
		}
		else if(e.getSource() == mntmArgibidea){
			
		}
		else if (e.getSource() == mntmAboutThis){
			
		}
	}

}
