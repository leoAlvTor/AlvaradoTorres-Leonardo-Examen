package ec.edu.ups.jpa;

import ec.edu.ups.modelo.Libro;
import ec.ups.edu.dao.LibroDAO;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer> implements LibroDAO{

	public JPALibroDAO() {
		super(Libro.class);
	}
	
}
