package listadoestructuras3.topMusic;

import utiles.Menu;
import utiles.Teclado;

/**
 * Implementa un programa que gestione una lista de las canciones m�s
 * escuchadas. El usuario podr�:
 * 
 * a. A�adir una canci�n (en una posici�n) al TopMusic. b. Sacar un elemento del
 * TopMusic. c. Subir un puesto en el TopMusic. d. Bajar un puesto en el
 * TopMusic. e. Mostrar la lista TopMusic. f. Mostrar la canci�n m�s escuchada.
 *
 * Sobre la canci�n se almacenar� el t�tulo, artista o grupo y a�o de grabaci�n
 * 
 * @author Guillermo Boquizo S�nchez
 * @version 1.0
 */
public class TestTopMusic {
	private static TopMusic topMusic = new TopMusic();

	public static void main(String[] args) {
		Menu menu = new Menu("\nTop Music", new String[] { "A�adir canci�n", "Eliminar canci�n", "Subir un puesto",
				"Bajar un puesto", "Mostrar lista", "Mostrar la canci�n m�s escuchada", "Salir" });
		int opcion;

		do {
			opcion = menu.gestionar();
			gestionarOpcion(opcion);
		} while (opcion != 7);
	}

	private static void gestionarOpcion(int opcion) {
		switch (opcion) {
		case 1:
			annadirCancion();
			break;
		case 2:
			eliminarCancion();
			break;
		case 3:
			subirCancion();
			break;
		case 4:
			bajarCancion();
			break;
		case 5:
			mostrarTop();
			break;
		case 6:
			mostrarTop1();
			break;
		case 7:
			salir();
			break;
		}
		mostrarTop();
	}

	
		/**
		 * Muestra el n� 1 del top
		 */
		private static void mostrarTop1() {
			if (!topMusic.isEmpty())
				System.out.println(topMusic.masEscuchada());
			else
				System.out.println("Top vacio!");
	}
	

	/**
	 * A�ade una cancion al top
	 */
	private static void annadirCancion() {
		if (!topMusic.annadir(topMusic.posicionValida(Teclado.leerEntero("Posicion en el TopMusic:")), Teclado.leerCadena("Titulo:"),
				Teclado.leerCadena("Artista:"), Teclado.leerCadena("A�o:"))) {
			System.out.println("No se pudo a�adir");
		} else
			System.out.println("Cancion a�adida!");
	}

	/**
	 * Elimina una cancion del top
	 */
	private static void eliminarCancion() {
		if (!topMusic.isEmpty()) {
			if (!topMusic.sacar(Teclado.leerCadena("Titulo:")))
				System.out.println("No se pudo eliminar");
			else
				System.out.println("Cancion eliminada!");
		} else
			System.out.println("Top vacio!");
	}

	/**
	 * Sube una cancion del top
	 */
	private static void subirCancion() {
		if (!topMusic.isEmpty()) {
			if (!topMusic.subir(topMusic.posicionValida(Teclado.leerEntero("Posicion:"))))
				System.out.println("No se puede subir la canci�n, ya es Top 1");
			else
				System.out.println("Cancion subida!");
		} else
			System.out.println("Top vacio!");
	}

	/**
	 * Baja una cancion del top
	 */
	private static void bajarCancion() {
		if (!topMusic.isEmpty()) {
			if (!topMusic.bajar(topMusic.posicionValida(Teclado.leerEntero("Posicion:"))))
				System.out.println("No se pudo bajar la cancion");
			else
				System.out.println("Cancion bajada!");
		} else
			System.out.println("Top vacio!");
	}

	/**
	 * Muestra el top completo
	 */
	private static void mostrarTop() {
		if (!topMusic.isEmpty())
			System.out.println(topMusic.mostrarTopMusic());
		else
			System.out.println("Top vacio!");
	}
	/**
	 * Sale del programa
	 */
	private static void salir() {
		System.out.println("Adios!");
		System.exit(0);
	}
}