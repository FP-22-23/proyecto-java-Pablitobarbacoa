package fp.tiposs;

import java.util.List;

public interface Peliculas {

	
	String getTitulo();
	void setTitulo(String titulo);
	
	
	String getDirector();
	void seDirector();
	
	List<String> getEstrellas();
	void setEstrellas(List<String> estrellas);
	
	
    Double getCalificacion();
    void setCalificacion(Double calificacion);
    
    Integer getDuracion();
    void setDuracion();
    
    Boolean getTieneSexo();
    void setTieneSexo();
    
    Integer getAnyoEstreno();
    void setAnyoEstreno();
}