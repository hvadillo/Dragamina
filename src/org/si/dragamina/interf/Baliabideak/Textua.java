package org.si.dragamina.interf.Baliabideak;

public class Textua {
	
	public static String izenaSartu;
	public static String menuJokoa, menuLaguntza;
	public static String aukErraza, aukNorlama, aukZaila, aukTopa, aukJokAldatu, aukIrten;
	public static String argibidea, guriBuruz, hizkuntza;
	public static String itxiTextua, itxiTextuaIzenburu;
	public static String euskera, ingelesa, gaztelania;
	public static String guriburuzTextua, argibideaTextua;
	public static String posizioa, izena, puntuak, data;
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
		aukTopa = "Ranking-a";
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
		
		posizioa = "POSIZIOA";
		izena = "IZENA";
		puntuak  = "PUNTUAK";
		data = "DATA";
		
		guriburuzTextua = "<html><center><b><font size = +1>DRAGAMINA</font></b>"
							+"<br><font size = 1>EUITI 2016</font></b>"
							+"<br><br><b><font size = 4>Egileak:</font></b>"
							+"<br><font size = 3>Hector Vadillo<br>Aimar Ugarte</font>"
							+"<br><br><b><font size = 4>Kodea:</font></html>";
		
		argibideaTextua = "<html></html>";
	}
	
	public static void gaztelaniaKargatu(){
		izenaSartu = "Tu nombre: ";
		
		menuJokoa = "Juego";
		menuLaguntza = "Ayuda";
		
		aukErraza = "F√°cil";
		aukNorlama = "Normal";
		aukZaila = "Dif√≠cil";
		aukTopa = "Ranking";
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
		
		posizioa = "POSICION";
		izena = "NOMBRE";
		puntuak  = "PUNTOS";
		data = "Fecha";
		
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
		aukTopa = "Ranking";
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
		
		posizioa = "POSITION";
		izena = "NAME";
		puntuak  = "POINTS";
		data = "DATE";
		
		guriburuzTextua = "<html><center><b><font size = +1>DRAGAMINA</font></b>"
				+"<br><font size = 1>EUITI 2016</font></b>"
				+"<br><br><b><font size = 4>Authors:</font></b>"
				+"<br><font size = 3>Hector Vadillo<br>Aimar Ugarte</font>"
				+"<br><br><b><font size = 4>Kode:</font></html>";
		
		argibideaTextua = "<html><center><b><font size = 11>Instructions for MineSweeper</font></b></center>"
				+"<br><b><font size = 6>The Basics:</font></b>"
				+"<br><font size = 6>∑You are presented with a board of squares, each with a cover."
				+" Some squares contain mines (bombs) under the covers. If you open a square containing a bomb, you loose."
				+" If you open all squares without bombs, you win."
				+"<br>∑Opening a square which doesn't have a bomb reveals the number of neighboring squares contain bombs."
				+" Use this information plus some guess work to avoid the bombs."
				+"<br>∑To open a square, point at the square and click on it."
				+" To mark a square you think is a bomb, point and right click. With a single button mouse use the space bar to mark a bomb.</font>"
				+"<br><br><b><font size = 7>The Details:</font></b>"
				+"<br><font size = 6>∑A squares 'neighbors' are the squares adjacent above, below, left, right, and all 4 diagonals."
				+" Squares on the sides of the board or in a corner have fewer neighbors. The board does not wrap around the edges."
				+"<br>∑If you open a square with 0 neighboring bombs, all its neighbors will automatically open. This can cause a large area to automatically open."
				+"<br>∑The squares neighbor counts are color coded: 1=blue, 2=green, 3=red, 4=purple, 5=maroon, 6=blue/green, 7=black, 8=gray."
				+"<br>∑To remove a bomb marker from a square, point at it and right-click again."
				+"<br>∑The first square you open is never a bomb."
 				+"<br>∑If you mark a bomb incorrectly, you will have to correct the mistake before you can win. Incorrect bomb marking doesn't kill you, but it can easily lead to mistakes which do."
				+"<br>∑You don't have to mark all bombs to win; you just need to open all non-bomb squares."
				+"<br>∑Press the yellow face to start a new game.</font>"
				+"<br><br><b><font size = 7>The Status Information:</font></b>"
				+"<br><font size = 6>∑The upper left corner of the screen contains the number of bombs minus the number of marked squares."
				+" At the beginning of a game it is just the number of bombs. The number will update as you mark and unmark squares."
				+"<br>∑The yellow face will show a smile face while you play, a clock face when a game board is being built, a dead face when you hit a bomb, a cool face when you win, and a pirate face when you win while cheating."
				+"<br>∑The upper right corner of the screen contains a time counter. The timer will max out at 999.</font>"
				+"<br>∑Click on the time to switch to the number of moves counter. Click again to switch back to the time."
				+"<br>∑Press P to pause your game. The board will be covered while paused.</font>"
				+"<br><br><b><font size = 7>Options and Enhancements:</font></b>"
				+"<br><b>∑Opening Move -</b> Not only will the first square never be a bomb, but neither will any of the neighbors."
				+"<br><b>∑Question Marks -</b> Right clicking on a marked bomb will change the flag into a question mark. Right clicking again will change it back into an unmarked square."
				+"<br><b>∑Area Open -</b> If an open square has the correct number of marked neighboring bombs, click on the open square to open all remaining unopened neighbor squares all at once. If an incorrect number of neighbors are marked, or all neighbors are marked or open, clicking the square has no effect."
				+" If an incorrect neighbor is marked, this will cause instant death."
				+"<br><b>∑Open Remaining -</b> Once the correct number of bombs have been marked, the bomb counter will turn blue. Click on the blue bomb counter to open all remaining cells. If any bombs are incorrectly marked, this will cause instant death."
				+"<br><b>∑Disarm (undo) -</b> After clicking on a bomb cell you have 3 seconds to choose to disarm the bomb. Scores will not count towards high scores if any bombs are disarmed in a game."
				+"<br><b>∑Hints (press H) -</b> Show the contents of an unopened cell. Point at a cell and press 'H'. Turn on hints to make this feature available. Scores will not count towards high scores if a hint is used.</font></html>";
	}
}

