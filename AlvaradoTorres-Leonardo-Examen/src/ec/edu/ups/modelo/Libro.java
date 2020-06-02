package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity
@Table(name = "libro")
public class Libro implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private String codigo;
	private String nombre;
	@Column(unique = true)
	private String isbn;
	private int numeroPaginas;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private Set<Capitulo> capitulos;
	
	
	public Libro() {
		capitulos = new HashSet<Capitulo>();
	}


	public Libro(String codigo, String nombre, String isbn, int numeroPaginas, Set<Capitulo> capitulos) {
		super();
		capitulos = new HashSet<Capitulo>();
		this.codigo = codigo;
		this.nombre = nombre;
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
		this.capitulos = capitulos;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getNumeroPaginas() {
		return numeroPaginas;
	}


	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	public Set<Capitulo> getCapitulos() {
		return capitulos;
	}


	public void setCapitulos(Set<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}


	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", isbn=" + isbn + ", numeroPaginas=" + numeroPaginas
				+ ", capitulos=" + capitulos + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
   
}
