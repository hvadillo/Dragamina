package org.si.dragamina.salbuespenak;

import javax.swing.JTextField;

public class IzenEzEgokia extends Exception{

	private static final long serialVersionUID = 1L;
	private JTextField jokIzena;

	public IzenEzEgokia(JTextField pJI){
		super();
		jokIzena = pJI;
	}
	
	public void karaktereEzEgokiakEzabatu(){
		String t = jokIzena.getText();
		jokIzena.setText(t.replace("---", ""));
		t = jokIzena.getText();
		jokIzena.setText(t.replace("###", ""));
	}
	
}
