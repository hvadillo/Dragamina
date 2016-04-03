package org.si.dragamina.interf;

public class Textua {
	
	public static String izenaSartu;
	public static String menuJokoa, menuLaguntza;
	public static String aukErraza, aukNorlama, aukZaila, aukJokAldatu, aukIrten;
	public static String argibidea, guriBuruz, hizkuntza;
	public static String itxiTextua, itxiTextuaIzenburu;
	public static String euskera, ingelesa, gaztelania;
	
	public static void kargatu(){
		if(System.getProperty("user.language").equals("eu") || System.getProperty("user.language").equals("es")){
			euskeraKargatu();
		}
		else{
			ingelesaKargatu();
		}
	}
	
	public static void euskeraKargatu(){
		izenaSartu = "Zure izena sartu";
		
		menuJokoa = "Jokoa";
		menuLaguntza = "Laguntza";
		
		aukErraza = "Erraza";
		aukNorlama = "Normala";
		aukZaila = "Zaila";
		aukJokAldatu = "Jokalaria aldatu";
		aukIrten = "Irten";
		
		argibidea = "Argibidea";
		guriBuruz = "Guri buruz";
		hizkuntza = "Hizkuntza aldatu";
		
		euskera = "Euskera";
		ingelesa = "Ingelesa";
		gaztelania = "Gaztelania";
		
		itxiTextua = "Ziur zaude DRAGAMINAtik irten nahi duzula?";
		itxiTextuaIzenburu = "DRAGAMINA ITXI";
	}
	
	public static void gaztelaniaKargatu(){
		izenaSartu = "Tu nombre";
		
		menuJokoa = "Juego";
		menuLaguntza = "Ayuda";
		
		aukErraza = "Fácil";
		aukNorlama = "Normal";
		aukZaila = "Difícil";
		aukJokAldatu = "Cambiar jugador";
		aukIrten = "Salir";
		
		argibidea = "Como jugar";
		guriBuruz = "Sobre nosotros";
		hizkuntza = "Cambiar idioma";
		
		euskera = "Euskera";
		ingelesa = "Ingles";
		gaztelania = "Castellano";
		
		itxiTextua = "Estas seguro que quieres cerrar DRAGAMINA?";
		itxiTextuaIzenburu = "CERRAR DRAGAMINA";
	}
	
	public static void ingelesaKargatu(){
		izenaSartu = "Your name";
		
		menuJokoa = "Game";
		menuLaguntza = "Help";
		
		aukErraza = "Easy";
		aukNorlama = "Normal";
		aukZaila = "Difficult";
		aukJokAldatu = "Switch player";
		aukIrten = "Quit";
		
		argibidea = "Hint";
		guriBuruz = "About us";
		hizkuntza = "Switch language";
		
		euskera = "Basque";
		ingelesa = "English";
		gaztelania = "Spanish";
		
		itxiTextua = "Are you sure you want to quit DRAGAMINA?";
		itxiTextuaIzenburu = "QUIT DRAGAMINA";
	}
}
