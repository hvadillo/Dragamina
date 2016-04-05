package org.si.dragamina.interf;

import java.awt.Color;
import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.si.dragamina.ActionListener.AldatuAL;
import org.si.dragamina.ActionListener.ArgibideaAL;
import org.si.dragamina.ActionListener.ErrazaAL;
import org.si.dragamina.ActionListener.EuskeraAL;
import org.si.dragamina.ActionListener.GaztelaniaAL;
import org.si.dragamina.ActionListener.GuriBuruzAL;
import org.si.dragamina.ActionListener.IngelesaAL;
import org.si.dragamina.ActionListener.IrtenAL;
import org.si.dragamina.ActionListener.NormalaAL;
import org.si.dragamina.ActionListener.ZailaAL;
import org.si.dragamina.interf.Baliabideak.Textua;

public class Menua extends JMenuBar{

	private static final long serialVersionUID = 1L;
	private JMenu mnMenua, mnLaguntza;
	private JMenuItem mntmErraza, mntmNormala, mntmZaila, mntmIrten, mntmAldatu;
	private JMenuItem mntmArgibidea, mntmAboutUs;
	private JMenu mnHizkuntza;
	private JMenuItem mntmEus, mntmIng, mntmGaz;
	
	public Menua(){
		setBorder(null);
		setBackground(new Color(255,255,255));
		
		mnMenua = new JMenu(Textua.menuJokoa);
		mnLaguntza = new JMenu(Textua.menuLaguntza);
		
		mntmErraza = new JMenuItem(Textua.aukErraza);
		mntmErraza.addActionListener(new ErrazaAL());
		mntmNormala = new JMenuItem(Textua.aukNorlama);
		mntmNormala.addActionListener(new NormalaAL());
		mntmZaila = new JMenuItem(Textua.aukZaila);
		mntmZaila.addActionListener(new ZailaAL());
		mntmIrten = new JMenuItem(Textua.aukIrten);
		mntmIrten.addActionListener(new IrtenAL());
		mntmAldatu = new JMenuItem(Textua.aukJokAldatu);
		mntmAldatu.addActionListener(new AldatuAL());
		
		mntmArgibidea = new JMenuItem(Textua.argibidea);
		mntmArgibidea.addActionListener(new ArgibideaAL());
		mntmAboutUs = new JMenuItem(Textua.guriBuruz);
		mntmAboutUs.addActionListener(new GuriBuruzAL());
		mnHizkuntza = new JMenu(Textua.hizkuntza);
		
		mntmEus = new JMenuItem(Textua.euskera);
		mntmEus.addActionListener(new EuskeraAL());
		mntmIng = new JMenuItem(Textua.ingelesa);
		mntmIng.addActionListener(new IngelesaAL());
		mntmGaz = new JMenuItem(Textua.gaztelania);
		mntmGaz.addActionListener(new GaztelaniaAL());
		
		mnMenua.add(mntmErraza);
		mnMenua.add(mntmNormala);
		mnMenua.add(mntmZaila);
		mnMenua.addSeparator();
		mnMenua.add(mntmAldatu);
		mnMenua.addSeparator();
		mnMenua.add(mntmIrten);
		
		mnLaguntza.add(mntmArgibidea);
		mnLaguntza.add(mnHizkuntza);
		
		mnHizkuntza.add(mntmEus);
		mnHizkuntza.add(mntmIng);
		mnHizkuntza.add(mntmGaz);
		
		mnLaguntza.addSeparator();
		mnLaguntza.add(mntmAboutUs);
		
		add(mnMenua);
		add(Box.createHorizontalGlue());
		add(mnLaguntza);
	}	
}
