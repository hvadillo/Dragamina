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
						+"<li>Bonba bat ez duen lauki bat zabaltzerakoan, honek ondoan dituen bonba kopurua erakutziko du. Erabili informazioa hau, gehi suposizioren bat bonbak saihesteko.</li>"
						+"<li>Lauki bat zabaltzeko, laukiaren gainean jarri zaitez eta egin klik. Uste baduzu lauki baten bomba bat dagoela eta markatu nahi baduzu, jarri zaitez laukiaren gainean eta egin eskuineko klika.</li>"
						+"</ul>"
						
						+"</font><br><br><b><font size = 5>Xehetasunak:</font></b>"

						+"<br><font size = 4>"
						+ "<ul>"
 						+"<li>Lauki baten 'bizilagunak' dira: goikoa, behekoa, ezkerrekoa, eskuinekoa, eta 4 diagonalak. Izkinetan daudezen laukian 'bizilagun' gutxiago dituzte. Tableroak ez du bueltarik ematen izkinetan.</li>"
  						+"<li>0 bonba 'bizilagun' bezala dituen lauki bat zabaltzen baduzu, 'bizilagun' guztiak automatikoki zabalduko dira. Honek azalera handi bat zabaltzea kausa dezake.</li>"
  						+"<li>Bonba 'bizilagun' bezala duten laukiek kolorezko kode baten bitartez bananduta daude: 1=urdina, 2=berdea, 3=gorria, 4=urdin iluna, 5=granatea, 6=urdina/berdea, 7=morea, 8=grisa.</li>"
  						+"<li>Zabaltzen duzun lehenengo laukia ez da inoiz banba bat izango.</li>"
  						+"<li>Bonba bat txarto markatzen baduzu, errorea konpondu beharko duzu irabazi baino lehen. Bonba bat txarto markatzeak ez zaitu hilko, baina errore gehiago egitera eraman ahal zaitu.</li>"
  						+"<li>Ez duzu bonba guztiak markatu behar irabazteko; bakarrik zabaldu behar dituzu bonbak ez diren lauki guztiak.</li>"
  						+"<li>Sakatu emoji aurpegia partida berri bat hasteko.</li>"
						+"</ul>"
						+"</font>"


						+"<br><br><b><font size = 5>Egoeraren informazioa:</font></b>"
						
						+"<br><font size = 4>"
						+"<ul>"
  						+"<li>Goiko ezkerreko izkina, bonba kopurua ken markatutako lauki kopurua adierazten du. Jolasaren hasieran bonba kopurua adierazten du. Zenbakia eguneratuko da laukiak markatu eta desmarkatuz joan ahala.</li>"
  						+"<li>Aurpegi horia irribarre bat aurkeztuko du jolasten duzun bitartean, hildako aurpegi bat bonba bat jotzen duzunean, eta aurpegi bidertigarri bat irabazten duzunean.</li>"
  						+"<li>Goiko eskuineko izkina kronometro bat erakuzten du. Kronometroa ez du 999 baino gehiago markatuko.</li>"
  						+"</ul>"
						+"</font>"

						+"<br><br><b><font size = 5>Aukerak eta Hobekuntzak:</font></b>"

						+"<br><font size = 4>"
						+"<ul>"
  						+"<li><b>Zabaltzeko Mugimendua -</b> Zabaltzen duzun lehenengo laukia ez da bakarrik inoiz bonba bat izango,baizik eta ez da inoz bonba baten 'bizilaguna' izango.</li>"
  						+"<li><b>Galdera markak -</b> Eskuineko klika eginez bandera baten, galdera baten bihurtuko du laukia. Berriz eskuineko klika eginez markatu gabeko lauki baten bihurtuko du laukia.</li>"
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
				+"<br><br><b><font size = 5>Codigo:</font></html>";
		
		argibideaTextua = "<html><center><b><font size = +1>Instrucciones para DRAGAMINA</font></b></center>"
				
						+"<br><br><b><font size = 5>Lo basico:</font></b>"
						
						+"<br><font size = 4>"
						+"<ul>"
						+"<li>Se te presenta un tablero de cuadros, cada uno con una cubierta. Algunos cuadrados contienen minas (bombas) bajo la cubierta. Si abres un cuadrado que contenga una bomba, pierdes. Si abres todos los cuadrados sin bombas, ganas.</li>"
						+"<li>Abrir un cuadrado que no tenga bomba, revela el numero de cuadrados vecinos que tienen bomba. Usa esta informacion mas alguna conjetura para evitar las bombas.</li>"
						+"<li>PAra abrir un cuadrado, posate sobre el y haz clic. Para marcar un cuadrado que crees que es una bomba, posate y haz clic derecho.</li>"
						+"</ul>"
						
						+"</font><br><br><b><font size = 5>Los detalles:</font></b>"

						+"<br><font size = 4>"
						+ "<ul>"
 						+"<li>Los cuadrados veciinos son los de arriba, abajo, izquierda, derecha, y los 4 en diagonal. Los cuadrados de las esquinas del tablero tienen menos vecinos. El tablero no da la vuelta en las esquinas.</li>"
  						+"<li>Si abres un cuadrado con 0 bombas al rededor, todos sus vecinos se abriran automaticamente. Esto puede abrir una gran area automaticamente.</li>"
  						+"<li>Los cuadrados con numero siguen un codigo: 1=azul, 2=verde, 3=rojo, 4=azul oscuro, 5=granate, 6=azul/berde, 7=morado, 8=gris.</li>"
  						+"<li>El primer cuadrado que abras nunca sera una bomba.</li>"
  						+"<li>Si marcas una bomba incorrectamente, tendras que corregir el error antes de ganar. Marcar incorrectamente no te matara, pero te llevara al error que lo hara.</li>"
  						+"<li>No necesitas marcar todas las bombas para ganar; solo necesitas abrir todos los cuadrados sin bomba.</li>"
  						+"<li>Pulsa la cara sonriente para empezar una nueva partida.</li>"
						+"</ul>"
						+"</font>"


						+"<br><br><b><font size = 5>Informacion del estado:</font></b>"
						
						+"<br><font size = 4>"
						+"<ul>"
  						+"<li>La esquina superior izquierda muestra el numero de bombas menos el numero de cuadrados marcados. Al principio del juego solo es el numero de bombas. El numero se actualizara segun se marquen y se desmarquen bombas.</li>"
  						+"<li>La cara amarilla mostrara una sonrisa mientras juegues, una cara muerta cuando hagas clic en una bomba, y una divertida cara cuando ganes.</li>"
  						+"<li>La esquina superior derecha contiene un cronometro. El maximo que marque sera de 999.</li>"
  						+"</ul>"
						+"</font>"

						+"<br><br><b><font size = 5>Opciones y Mejoras:</font></b>"

						+"<br><font size = 4>"
						+"<ul>"
  						+"<li><b>Movimiento de apertura -</b> No solo la primera bomba que abras no va a ser una bomba, sino que tampoco sera vecina de una de ellas.</li>"
  						+"<li><b>Marca de duda -</b> Clic derecho sobre una bandera cambia el icono a una pregunta. Si se vuelve a hacer clic derecho volvera a estar como cuadrado sin marcar.</li>"
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

