package fp.tipos.test;

import java.time.Duration;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;



import fp.tiposs.Pelicula;
import fp.tiposs.TipoCensura;

public class Pelicula_test {
public static void main(String []args) {
	
	
	List<String> estrellas = new LinkedList<>();
	
	estrellas.add("La hermana de Caillou");
	estrellas.add("Caillou");
	estrellas.add("Un mono to gracioso");
	
	List<String> categoria = new LinkedList<>();
	categoria.add("Drama");
	categoria.add("Action");
	

	Pelicula p1= new Pelicula("Caillou va al Parque 2", "Joselito Jiménez", estrellas, 7.6, categoria, Duration.ofMinutes(90), TipoCensura.UA, LocalDate.of(2020, 8, 23), true, 125.15);
	
	Pelicula p2= new Pelicula("Caillou va al Parque", "Pepe Benavente", estrellas, 8.5, categoria, Duration.ofMinutes(115), TipoCensura.NA, LocalDate.of(2015, 8, 23), true, 134.12);
	
	getPelicula(p1);
	
	testEquals(p1, p2);
	
	testCompareTo(p1, p2);
}


	public static void getPelicula(Pelicula p) {
		
		System.out.println("#############################################################");
		System.out.println("Película completa: "  + p);
		
		System.out.println("#############################################################\nPrueba de los getter: ");
		System.out.println("Título: "+p.getTitulo());
		System.out.println("Director: " + p.getDirector());
		System.out.println("Estrellas: " + p.getEstrellas());
		System.out.println("Calificación: "+ p.getCalificacion());
		System.out.println("Categoria: " + p.getCategoria());
		System.out.println("Duración: " + p.getDuracion());
		System.out.println("Tipo de Censura"+ p.getTipocensura());
		System.out.println("Fecha de estreno"+ p.getFechaEstreno());
		System.out.println("Tiene sexo: "+ p.getTieneSexo());
		System.out.println("Recaudacion(En millones): "+ p.getRecaudacionMillones());
		}
	
	
	public static void testEquals(Pelicula p1, Pelicula p2) {
		System.out.println("#############################################################");
		System.out.println("Test del Equals: ");
		if(p1.equals(p2)) {
			System.out.println("Ambas partidas tienen el mismo título, mismo director y misma fecha de estreno");
			
		}else {
			System.out.println("Las dos películas no son las mismas");
		}
		
	}
	
	public static void testCompareTo(Pelicula p1, Pelicula p2) {
		System.out.println("#############################################################");
		System.out.println("Test del CompareTo: ");
		int res= p1.compareTo(p2);
		
		if(res==0) {
			System.out.println("Ambas películas son iguales");
			
		}
		if (res>0) {
			System.out.println("La película \""+p2.getTitulo()+ "\" ocurrió antes que \""+ p1.getTitulo()+"\"");
		}
		if(res<0) {
			System.out.println("La película "+p1.getTitulo() +" ocurrió antes que "+ p2.getTitulo());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}