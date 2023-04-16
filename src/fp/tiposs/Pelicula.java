package fp.tiposs;

import java.time.Duration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import utiles.Checkers;

@SuppressWarnings("unused")

public  class Pelicula {

	
	
	
	
	



private String titulo;
private String director;
private List<String> estrellas;
private Double calificacion;
private List<String> categoria;
private Duration duracion;
private TipoCensura tipocensura;
private LocalDate fechaEstreno;
private Boolean tieneSexo;
private Double recaudacionMillones;




//MÉTODOS CONSTRUCTORES



public Pelicula(String titulo, String director,LocalDate fechaEstreno, Double calificacion) {

	this.titulo = titulo;
	Checkers.check("Error en el título", titulo != null);
	
	this.director = director;
	Checkers.check("Error en el nombre del director", director != null);
	Checkers.check("La calificación no puede ser negativa", calificacion>0);
	
	this.calificacion = calificacion;
	this.fechaEstreno=fechaEstreno;
	
}


public Pelicula(String titulo, String director, List<String> estrellas, Double calificacion,List<String> categoria, Duration duracion,TipoCensura tipoCensura, LocalDate fechaEstreno,
		Boolean tieneSexo, Double recaudacion) {
	this.titulo = titulo;
	Checkers.check("Error en el título", titulo != null);
	
	this.director = director;
	Checkers.check("Error en el nombre del director", director != null);
	Checkers.check("La calificación no puede ser negativa", calificacion>0);
	Checkers.check("La lista de estrellas no puede estar vacía", estrellas.isEmpty()==false);
	Checkers.check("La lista de categorías no puede estar vacía", categoria.isEmpty()==false);

	this.estrellas = estrellas;
	
	
	this.calificacion = calificacion;
	this.duracion = duracion;
	this.fechaEstreno=fechaEstreno;
	this.tieneSexo = tieneSexo;
	this.recaudacionMillones=recaudacion;
	this.categoria=categoria;
	this.tipocensura=tipoCensura;
}

//MÉTODOS GETTERS Y SETTERS


	public String getTitulo() {
		return titulo;}
	public void setTitulo(String titulo) {
		Checkers.check("Error en el título", titulo != null);
		this.titulo = titulo;}


	public List<String> getCategoria() {
		return categoria;}
	public void setCategoria(List<String> categoria) {
		this.categoria = categoria;}


	public TipoCensura getTipocensura() {
		return tipocensura;}
	public void setTipocensura(TipoCensura tipocensura) {
		this.tipocensura = tipocensura;}


	public Double getRecaudacionMillones() {
		return recaudacionMillones;}
	public void setRecaudacionMillones(Double recaudacionMillones) {
		this.recaudacionMillones = recaudacionMillones;}


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
	
	
	public LocalDate getFechaEstreno() {
		return fechaEstreno;}
	public void setFechaEstreno(LocalDate anyoEstreno) {
		this.fechaEstreno = anyoEstreno;}


	//Métodos auxiliares como toString, compareTo o hashCode


public String toString() {
	return "PeliculasImpl [titulo=" + titulo + ", director=" + director + ", estrellas=" + estrellas + ", calificacion="
			+ calificacion + ", categoria=" + categoria + ", duracion=" + duracion + ", tipocensura=" + tipocensura
			+ ", anyoEstreno=" + fechaEstreno + ", tieneSexo=" + tieneSexo + ", recaudacionMillones="
			+ recaudacionMillones + "]";
}


@Override
public int hashCode() {
	return Objects.hash(director, fechaEstreno, titulo);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pelicula other = (Pelicula) obj;
	return Objects.equals(director, other.director) && Objects.equals(fechaEstreno, other.fechaEstreno)
			&& Objects.equals(titulo, other.titulo);
}

//Criterio de Orden Natural en base a su fecha de estreno

public int compareTo(Pelicula p) {
	int res = getFechaEstreno()   .compareTo(p.getFechaEstreno());

	return res;
}

}

