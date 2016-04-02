package org.si.dragamina.interf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import org.si.dragamina.logic.Panela;

public class Menua extends JMenuBar implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JMenu mnMenua, mnLaguntza;
	private JMenuItem mntmErraza, mntmNormala, mntmZaila, mntmIrten, mntmAldatu;
	private JMenuItem mntmArgibidea, mntmAboutThis;
	
	public Menua(){
		setBorder(null);
		setBackground(new Color(255,255,255));
		
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
		mntmAldatu = new JMenuItem("Jokalaria aldatu");
		mntmAldatu.addActionListener(this);
		
		mntmArgibidea = new JMenuItem("Argibidea");
		mntmArgibidea.addActionListener(this);
		mntmAboutThis = new JMenuItem("Guri buruz");
		mntmAboutThis.addActionListener(this);
		
		mnMenua.add(mntmErraza);
		mnMenua.add(mntmNormala);
		mnMenua.add(mntmZaila);
		mnMenua.addSeparator();
		mnMenua.add(mntmAldatu);
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
		if(e.getSource() == mntmErraza) Panela.getPanela().panelaEraiki(1);
		else if (e.getSource() == mntmNormala) Panela.getPanela().panelaEraiki(2);
		else if(e.getSource() == mntmZaila) Panela.getPanela().panelaEraiki(3);
		else if (e.getSource() == mntmIrten) Leihoa.getLeihoa().dispose();
		else if (e.getSource() == mntmAldatu){ Leihoa.getLeihoa().jokalariarenIzena();} //TODO
		else if(e.getSource() == mntmArgibidea){
			JDialog guriBuruz  = new JDialog(Leihoa.getLeihoa(),"Argibidea");
			JLabel etiqueta = new JLabel("ARGIBIDEA");
			guriBuruz.getContentPane().add(etiqueta);
			guriBuruz.pack();
			guriBuruz.setLocationRelativeTo(null);
			guriBuruz.setSize(300, 200);
			guriBuruz.setResizable(false);
			guriBuruz.setVisible(true);
		}
		else if (e.getSource() == mntmAboutThis){
			JDialog guriBuruz  = new JDialog(Leihoa.getLeihoa(),"Guri Buruz");
			JLabel etiqueta = new JLabel("LIUV TALDEA");
			guriBuruz.getContentPane().add(etiqueta);
			guriBuruz.pack();
			guriBuruz.setLocationRelativeTo(null);
			guriBuruz.setSize(300, 200);
			guriBuruz.setResizable(false);
			guriBuruz.setVisible(true);
		}
	}
}
