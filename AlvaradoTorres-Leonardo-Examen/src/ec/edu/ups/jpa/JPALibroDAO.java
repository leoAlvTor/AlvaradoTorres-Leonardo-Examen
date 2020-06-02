package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Capitulo;
import ec.edu.ups.modelo.Libro;
import ec.ups.edu.dao.LibroDAO;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer> implements LibroDAO{

	private EntityManager entityManager;
	
	public JPALibroDAO() {
		super(Libro.class);
		entityManager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}

	@Override
	public List<Libro> getLibrosAutorCapitulo(Autor autor, Capitulo capitulo) {
		String query = "Select l from libro l, capitulo c "
				+ "where l.id = c.id "
				+ "and c.autor = :autor "
				+ "and c.titulo = :titulo";
		
		TypedQuery<Libro> typedQuery = entityManager.createQuery(query, Libro.class);
		typedQuery.setParameter("autor", autor);
		typedQuery.setParameter("capitulo", capitulo);
		
		List<Libro> librosSet = typedQuery.getResultList();
		System.out.println(librosSet.toString());
		return librosSet;
		
	}
	/**
	 
	 select * from libro, capitulo where
	 capitulo.id = libro.id 
	 and capitulo.autor = ?;
	 
	 */
	
	
}
