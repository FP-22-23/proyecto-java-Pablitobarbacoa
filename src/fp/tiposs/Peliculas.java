package fp.tiposs;

import java.time.LocalDate;
import java.util.List;

public class Peliculas {

	
	
	
	
	

private String titulo;
private String director;
private List<String> estrellas;
private Double calificacion;
private Integer duracion;
private Integer anyoEstreno;
private Boolean tieneSexo;


public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public List<String> getEstrellas() {
		return estrellas;
	}


	public void setEstrellas(List<String> estrellas) {
		this.estrellas = estrellas;
	}


	public Double getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}


	public Integer getDuracion() {
		return duracion;
	}


	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}


	public Boolean getTieneSexo() {
		return tieneSexo;
	}


	public void setTieneSexo(Boolean tieneSexo) {
		this.tieneSexo = tieneSexo;
	}




public Peliculas(String titulo, String director, Double calificacion) {
	super();
	this.titulo = titulo;
	this.director = director;
	this.calificacion = calificacion;
}


public Peliculas(String titulo, String director, List<String> estrellas, Double calificacion, Integer duracion,
		Boolean tieneSexo, Categoria c) {
	super();
	this.titulo = titulo;
	this.director = director;
	this.estrellas = estrellas;
	this.calificacion = calificacion;
	this.duracion = duracion;
	this.tieneSexo = tieneSexo;
}


public String formatoCorto() {
	return "Película:" + this.titulo+ ", por el director: "+ this.director+ ", estrenada el año:"+ this.anyoEstreno;
}






		
}
