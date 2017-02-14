package listadoestructuras3.topMusic;
/**
 * Implementa  un  programa  que  gestione  una  lista  de  las  canciones  m�s 
 * escuchadas. El usuario podr�:
 * 
 * a. A�adir una canci�n (en una posici�n) al TopMusic.
 * b. Sacar un elemento del TopMusic.
 * c. Subir un puesto en el TopMusic.
 * d. Bajar un puesto en el TopMusic.
 * e. Mostrar la lista TopMusic.
 * f. Mostrar la canci�n m�s escuchada.
 *
 * Sobre la canci�n se almacenar� el t�tulo, artista o grupo y a�o de grabaci�n
 * 
 * @author Guillermo Boquizo S�nchez
 * @version 1.0
 */
public class Cancion {
	/**
	 * T�tulo de la canci�n
	 */
	private String titulo;
	
	/**
	 * Nombre del artista
	 */
	private String artista;
	
	/**
	 * A�o de grabaci�n
	 */
	private String annoGrabacion;
	
	/**
	 * Constructor que recibe el t�tulo, el artista y el a�o
	 * @param titulo de la canci�n
	 * @param artista
	 * @param anno de grabaci�n
	 */
	public Cancion(String titulo,String artista,String annoGrabacion){
		setTitulo(titulo);
		setArtista(artista);
		setannoGrabacion(annoGrabacion);
	}
	
	/**
	 * Constructor solo con un titulo
	 * 
	 * @param titulo
	 */
	public Cancion(String titulo) {
		setTitulo(titulo);
}

	/**
	 * Lee el t�tulo de la canci�n
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Escribe el t�tulo de la canci�n
	 * @param titulo
	 */
	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Lee el nombre del artista
	 * @return artista
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 * Escribe el nombre del artista
	 * @param artista
	 */
	private void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * Lee el a�o de grabaci�n
	 * @return annoGrabacion
	 */
	public String getannoGrabacion() {
		return annoGrabacion;
	}

	
	/**
	 * Escribe al a�o de grabaci�n
	 * @param annoGrabacion
	 */
	private void setannoGrabacion(String annoGrabacion) {
		this.annoGrabacion = annoGrabacion;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nArtista: " + artista + "\nA�o: " + annoGrabacion + "\n";
	}
}
