package fp.tipos.test;

import fp.tiposs.FactoriaPeliculas;
import fp.tiposs.Peliculas;
import fp.tiposs.TipoCensura;

public class PeliculasStream_test {
	
	public static void main(String[] args) {
		Peliculas datos = FactoriaPeliculas.leerPeliculas2("data/Fichero.csv");
		
		
		System.out.println("########################################################################################################");
		System.out.println("-----------------------------------------ENTREGA FINAL BLOQUE I-----------------------------------------");
		testFuncionExistePeliculaDirectorYActor1(datos, "Top Gun: Maverick","JosephKosinski","TomCruise");
		testFuncionContadorPorTipoCensura2(datos);
		testFuncionPeliculasCategoria2(datos, "Action");
		testFuncionGetPeliculaMaxRecaudacionPorCategoria(datos, "Action");
		testFuncionGetNPeliculasJustoMásRecaudacionQue(datos, 24.3, 10);
		
		
		System.out.println("----------------------------------------Entrega FINAL BLOQUE II-----------------------------------------");
		testFuncionContadorPorTipoCategoria2(datos);
		testFuncionGetMediaRecaudaciones(datos);
		testFuncionGetNPeliculasMaxRecaudacion(datos, 15);
		testFuncionGetNMayorCalificacionDeTipoCensura(datos, TipoCensura.PG, 12);
		testFuncionMaxCalificacionDeAnyo(datos);
		
	}
	
	public static void testFuncionExistePeliculaDirectorYActor1(Peliculas p,String titulo, String director, String actor) {
	System.out.println("########################################################################################################");
	System.out.println();
	System.out.println("Test Función 1 Bloque I (ExistePeliculaDirectorYActor1): Devuelve un Booleano acorde si la película "+titulo+ " contiene al director "+director+ " y al actor " + actor);
	System.out.println(p.existePeliculaDirectorYActor1(titulo, director, actor));
	System.out.println();
	
	}
	
	public static void testFuncionContadorPorTipoCensura2(Peliculas p){
		System.out.println("########################################################################################################");
		System.out.println();
		System.out.println("Test Función 2 Bloque I(ContadorPorTipoCensura2): Es una función que cuenta según los valores del Tipo Censura");
		System.out.println(p.contadorPorTipoCensura2());
		System.out.println();
	}

	public static void testFuncionPeliculasCategoria2(Peliculas p,String categoria) {
		System.out.println("########################################################################################################");
		System.out.println();
		System.out.println("Test Función 3 Bloque I(PeliculasCategoria2): Devuelve una lista con los títulos de las películas que presentan la categoría: "+ categoria);
		System.out.println(p.peliculasCategoria2(categoria));
		System.out.println();
	}
	
	public static void testFuncionGetPeliculaMaxRecaudacionPorCategoria(Peliculas p,String categoria) {
		System.out.println("########################################################################################################");
		System.out.println();
		System.out.println("Test Función 4 Bloque I(GetPeliculaMaxRecaudacionPorCategoria): Es una función que cuenta vuelve el título de la película que tiene más recaudación de la categoría: "+ categoria);
		System.out.println(p.getPeliculaMaxRecaudacionPorCategoria(categoria));
		System.out.println();
	}
	
	public static void testFuncionGetNPeliculasJustoMásRecaudacionQue (Peliculas p,Double n, Integer limite) {
		System.out.println("########################################################################################################");
		System.out.println();
		System.out.println("Test Función 5 Bloque I(testFuncionGetNPeliculasJustoMásRecaudacionQue): Es una función que devuelve una lista de las "+ limite+" peliculas que tienen más recaudación que "+n+ " millones." );
		System.out.println(p.getNPeliculasJustoMásRecaudacionQue(n, limite));
		System.out.println();
	}
	
	public static void testFuncionContadorPorTipoCategoria2(Peliculas p) {
		System.out.println("########################################################################################################");
		System.out.println();
		System.out.println("Test Funcion 1 Bloque II(ContadorPorTipoCategoria2): Es una función que cuenta por el tipo de categoría");
		System.out.println(p.contadorPorTipoCategoria2());
		System.out.println();
	}
	
	public static void testFuncionGetMediaRecaudaciones(Peliculas p) {
		System.out.println("########################################################################################################");
		System.out.println();
		System.out.println("Test Funcion 2 Bloque II(): Es una función que devuelve la media de las recaudaciones");
		System.out.println(p.getMediaRecaudaciones());
		System.out.println();
	}
	
	
	public static void testFuncionGetNPeliculasMaxRecaudacion(Peliculas p,Integer n) {
		System.out.println("########################################################################################################");
		System.out.println();
		System.out.println("Test Funcion 3 Bloque II(): Es una función que devuelve el "+ n +" número de películas con el máximo de recaudación" );
		System.out.println(p.getNPeliculasMaxRecaudacion(n));
		System.out.println();
	}
	
	public static void testFuncionGetNMayorCalificacionDeTipoCensura(Peliculas p,TipoCensura tipo, Integer n) {
		System.out.println("########################################################################################################");
		System.out.println();
		System.out.println("Test Funcion 4 Bloque II(): Es una función que devuelve el "+n+" número de calificaciones según el tipo de censura "+tipo);
		System.out.println(p.getNMayorCalificacionDeTipoCensura(tipo, n));
		System.out.println();
	}
	
	public static void testFuncionMaxCalificacionDeAnyo(Peliculas p) {
		System.out.println("########################################################################################################");
		System.out.println();
		System.out.println("Test Funcion 5 Bloque II(): Es una función que devuelve el máximo de calificación de una película por cada año");
		System.out.println(p.maxCalificacionDeAnyo());
		System.out.println();
	}
	
	
}
