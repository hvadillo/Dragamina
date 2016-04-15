package org.si.dragamina.interf.Baliabideak;

public class Textua {
	
	public static String izenaSartu;
	public static String menuJokoa, menuLaguntza;
	public static String aukErraza, aukNorlama, aukZaila, aukJokAldatu, aukIrten;
	public static String argibidea, guriBuruz, hizkuntza;
	public static String itxiTextua, itxiTextuaIzenburu;
	public static String euskera, ingelesa, gaztelania;
	public static String guriburuzTextua, argibideaTextua;
	public static String url;
	
	public static void kargatu(){
		if(System.getProperty("user.language").equals("eu") || System.getProperty("user.language").equals("es")){
			euskeraKargatu();
		}
		else{
			ingelesaKargatu();
		}
		url = "<html><center><font size = 2><a href=\"\">https://github.com/hvadillo/Dragamina</a></font></html>";
	}
	
	public static void euskeraKargatu(){
		izenaSartu = "Sartu izea: ";
		
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
		
		guriburuzTextua = "<html><center><b><font size = +1>DRAGAMINA</font></b>"
							+"<br><font size = 1>EUITI 2016</font></b>"
							+"<br><br><b><font size = 4>Egileak:</font></b>"
							+"<br><font size = 3>Hector Vadillo<br>Aimar Ugarte</font>"
							+"<br><br><b><font size = 4>Kodea:</font></html>";
	}
	
	public static void gaztelaniaKargatu(){
		izenaSartu = "Tu nombre: ";
		
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
		
		guriburuzTextua = "<html><center><b><font size = +1>DRAGAMINA</font></b>"
				+"<br><font size = 1>EUITI 2016</font></b>"
				+"<br><br><b><font size = 4>Autores:</font></b>"
				+"<br><font size = 3>Hector Vadillo<br>Aimar Ugarte</font>"
				+"<br><br><b><font size = 4>Kodigo:</font></html>";
	}
	
	public static void ingelesaKargatu(){
		izenaSartu = "Your name: ";
		
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
		
		guriburuzTextua = "<html><center><b><font size = +1>DRAGAMINA</font></b>"
				+"<br><font size = 1>EUITI 2016</font></b>"
				+"<br><br><b><font size = 4>Authors:</font></b>"
				+"<br><font size = 3>Hector Vadillo<br>Aimar Ugarte</font>"
				+"<br><br><b><font size = 4>Kode:</font></html>";
	}
}
