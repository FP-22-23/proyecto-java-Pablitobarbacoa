package fp.tiposs;

import java.time.Duration;

import java.time.LocalDate;

import java.util.List;
import java.util.Objects;

import utiles.Checkers;

@SuppressWarnings("unused")

public  class PeliculasImpl implements Peliculas {

	
	
	
	
	



private String titulo;
private String director;
private List<String> estrellas;
private Double calificacion;
private Duration duracion;
private Integer anyoEstreno;
private Boolean tieneSexo;
private Double recaudacionMillones;




//MÉTODOS CONSTRUCTORES



public PeliculasImpl(String titulo, String director,Integer anyoEstreno, Double calificacion) {

	this.titulo = titulo;
	Checkers.check("Error en el título", titulo != null);
	
	this.director = director;
	Checkers.check("Error en el nombre del director", director != null);
	
	this.calificacion = calificacion;
	this.anyoEstreno=anyoEstreno;
	
}


public PeliculasImpl(String titulo, String director, List<String> estrellas, Double calificacion, Duration duracion,Integer anyoEstreno,
		Boolean tieneSexo, Double recaudacion, Categoria c) {
	this.titulo = titulo;
	Checkers.check("Error en el título", titulo != null);
	
	this.director = director;
	Checkers.check("Error en el nombre del director", director != null);
	
	this.estrellas = estrellas;
	
	
	this.calificacion = calificacion;
	this.duracion = Duration.ZERO;
	this.anyoEstreno=anyoEstreno;
	this.tieneSexo = tieneSexo;
	this.recaudacionMillones=recaudacion;
	c= null;
}

//MÉTODOS GETTERS Y SETTERS

	public String getTitulo() {
		return titulo;}
	public void setTitulo(String titulo) {
		Checkers.check("Error en el título", titulo != null);
		this.titulo = titulo;}


	public String getDirector() {
		return director;}
	
	public void setDirector(String director) {
		Checkers.check("Error en el nombre del director", director != null);
		this.director = director;}


	public List<String> getEstrellas() {
		return estrellas;}
	public void setEstrellas(List<String> estrellas) {
		this.estrellas = estrellas;}


	public Double getCalificacion() {
		return calificacion;}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;}


	public Duration getDuracion() {
		return duracion;}
	public void setDuracion(Duration duracion) {
		this.duracion = duracion;}


	public Boolean getTieneSexo() {
		return tieneSexo;}
	public void setTieneSexo(Boolean tieneSexo) {
		this.tieneSexo = tieneSexo;}
	
	
	public Integer getAnyoEstreno() {
		return anyoEstreno;}
	public void setAnyoEstreno(Integer anyoEstreno) {
		this.anyoEstreno = anyoEstreno;}
	
	
	public Double getRecaudacion() {
		return recaudacionMillones;}
	public void setRecaudacion(Double recaudacion) {
		this.recaudacionMillones = recaudacion;}


	//Función auxiliar
	public Double getRatioCalificacionyRecaudacion(Double calificacion, Double recaudacion ) {
		
		return this.recaudacionMillones/this.calificacion;
	}


	//Métodos auxiliares como toString, compareTo o hashCode
public String toString() {
		return "PeliculasImpl [titulo=" + titulo + ", director=" + director + ", estrellas=" + estrellas
				+ ", calificacion=" + calificacion + ", duracion=" + duracion + ", anyoEstreno=" + anyoEstreno
				+ ", tieneSexo=" + tieneSexo + ", recaudacionMillones=" + recaudacionMillones + "]";
	}



public int hashCode() {
	return Objects.hash(anyoEstreno, director, titulo);
}



public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PeliculasImpl other = (PeliculasImpl) obj;
	return Objects.equals(anyoEstreno, other.anyoEstreno) && Objects.equals(director, other.director)
			&& Objects.equals(titulo, other.titulo);}




}

