package listadoestructuras3.topMusic;

import utiles.Menu;
import utiles.Teclado;

/**
 * Implementa un programa que gestione una lista de las canciones más
 * escuchadas. El usuario podrá:
 * 
 * a. Añadir una canción (en una posición) al TopMusic. b. Sacar un elemento del
 * TopMusic. c. Subir un puesto en el TopMusic. d. Bajar un puesto en el
 * TopMusic. e. Mostrar la lista TopMusic. f. Mostrar la canción más escuchada.
 *
 * Sobre la canción se almacenará el título, artista o grupo y año de grabación
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class TestTopMusic {
	private static TopMusic topMusic = new TopMusic();

	public static void main(String[] args) {
		Menu menu = new Menu("\nTop Music", new String[] { "Añadir canción", "Eliminar canción", "Subir un puesto",
				"Bajar un puesto", "Mostrar lista", "Mostrar la canción más escuchada", "Salir" });
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
		 * Muestra el nº 1 del top
		 */
		private static void mostrarTop1() {
			if (!topMusic.isEmpty())
				System.out.println(topMusic.masEscuchada());
			else
				System.out.println("Top vacio!");
	}
	

	/**
	 * Añade una cancion al top
	 */
	private static void annadirCancion() {
		if (!topMusic.annadir(topMusic.posicionValida(Teclado.leerEntero("Posicion en el TopMusic:")), Teclado.leerCadena("Titulo:"),
				Teclado.leerCadena("Artista:"), Teclado.leerCadena("Año:"))) {
			System.out.println("No se pudo añadir");
		} else
			System.out.println("Cancion añadida!");
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
				System.out.println("No se puede subir la canción, ya es Top 1");
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