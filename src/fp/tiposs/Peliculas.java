package fp.tiposs;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface Peliculas {

	
	String getTitulo();
	void setTitulo(String titulo);
	
	
	String getDirector();
	void setDirector(String director);
	
	List<String> getEstrellas();
	void setEstrellas(List<String> estrellas);
	
	
    Double getCalificacion();
    void setCalificacion(Double calificacion);
    
    Duration getDuracion();
    void setDuracion(Duration duracion);
    
    Boolean getTieneSexo();
    void setTieneSexo(Boolean tieneSexo);
    
    LocalDate getAnyoEstreno();
    void setAnyoEstreno(LocalDate anyoEstreno);
    
    Double getRecaudacion();
    void setRecaudacion(Double recaudacion);
    
    
    
    //PROPIEDAD DE TIPO AUXILIAR
    
    
     Double getRatioCalificacionyRecaudacion(Double calificacion, Double recaudacion );
}