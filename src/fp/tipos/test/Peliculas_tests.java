package fp.tipos.test;

import java.time.Duration;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import fp.tiposs.Peliculas;
import fp.tiposs.FactoriaPeliculas;
import fp.tiposs.Pelicula;
import fp.tiposs.TipoCensura;

@SuppressWarnings("unused")
public class Peliculas_tests {

	
	public static void main(String []args) {

		//Factoría
		Peliculas datos = FactoriaPeliculas.leerPeliculas2("data/Fichero.csv");
		
		//Creación de un tipo película
		List<String> estrellas = new LinkedList<>();
		estrellas.add("La hermana de Caillou");
		estrellas.add("Caillou");
		estrellas.add("Un mono to gracioso");
		
		List<String> categoria = new LinkedList<>();
		categoria.add("Drama");
		categoria.add("Action");
		
		Pelicula p1= new Pelicula("Caillou va al Parque 2", "Joselito Jiménez", estrellas, 7.6, categoria, Duration.ofMinutes(90), TipoCensura.UA, LocalDate.of(2020, 8, 23), true, 125.15);
		
		
		//Tests
		System.out.println("Todas las películas: " + datos);
		
		
		System.out.println("########################################################################################################");
		System.out.println("Última película de la lista datos: " + datos.getPeliculaIndice(datos.getNumeroPartidas()-1));
		
		
		System.out.println("########################################################################################################");
		datos.añadirPelicula(p1);
		System.out.println("Última película después de añadir Caillou: "+ datos.getPeliculaIndice(datos.getNumeroPartidas()-1));
		
		System.out.println("########################################################################################################");
		datos.eliminarPelicula(datos.getNumeroPartidas()-1);
		System.out.println("Última película de la lista datos después de quitar Caillou: " + datos.getPeliculaIndice(datos.getNumeroPartidas()-1));
		
		System.out.println("########################################################################################################");
		testFuncionPeliculasCategoria(datos, "Action");
	
		System.out.println("########################################################################################################");
		testFuncionContadorPorCategoria(datos, "Action");
		
		System.out.println("########################################################################################################");
		testFuncionPeliculaDirectorYActor(datos,"Top Gun: Maverick" ,"JosephKosinski","TomCruise");
		
		System.out.println("########################################################################################################");
		testFuncionContadorPorTipoCensura(datos);
		
		System.out.println("########################################################################################################");
		testGetRatioCalificacionRecaudacionYNombreSegunValor(datos, 5.0 );
	}
	

	public static void testFuncionPeliculasCategoria (Peliculas p, String categoria ) {
		System.out.println("########################################################################################################");
		System.out.println("Test Función 1(PeliculasCategoria): Crea un diccionario con las películas que hay de la categoría: " + categoria);
		System.out.println("\n");
		System.out.println(p.peliculasCategoria(categoria));
		
		
	}

	public static void testFuncionContadorPorCategoria (Peliculas p, String categoria) {
		System.out.println("########################################################################################################");
		System.out.println("Test Función 2(ContadorPorCategoria): Crea un diccionario que cuenta las películas que hay de una categoría: " + categoria);
		System.out.println(p.contadorPorCategoria(categoria));
	}


	public static void testFuncionPeliculaDirectorYActor (Peliculas p, String titulo, String director, String actor) {
		System.out.println("########################################################################################################");
		System.out.println("Test Función 3(PelículaDirectorYActor): Devuelve verdadero si la película tiene ése director y ése actor: ");
		System.out.println(p.existePeliculaDirectorYActor(titulo, director, actor));
		
	}



	public static void testFuncionContadorPorTipoCensura (Peliculas p) {
		System.out.println("########################################################################################################");
		System.out.println("Test Función 4(ContadorPorTipoCensura: Devuelve un diccionario con clave TipoCensura y valor el número de veces que aparece: ");
		System.out.println(p.contadorPorTipoCensura());
		
	}

	public static void testGetRatioCalificacionRecaudacionYNombreSegunValor(Peliculas p, Double valor) {
		System.out.println("########################################################################################################");
		System.out.println("Test Función 5(GetRatioCalificacionRecaudacionYNombreSegunValor): Devuelve un diccionario con el ratio de la calificación y la recaudación filtrando por un valor como valor y como clave el título de la película :");
		System.out.println("\n");
		System.out.println(p.getRatioCalificacionRecaudacionYNombreSegunValor(valor));
		System.out.println("Hay un número de: " + (p.getRatioCalificacionRecaudacionYNombreSegunValor(valor)).size()+"Películas que superan el ratio: "+ valor);
	}
	




}