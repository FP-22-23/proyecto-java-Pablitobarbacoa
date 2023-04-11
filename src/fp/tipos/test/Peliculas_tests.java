package fp.tipos.test;

import java.time.Duration;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import fp.tiposs.Peliculas;


import fp.tiposs.Pelicula;
import fp.tiposs.TipoCensura;

@SuppressWarnings("unused")
public class Peliculas_tests {

	//Creación de una lista de actores
	public static void main(String []args) {
	List<String> listita = new LinkedList<>();
	
	String star1= "Leonardo DiCaprio";
	String star2="Margot Robbie";
	
	listita.add(star1);
	listita.add(star2);
	
	//Creación de una lista de géneros para la película
	List<String> categorias = new LinkedList<String>();
	
	String cat1= "Comedia negra";
	String cat2= "Drama biográfico";
	String cat3= "Thriller policial";
	categorias.add(cat1);
	categorias.add(cat2);
	categorias.add(cat3);
	
			
	//Utilización del método Constructor con todas las variables
	
	Peliculas p= new Pelicula("El lobo de Wall Street", "Martin Scorsese", listita, 8.2,categorias,  Duration.ofMinutes(179),TipoCensura.UA,2013, true, 392.5);
	
	
	
	System.out.println(p);
	
	//Prueba de un getter
	System.out.println("Prueba del getter del Año de Estreno: " + p.getAnyoEstreno());
	
	//Prueba de un setter
	p.setCalificacion(6.4);
	
	System.out.println("Prueba del cambio de Calificación con el setter: " + p.getCalificacion());
	
	
	//Prueba de una función auxiliar
	System.out.println("Prueba de la función auxiliar del Ratio Recaudación/Calificación: "+ p.getRatioCalificacionyRecaudacion(p.getCalificacion(), p.getRecaudacion())+ " millones/punto");
	
	
	
	//Creación de una película con mimsmo nombre, pero distinto director para utilizar el equals
	
	Peliculas p2= new Pelicula("El lobo de Wall Street", "Manolín Fernandez", 2023, 8.2);
	
	System.out.println("Codigo hash de p:" + p.hashCode() );
	System.out.println("Código hash de p2:"+ p2.hashCode());
	System.out.println("Son c1 y c2 iguales?:" + p.equals(p2));
	
	//Ahora, le vamos a poner el mismo director a p2, para ver si son iguales.
	
	p2.setDirector("Martin Scorsese");
	
	
	System.out.println("Codigo hash de p:" + p.hashCode() );
	System.out.println("Código hash de p2:"+ p2.hashCode());
	System.out.println("Son c1 y c2 iguales?:" + p.equals(p2));

}}
