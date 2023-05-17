package fp.tiposs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
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
		this.peliculas = peliculas.collect(Collectors.toList());}

	
	//Operaciones con la lista de películas
	
	public Pelicula getPeliculaIndice(Integer indice) {
		
		return peliculas.get(indice);
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
	
	
	//Diccionarios y operaciones con los datos del csv
	
	
	public Map<String, Double> getRatioCalificacionRecaudacionYNombreSegunValor(Double valor) {
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
	
	public Boolean existePeliculaDirectorYActor(String titulo, String director, String actor) {
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
		
		List<String> lista= new LinkedList<>(); 
		for (Pelicula p: peliculas) {

			
			if((p.getCategoria()).contains(categoria)) {
				lista.add(p.getTitulo());
				
			}else {
				res.put(categoria, lista);
			}
		}
		
		return res;
		
	}
	
	//Bloque 1 entrega final
	
	
	
	//Función 1
	public Boolean existePeliculaDirectorYActor1(String titulo, String director, String actor) {
		
		return peliculas.stream().
				anyMatch(x-> x.getTitulo().equals(titulo)&& x.getDirector().equals(director)&&x.getEstrellas().contains(actor));
	}
	
	//Función 2
	public Map<TipoCensura, Integer> contadorPorTipoCensura2(){
		
		return peliculas.stream()
				.collect(Collectors.groupingBy(Pelicula::getTipocensura,Collectors.collectingAndThen(Collectors.counting(), Long::intValue) ));
	}
	
	
	//Función 3
	public List<String> peliculasCategoria2(String categoria){
		
		return peliculas.stream()
				.filter(x-> x.getCategoria().contains(categoria))
				.map(Pelicula::getTitulo)
				.collect(Collectors.toList());
	}
	
	
	//Función 4
	public String getPeliculaMaxRecaudacionPorCategoria(String categoria) {
		
		return peliculas.stream()
				.filter(x-> x.getCategoria().contains(categoria))
				.max(Comparator.comparing(Pelicula::getRecaudacionMillones))
				.map(Pelicula::getTitulo)
				.orElse(null);
	}
	
	//Función 5
	
	public List<String> getNPeliculasJustoMásRecaudacionQue (Double n, Integer limite) {
		
		return peliculas.stream()
				.filter(x-> x.getRecaudacionMillones()>n)
				.limit(limite)
				.sorted(Comparator.comparing(Pelicula::getRecaudacionMillones))
				.map(Pelicula::getTitulo)
				
				.collect(Collectors.toList());
	}
	
	
	
	//Bloque 2 Entrega Final
	
	//Función 1
	
	public Map<String, Integer> contadorPorTipoCategoria2(){
		
		return peliculas.stream()
	            .flatMap(pelicula -> pelicula.getCategoria().stream())
	            .collect(Collectors.toMap(
	                    categoria -> categoria,
	                    categoria -> 1,
	                    Integer::sum
	            ));
	}
	
	//Función 2
	
	public int getMediaRecaudaciones() {
		
		return peliculas.stream()
	            .collect(Collectors.collectingAndThen(Collectors.averagingDouble(Pelicula::getRecaudacionMillones), Double::intValue));
	}
	
	
	//Función 3
	public List<String> getNPeliculasMaxRecaudacion(Integer n) {
		
		return peliculas.stream()
				.sorted(Comparator.comparing(Pelicula::getRecaudacionMillones).reversed())
				.limit(n)
				.map(Pelicula::getTitulo)
				.collect(Collectors.toList());}
	
	//Función 4
	
	public Map<TipoCensura, List<String>> getNMayorCalificacionDeTipoCensura(TipoCensura tipo, Integer n) {
	    return peliculas.stream()
	            .filter(x -> x.getTipocensura().equals(tipo))
	            .sorted(Comparator.comparing(Pelicula::getCalificacion).reversed())
	            .limit(n)
	            .collect(Collectors.groupingBy(Pelicula::getTipocensura, 
	                    Collectors.mapping(Pelicula::getTitulo, Collectors.toList())));
	    
}
	
	//Función 5
	
	
	public Map<Integer, Double> maxCalificacionDeAnyo() {
	    return peliculas.stream()
	            .collect(Collectors.groupingBy(p -> p.getFechaEstreno().getYear(),
	                    Collectors.collectingAndThen(
	                            Collectors.maxBy(Comparator.comparing(Pelicula::getCalificacion)),
	                            maxPelicula -> maxPelicula.map(Pelicula::getCalificacion).orElse(0.0)
	                    )
	            ));
	}
				
				
	










}
