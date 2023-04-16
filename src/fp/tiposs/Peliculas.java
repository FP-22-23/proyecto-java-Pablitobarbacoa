package fp.tiposs;

import java.util.Collection;
import java.util.List;
import java.util.Map;


public interface Peliculas {
	List<Pelicula> getPeliculas();

	String toString();

	int hashCode();

	boolean equals(Object obj);

	//	Obtener el número de elementos.
	Integer getNumeroPartidas();

	// Obtener un elemento de la lista
	
	Pelicula getPeliculaIndice(Integer indice);
	//	Añadir un elemento.
	void añadirPelicula(Pelicula p);

	//	Añadir una colección de elementos.
	void añadirCollecionPelicula(Collection<Pelicula> p);

	//	Eliminar un elemento.
	void eliminarPelicula(Pelicula p);

	void eliminarPelicula(int n);

		
	
	//Funciones con el tipo Peliculas
	
	Map<String, List<String>> peliculasCategoria(String categoria);
	
	Map<String, Integer> contadorPorCategoria(String categoria);
	
	Boolean peliculaDirectorYActor(String titulo, String director, String actor);
	
	Map<TipoCensura, Integer> contadorPorTipoCensura();
	
	Map<String, Double> getRatioCalificacionRecaudacionYNombreSegunValor(Double valor);
}
