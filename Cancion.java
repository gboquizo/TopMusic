package listadoestructuras3.topMusic;
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
public class Cancion {
	/**
	 * Título de la canción
	 */
	private String titulo;
	
	/**
	 * Nombre del artista
	 */
	private String artista;
	
	/**
	 * Año de grabación
	 */
	private String annoGrabacion;
	
	/**
	 * Constructor que recibe el título, el artista y el año
	 * @param titulo de la canción
	 * @param artista
	 * @param anno de grabación
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
	 * Lee el título de la canción
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Escribe el título de la canción
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
	 * Lee el año de grabación
	 * @return annoGrabacion
	 */
	public String getannoGrabacion() {
		return annoGrabacion;
	}

	
	/**
	 * Escribe al año de grabación
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
		return "Titulo: " + titulo + "\nArtista: " + artista + "\nAño: " + annoGrabacion + "\n";
	}
}
