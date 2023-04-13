package fp.tiposs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeliculasImpl implements Peliculas {

	private List<Pelicula> peliculas;
	
	
	//Constructores de la lista películas
	
	public PeliculasImpl() {
	
		peliculas = new ArrayList<Pelicula>();
}
	
	public PeliculasImpl(Collection<Pelicula> peliculas) {
		this.peliculas= new ArrayList<Pelicula>(peliculas);
	}

	public PeliculasImpl(Stream<Pelicula> peliculas) {
		this.peliculas = peliculas.collect(Collectors.toList());
		
	
	}

	//Operaciones con la lista de películas

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

	//Hashcode e Equals
	public int hashCode() {
		return Objects.hash(peliculas);
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeliculasImpl other = (PeliculasImpl) obj;
		return Objects.equals(peliculas, other.peliculas);
	}

	//toString de la lista de películas
	public String toString() {
		return "PeliculasImpl [Peliculas=" + peliculas + "]";
	}
	
	
	public Map<String, Double> getRatioCalificacionRecaudacionYNombreSegunValor(Integer valor) {
		Map<String, Double> res= new HashMap<>();
		
		
		for(Pelicula pl: peliculas) {
			String clave= pl.getTitulo();
			Double ratio= pl.getRecaudacionMillones()/pl.getCalificacion();
			
			if(ratio>valor) {
				res.put(clave, ratio);
			}
		
		
	}
	
		return res;
}
	
	
	
	public Map<TipoCensura, Integer> contadorPorTipoCensura(){
		
		Map<TipoCensura, Integer> res= new HashMap<>();
		
		for(Pelicula p: peliculas) {
			TipoCensura clave = p.getTipocensura();
			
			if(res.containsKey(clave)) {
				res.put(clave, res.get(clave)+ 1);
			}else {
				res.put(clave, 1);
			}
			
		}
		
		return res;
	}
	
	public Boolean peliculaDirectorYActor(String titulo, String director, String actor) {
		Boolean res= false;
		for(Pelicula p: peliculas) {
			if (p.getTitulo().equals(titulo)&&p.getDirector().equals(director)&&p.getEstrellas().contains(actor)) {
				res=true;
			}
			
		}
		return res;
	}

	public Map<String, Integer> contadorPorCategoria(String categoria){
		Map<String, Integer> res= new HashMap<>();
		for (Pelicula p: peliculas) {
			
			for (String clave:p.getCategoria()) {
				
				
				if(clave.equals(categoria)) {//filtro si la categoria equivale a la introducida
				
				if(res.containsKey(clave)) {
					res.put(categoria, res.get(clave)+1);
				}else {
					res.put(categoria, 1);
				}
			}
		}
		}
		return res;
	}
	
	public Map<String, List<String>> peliculasCategoria(String categoria){
		Map<String, List<String>> res= new HashMap<>();
		
		for (Pelicula p: peliculas) {
			
			List<String> lista= new LinkedList<>(); 
			
			if((p.getCategoria()).contains(categoria)) {
				lista.add(p.getTitulo());
				
				res.put(categoria, lista);
			}
		}
		
		return res;
		
	}
	
	
	
	
	
}
