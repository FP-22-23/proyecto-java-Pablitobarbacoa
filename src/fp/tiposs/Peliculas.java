package fp.tiposs;

import java.util.Collection;
import java.util.List;


public interface Peliculas {
	List<Pelicula> getPeliculas();

	String toString();

	int hashCode();

	boolean equals(Object obj);

	//	Obtener el número de elementos.
	Integer getNumeroPartidas();

	//	Añadir un elemento.
	void añadirPelicula(Pelicula p);

	//	Añadir una colección de elementos.
	void añadirCollecionPelicula(Collection<Pelicula> p);

	//	Eliminar un elemento.
	void eliminarPelicula(Pelicula p);

	void eliminarPelicula(int n);

}
