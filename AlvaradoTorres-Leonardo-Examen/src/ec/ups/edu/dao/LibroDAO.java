package ec.ups.edu.dao;

import java.util.List;
import java.util.Set;

import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Capitulo;
import ec.edu.ups.modelo.Libro;

public interface LibroDAO extends GenericDAO<Libro, Integer>{

	public List<Libro> getLibrosAutorCapitulo(Autor autor, Capitulo capitulo);
	
	
}
