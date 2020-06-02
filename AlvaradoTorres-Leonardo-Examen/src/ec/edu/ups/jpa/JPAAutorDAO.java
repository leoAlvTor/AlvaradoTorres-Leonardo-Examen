package ec.edu.ups.jpa;

import ec.edu.ups.modelo.Autor;
import ec.ups.edu.dao.AutorDAO;

public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer> implements AutorDAO{

	public JPAAutorDAO() {
		super(Autor.class);
	}
	
}
