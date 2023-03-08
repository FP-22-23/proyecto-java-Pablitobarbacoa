package fp.tiposs;

import java.util.List;
import java.util.Objects;

public record Categoria(List<String> categoria, String tipocensura ) {

	public List<String> categoria() {
		return categoria;
	}

	public String tipocensura() {
		return tipocensura;
	}


	public String toString() {
		return "Categoria [categoria=" + categoria + ", tipocensura=" + tipocensura + "]";
	}


	public int hashCode() {
		return Objects.hash(categoria, tipocensura);
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(tipocensura, other.tipocensura);
	}

	

}
