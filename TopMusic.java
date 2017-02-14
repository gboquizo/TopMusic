package listadoestructuras3.topMusic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Implementa  un  programa  que  gestione  una  lista  de  las  canciones  más 
 * escuchadas. El usuario podrá:
 * 
 * a. Añadir una canción (en una posición) al TopMusic.
 * b. Sacar un elemento del TopMusic.
 * c. Subir un puesto en el TopMusic.
 * d. Bajar un puesto en el TopMusic.
 * e. Mostrar la lista TopMusic.
 * f. Mostrar la canción más escuchada.
 *
 * Sobre la canción se almacenará el título, artista o grupo y año de grabación
 * 
 * @author Guillermo Boquizo Sánchez
 * @version 1.0
 */
public class TopMusic {
	/**
	 * ArrayList
	 */
	private ArrayList<Cancion> topMusic=null;
	
	/**
	 * Constructor
	 */
	public TopMusic(){
		topMusic=new ArrayList<Cancion>();
	}
	
	/**
	 * Añade una cancion al TopMusic
	 * 
	 * @param cancion
	 *            a añadir
	 * @param titulo
	 * @param artista
	 * @param annoGrabacion
	 */
	boolean annadir(int indice, String titulo, String artista, String annoGrabacion) {
		if (fueraDeRango(indice))
			return false;
		else
			topMusic.add(indice, new Cancion(titulo, artista, annoGrabacion));
		return true;
}
	
	/**
	 * Saca una cancion del top music
	 * 
	 * @param cancion
	 */
	boolean sacar(String titulo) {
		Cancion cancion = new Cancion(titulo);
		if (topMusic.contains(cancion)) {
			topMusic.remove(cancion);
			return true;
		} else
			return false;

	}

	
	/**
	 * Sube una posicion una cancion
	 * 
	 * @param cancion
	 */
	boolean subir(int indice) {
		if (fueraDeRango(indice))
			return false;
		if (indice - 2 < 0)
			return false;
		topMusic.add(indice - 2, topMusic.remove(indice - 1));
		return true;

}
	
	/**
	 * Baja una posicion una cancion
	 * 
	 * @param cancion
	 */
	boolean bajar(int indice) {
		if (fueraDeRango(indice))
			return false;
		if (indice > topMusic.size() - 1)
			return false;
		topMusic.add(indice + 1, topMusic.remove(indice - 1));
		return true;

}
	/**
	 * Muestra el top Music
	 */
	String mostrarTopMusic() {
		String cadena = "";
		int i = 1;
		for (Iterator<Cancion> iterator = topMusic.iterator(); iterator.hasNext();)
			cadena += "\n" + (i++) + " " + iterator.next();
		return cadena;
}
	/**
	 * Muestra la cancion del top
	 */
	String masEscuchada() {
		return " Top 1: " + topMusic.get(0);
	}

	/**
	 * 
	 * @param indice
	 * @return
	 */
	private boolean fueraDeRango(int indice) {
		if (indice < 0 || indice > topMusic.size())
			return true;
		return false;
	}

	/**
	 * Recoge una posicion valida
	 * 
	 * @param indice
	 *            Indice de la posicion
	 * @return El indice si es valido
	 */
	int posicionValida(int indice) {
		if (indice > topMusic.size() || indice < 0)
			return topMusic.size();
		else
			return indice - 1;
	}

	/**
	 * indica si la lista esta vacia o no
	 * @return
	 */
	boolean isEmpty() {
		return topMusic.isEmpty();
}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String cadena = "";
		if (topMusic.size() < 10) {
			for (int i = 0; i < topMusic.size(); i++) {
				cadena += "(" + (i + 1) + ")" + topMusic.get(i) + "\n";
			}
		}
		return "Top Music:\n" + cadena;
	}
}