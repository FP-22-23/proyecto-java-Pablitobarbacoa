package fp.tiposs;

import java.time.LocalDate;

import java.util.List;

@SuppressWarnings("unused")

public  class PeliculasImpl implements Peliculas {

	
	
	
	
	

private String titulo;
private String director;
private List<String> estrellas;
private Double calificacion;
private Integer duracion;
private Integer anyoEstreno;
private Boolean tieneSexo;




//MÉTODOS CONSTRUCTORES

public PeliculasImpl(String titulo, String director, Double calificacion) {

	this.titulo = titulo;
	this.director = director;
	this.calificacion = calificacion;
	
}


public PeliculasImpl(String titulo, String director, List<String> estrellas, Double calificacion, Integer duracion,
		Boolean tieneSexo, Categoria c) {
	this.titulo = titulo;
	this.director = director;
	this.estrellas = estrellas;
	this.calificacion = calificacion;
	this.duracion = duracion;
	this.tieneSexo = tieneSexo;
}

//MÉTODOS GETTERS Y SETTERS

	public String getTitulo() {
		return titulo;}
	public void setTitulo(String titulo) {
		this.titulo = titulo;}


	public String getDirector() {
		return director;}
	public void setDirector(String director) {
		this.director = director;}


	public List<String> getEstrellas() {
		return estrellas;}
	public void setEstrellas(List<String> estrellas) {
		this.estrellas = estrellas;}


	public Double getCalificacion() {
		return calificacion;}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;}


	public Integer getDuracion() {
		return duracion;}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;}


	public Boolean getTieneSexo() {
		return tieneSexo;}
	public void setTieneSexo(Boolean tieneSexo) {
		this.tieneSexo = tieneSexo;}
	
	public Integer getAnyoEstreno() {
		return anyoEstreno;}
	public void setAnyoEstreno(Integer anyoEstreno) {
		this.anyoEstreno = anyoEstreno;}


public String formatoCorto() {
	return "Película:" + this.titulo+ ", por el director: "+ this.director+ ", estrenada el año:"+ this.anyoEstreno;
}


@Override
public void seDirector() {
	// TODO Auto-generated method stub
	
}


@Override
public void setDuracion() {
	// TODO Auto-generated method stub
	
}


@Override
public void setTieneSexo() {
	// TODO Auto-generated method stub
	
}


@Override
public void setAnyoEstreno() {
	// TODO Auto-generated method stub
	
}






		
}
