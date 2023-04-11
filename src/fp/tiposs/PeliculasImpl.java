package fp.tiposs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeliculasImpl implements Peliculas {

	private List<Pelicula> peliculas;
	
	public PeliculasImpl() {
	
		peliculas = new ArrayList<Pelicula>();
}
	
	public PeliculasImpl(Collection<Pelicula> peliculas) {
		this.peliculas= new ArrayList<Pelicula>(peliculas);
	}

	public PeliculasImpl(Stream<Pelicula> peliculas) {
		this.peliculas = peliculas.collect(Collectors.toList());
		
	
	}


	public List<Pelicula> getPeliculas() {
		return peliculas;
	}


	public Integer getNumeroPartidas() {
		return peliculas.size();
	}


	public void añadirPelicula(Pelicula p) {
		peliculas.add(p);
		
	}

	public void añadirCollecionPelicula(Collection<Pelicula> p) {
		peliculas.addAll(p);
		
	}




	public void eliminarPelicula(Pelicula p) {
		peliculas.remove(p);
		
	}


	public void eliminarPelicula(int n) {
		peliculas.remove(n);
		
	}
	
}
