package fp.tiposs;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import utiles.Checkers;
import utiles.Ficheros;


public class FactoriaPeliculas {

	public static List<Pelicula> leePeliculas(String fichero) {
		
	List<Pelicula> res= new ArrayList<>();
	List<String> lineas= Ficheros.leeFichero("Error leyendo fichero", fichero);
	lineas.remove(0);
	for(String linea: lineas) {
		Pelicula p = parsearPelicula(linea);
		res.add(p);
	}
	return res;
	
	}
	 
	
	public static Peliculas leerPeliculas2(String rutaFichero) {
		
		
		Peliculas res=null;
		try {
			Stream<Pelicula> sv=Files.lines(Paths.get(rutaFichero)).skip(1).map(FactoriaPeliculas::parsearPelicula);
			res= new PeliculasImpl(sv);
		}
		catch(IOException e) {
			System.out.println("No se ha encontrado el fichero: "+ rutaFichero);
		}
		return res;
		
	}
	
	
	private static Pelicula parsearPelicula(String lineaCSV) {
		String[] campo= lineaCSV.split(",");
		Checkers.check("La línea debe tener 10 campos", campo.length==10);
		
		String titulo= campo[0].trim();
		String director= campo[1].trim();
		List<String> estrellas= parseLista(campo[2]);
		Double calificacion = Double.valueOf(campo[3].trim());
		List<String> categoria = parseLista(campo[4]);
		Duration duracion = Duration.ofMinutes(Integer.valueOf(campo[5].replace("min", "").trim()));
		TipoCensura tipoCensura = TipoCensura.valueOf(campo[6].trim());
		LocalDate anyoEstreno= LocalDate.parse((campo[7].trim()), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Boolean tieneSexo= Boolean.valueOf((campo[8].trim().toLowerCase()));
		Double recaudacionMillones= Double.valueOf((campo[9].trim()).replace("\"", "").replace(",", "."));
		
		return new Pelicula(titulo, director, estrellas, calificacion, categoria, duracion, tipoCensura, anyoEstreno, tieneSexo, recaudacionMillones) ;
		
	}
	
	
	public static  List<String> parseLista(String cadena){

		String [] trozos=cadena.split(".");
		List<String> lista=new ArrayList<>();
		for(String t:trozos) {
			lista.add(t.trim());
			
			
		}
		
		return lista;
		
	}
	

}


