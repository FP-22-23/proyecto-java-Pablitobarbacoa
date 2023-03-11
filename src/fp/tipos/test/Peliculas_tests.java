package fp.tipos.test;

import java.time.Duration;
import java.util.ArrayList;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import fp.tiposs.Categoria;
import fp.tiposs.Peliculas;


import fp.tiposs.PeliculasImpl;

@SuppressWarnings("unused")
public class Peliculas_tests {

	public static void main(String []args) {
	List<String> listita = new LinkedList<>();
	
	String star1= "Leonardo DiCaprio";
	String star2="Margot Robbie";
	
	listita.add(star1);
	listita.add(star2);
	
	
	List<String> categorias = new LinkedList();
	
	String cat1= "Comedia negra";
	String cat2= "Drama biográfico";
	String cat3= "Thriller policial";
	categorias.add(cat1);
	categorias.add(cat2);
	categorias.add(cat3);
	
	Categoria c= new Categoria(categorias, "Más de 18");
			
	
	Peliculas p= new PeliculasImpl("El lobo de Wall Street", "Martin Scorsese", listita, 8.2, Duration.ofMinutes(179), true, 392.5, c);
	
	System.out.println(p);
	
	
	
}
}
