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

public class Menua extends JMenuBar implements ActionListener{

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
		mntmErraza.addActionListener(this);
		mntmNormala = new JMenuItem(Textua.aukNorlama);
		mntmNormala.addActionListener(this);
		mntmZaila = new JMenuItem(Textua.aukZaila);
		mntmZaila.addActionListener(this);
		mntmIrten = new JMenuItem(Textua.aukIrten);
		mntmIrten.addActionListener(this);
		mntmAldatu = new JMenuItem(Textua.aukJokAldatu);
		mntmAldatu.addActionListener(this);
		
		mntmArgibidea = new JMenuItem(Textua.argibidea);
		mntmArgibidea.addActionListener(this);
		mntmAboutUs = new JMenuItem(Textua.guriBuruz);
		mntmAboutUs.addActionListener(this);
		mnHizkuntza = new JMenu(Textua.hizkuntza);
		mnHizkuntza.addActionListener(this);
		
		mntmEus = new JMenuItem(Textua.euskera);
		mntmEus.addActionListener(this);
		mntmIng = new JMenuItem(Textua.ingelesa);
		mntmIng.addActionListener(this);
		mntmGaz = new JMenuItem(Textua.gaztelania);
		mntmGaz.addActionListener(this);
		
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
		
		this.add(mnMenua);
		this.add(Box.createHorizontalGlue());
		this.add(mnLaguntza);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mntmErraza) Leihoa.getLeihoa().leihoaAldatu(1); 
		else if (e.getSource() == mntmNormala) Leihoa.getLeihoa().leihoaAldatu(2); 
		else if(e.getSource() == mntmZaila) Leihoa.getLeihoa().leihoaAldatu(3);
		else if (e.getSource() == mntmIrten) Leihoa.getLeihoa().dispose();
		else if (e.getSource() == mntmAldatu) Leihoa.getLeihoa().jokalariarenIzena();
		else if (e.getSource() == mntmEus){
			Textua.euskeraKargatu();
			Leihoa.getLeihoa().menuaHasieratu();
		}
		else if (e.getSource() == mntmIng){
			Textua.ingelesaKargatu();
			Leihoa.getLeihoa().menuaHasieratu();
		}
		else if (e.getSource() == mntmGaz){
			Textua.gaztelaniaKargatu();
			Leihoa.getLeihoa().menuaHasieratu();
		}
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
		else if (e.getSource() == mntmAboutUs){
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
