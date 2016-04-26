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
		/*else if(System.getProperty("user.language").equals("es")){
			gaztelaniaKargatu();
		}*/
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
							+"<br><font size = 3>EUITI 2016</font></b>"
							+"<br><br><b><font size = 5>Egileak:</font></b>"
							+"<br><font size = 4>Hector Vadillo<br>Aimar Ugarte</font>"
							+"<br><br><b><font size = 5>Kodea:</font></html>";
		
		argibideaTextua = "<html><center><b><font size = +1>DRAGAMINARAKO argibidea</font></b></center>"
				
						+"<br><br><b><font size = 5>Funtzeskoak:</font></b>"
						
						+"<br><font size = 4>"
						+"<ul>"
						+"<li>Laukiz betetako tablero bat pantailaratuko da, berauek estalita. Lauki batzuek mina (bonba) daukate estalkiaren azpian. Bonba duen lauki bat zabaltzen baduzu, galdu duzu. Bonbarik ez duten lauki guztiak zabaldutakoan, irabazi duzu.</li>"
						+"<li>Opening a square which doesn't have a bomb reveals the number of neighboring squares contain bombs. Use this information plus some guess work to avoid the bombs.</li>"
						+"<li>To open a square, point at the square and click on it. To mark a square you think is a bomb, point and right click.</li>"
						+"</ul>"
						
						+"</font><br><br><b><font size = 5>The Details:</font></b>"

						+"<br><font size = 4>"
						+ "<ul>"
 						+"<li>A squares 'neighbors' are the squares adjacent above, below, left, right, and all 4 diagonals. Squares on the sides of the board or in a corner have fewer neighbors. The board does not wrap around the edges.</li>"
  						+"<li>If you open a square with 0 neighboring bombs, all its neighbors will automatically open. This can cause a large area to automatically open.</li>"
  						+"<li>The squares neighbor counts are color coded: 1=blue, 2=green, 3=red, 4=dark blue, 5=maroon, 6=blue/green, 7=purple, 8=gray.</li>"
  						+"<li>The first square you open is never a bomb.</li>"
  						+"<li>If you mark a bomb incorrectly, you will have to correct the mistake before you can win. Incorrect bomb marking doesn't kill you, but it can easily lead to mistakes which do.</li>"
  						+"<li>You don't have to mark all bombs to win; you just need to open all non-bomb squares.</li>"
  						+"<li>Press the emoji face to start a new game.</li>"
						+"</ul>"
						+"</font>"


						+"<br><br><b><font size = 5>The Status Information:</font></b>"
						
						+"<br><font size = 4>"
						+"<ul>"
  						+"<li>The upper left corner of the screen contains the number of bombs minus the number of marked squares. At the beginning of a game it is just the number of bombs. The number will update as you mark and unmark squares.</li>"
  						+"<li>The yellow face will show a smile emoji while you play, a dead emoji when you hit a bomb, a cool emoji when you win.</li>"
  						+"<li>The upper right corner of the screen contains a time counter. The timer will max out at 999.</li>"
  						+"<li>Click on the time to switch to the number of moves counter. Click again to switch back to the time.</li>"
						+"</ul>"
						+"</font>"

						+"<br><br><b><font size = 5>Options and Enhancements:</font></b>"

						+"<br><font size = 4>"
						+"<ul>"
  						+"<li><b>Opening Move -</b> Not only will the first square never be a bomb, but neither will any of the neighbors.</li>"
  						+"<li><b>Question Marks -</b> Right clicking on a marked bomb will change the flag into a question mark. Right clicking again will change it back into an unmarked square.</li>"
						+"</ul>"
						+"</font></b>"
						+"</html>";
	}
	
	public static void gaztelaniaKargatu(){
		izenaSartu = "Tu nombre: ";
		
		menuJokoa = "Juego";
		menuLaguntza = "Ayuda";
		
		aukErraza = "Fácil";
		aukNorlama = "Normal";
		aukZaila = "Difícil";
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
				+"<br><font size = 3>EUITI 2016</font></b>"
				+"<br><br><b><font size = 5>Autores:</font></b>"
				+"<br><font size = 4>Hector Vadillo<br>Aimar Ugarte</font>"
				+"<br><br><b><font size = 5>Kodigo:</font></html>";
		
		argibideaTextua = "<html><center><b><font size = +1>Instructions for MineSweeper</font></b></center>"
				
						+"<br><br><b><font size = 5>The Basics:</font></b>"
						
						+"<br><font size = 4>"
						+"<ul>"
						+"<li>You are presented with a board of squares, each with a cover. Some squares contain mines (bombs) under the covers. If you open a square containing a bomb, you loose. If you open all squares without bombs, you win.</li>"
						+"<li>Opening a square which doesn't have a bomb reveals the number of neighboring squares contain bombs. Use this information plus some guess work to avoid the bombs.</li>"
						+"<li>To open a square, point at the square and click on it. To mark a square you think is a bomb, point and right click.</li>"
						+"</ul>"
						
						+"</font><br><br><b><font size = 5>The Details:</font></b>"

						+"<br><font size = 4>"
						+ "<ul>"
 						+"<li>A squares 'neighbors' are the squares adjacent above, below, left, right, and all 4 diagonals. Squares on the sides of the board or in a corner have fewer neighbors. The board does not wrap around the edges.</li>"
  						+"<li>If you open a square with 0 neighboring bombs, all its neighbors will automatically open. This can cause a large area to automatically open.</li>"
  						+"<li>The squares neighbor counts are color coded: 1=blue, 2=green, 3=red, 4=dark blue, 5=maroon, 6=blue/green, 7=purple, 8=gray.</li>"
  						+"<li>The first square you open is never a bomb.</li>"
  						+"<li>If you mark a bomb incorrectly, you will have to correct the mistake before you can win. Incorrect bomb marking doesn't kill you, but it can easily lead to mistakes which do.</li>"
  						+"<li>You don't have to mark all bombs to win; you just need to open all non-bomb squares.</li>"
  						+"<li>Press the emoji face to start a new game.</li>"
						+"</ul>"
						+"</font>"


						+"<br><br><b><font size = 5>The Status Information:</font></b>"
						
						+"<br><font size = 4>"
						+"<ul>"
  						+"<li>The upper left corner of the screen contains the number of bombs minus the number of marked squares. At the beginning of a game it is just the number of bombs. The number will update as you mark and unmark squares.</li>"
  						+"<li>The yellow face will show a smile emoji while you play, a dead emoji when you hit a bomb, a cool emoji when you win.</li>"
  						+"<li>The upper right corner of the screen contains a time counter. The timer will max out at 999.</li>"
  						+"<li>Click on the time to switch to the number of moves counter. Click again to switch back to the time.</li>"
						+"</ul>"
						+"</font>"

						+"<br><br><b><font size = 5>Options and Enhancements:</font></b>"

						+"<br><font size = 4>"
						+"<ul>"
  						+"<li><b>Opening Move -</b> Not only will the first square never be a bomb, but neither will any of the neighbors.</li>"
  						+"<li><b>Question Marks -</b> Right clicking on a marked bomb will change the flag into a question mark. Right clicking again will change it back into an unmarked square.</li>"
						+"</ul>"
						+"</font></b>"
						+"</html>";
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
				+"<br><font size = 3>EUITI 2016</font></b>"
				+"<br><br><b><font size = 5>Authors:</font></b>"
				+"<br><font size = 4>Hector Vadillo<br>Aimar Ugarte</font>"
				+"<br><br><b><font size = 5>Kode:</font></html>";
		
		argibideaTextua = "<html><center><b><font size = +1>Instructions for DRAGAMINA</font></b></center>"
				
						+"<br><br><b><font size = 5>The Basics:</font></b>"
						
						+"<br><font size = 4>"
						+"<ul>"
						+"<li>You are presented with a board of squares, each with a cover. Some squares contain mines (bombs) under the covers. If you open a square containing a bomb, you loose. If you open all squares without bombs, you win.</li>"
						+"<li>Opening a square which doesn't have a bomb reveals the number of neighboring squares contain bombs. Use this information plus some guess work to avoid the bombs.</li>"
						+"<li>To open a square, point at the square and click on it. To mark a square you think is a bomb, point and right click.</li>"
						+"</ul>"
						
						+"</font><br><br><b><font size = 5>The Details:</font></b>"

						+"<br><font size = 4>"
						+ "<ul>"
 						+"<li>A squares 'neighbors' are the squares adjacent above, below, left, right, and all 4 diagonals. Squares on the sides of the board or in a corner have fewer neighbors. The board does not wrap around the edges.</li>"
  						+"<li>If you open a square with 0 neighboring bombs, all its neighbors will automatically open. This can cause a large area to automatically open.</li>"
  						+"<li>The squares neighbor counts are color coded: 1=blue, 2=green, 3=red, 4=dark blue, 5=maroon, 6=blue/green, 7=purple, 8=gray.</li>"
  						+"<li>The first square you open is never a bomb.</li>"
  						+"<li>If you mark a bomb incorrectly, you will have to correct the mistake before you can win. Incorrect bomb marking doesn't kill you, but it can easily lead to mistakes which do.</li>"
  						+"<li>You don't have to mark all bombs to win; you just need to open all non-bomb squares.</li>"
  						+"<li>Press the emoji face to start a new game.</li>"
						+"</ul>"
						+"</font>"


						+"<br><br><b><font size = 5>The Status Information:</font></b>"
						
						+"<br><font size = 4>"
						+"<ul>"
  						+"<li>The upper left corner of the screen contains the number of bombs minus the number of marked squares. At the beginning of a game it is just the number of bombs. The number will update as you mark and unmark squares.</li>"
  						+"<li>The yellow face will show a smile emoji while you play, a dead emoji when you hit a bomb, a cool emoji when you win.</li>"
  						+"<li>The upper right corner of the screen contains a time counter. The timer will max out at 999.</li>"
  						+"<li>Click on the time to switch to the number of moves counter. Click again to switch back to the time.</li>"
						+"</ul>"
						+"</font>"

						+"<br><br><b><font size = 5>Options and Enhancements:</font></b>"

						+"<br><font size = 4>"
						+"<ul>"
  						+"<li><b>Opening Move -</b> Not only will the first square never be a bomb, but neither will any of the neighbors.</li>"
  						+"<li><b>Question Marks -</b> Right clicking on a marked bomb will change the flag into a question mark. Right clicking again will change it back into an unmarked square.</li>"
						+"</ul>"
						+"</font></b>"
						+"</html>";
	}
}

