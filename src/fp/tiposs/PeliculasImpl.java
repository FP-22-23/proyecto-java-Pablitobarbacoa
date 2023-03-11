package fp.tiposs;

import java.time.Duration;

import java.time.LocalDate;

import java.util.List;

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
private Double recaudacion;




//MÉTODOS CONSTRUCTORES



public PeliculasImpl(String titulo, String director, Double calificacion) {

	this.titulo = titulo;
	Checkers.check("Error en el título", titulo != null);
	
	this.director = director;
	Checkers.check("Error en el nombre del director", director != null);
	
	this.calificacion = calificacion;
	
}


public PeliculasImpl(String titulo, String director, List<String> estrellas, Double calificacion, Duration duracion,
		Boolean tieneSexo, Categoria c) {
	this.titulo = titulo;
	Checkers.check("Error en el título", titulo != null);
	
	this.director = director;
	Checkers.check("Error en el nombre del director", director != null);
	
	this.estrellas = estrellas;
	
	
	this.calificacion = calificacion;
	this.duracion = Duration.ZERO;
	this.tieneSexo = tieneSexo;
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
		return recaudacion;}
	public void setRecaudacion(Double recaudacion) {
		this.recaudacion = recaudacion;}


	@Override
	public void seDirector() {
		// TODO Auto-generated method stub
		
	}

		
	public Double getRatioCalificacionyRecaudacion(Double calificacion, Double recaudacion ) {
		
		return this.recaudacion/this.calificacion;
	}


	@Override
	public void setDuracion(Integer duracion) {
		// TODO Auto-generated method stub
		
	}
}
