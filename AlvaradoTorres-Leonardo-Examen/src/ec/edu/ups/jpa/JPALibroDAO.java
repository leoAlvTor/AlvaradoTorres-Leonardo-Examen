package ec.edu.ups.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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

		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Tuple> libroQuery = builder.createTupleQuery();
		((org.eclipse.persistence.jpa.JpaQuery)libroQuery).getDatabaseQuery().dontMaintainCache();
		Root<Libro> libroRoot = libroQuery.from(Libro.class);
		Root<Capitulo> capituloRoot = libroQuery.from(Capitulo.class);
		
		libroQuery.multiselect(libroRoot.get("codigo"), capituloRoot.get("libro"), capituloRoot.get("autor"), capituloRoot.get("titulo"));
		
		Predicate[] predicates = new Predicate[3];
		predicates[0] = builder.equal(libroRoot.get("codigo"), capituloRoot.get("codigo"));
		predicates[1] = builder.equal(capituloRoot.get("autor"), autor);
		predicates[2] = builder.equal(capituloRoot.get("titulo"), capitulo.getTitulo());
		
		libroQuery.where(predicates);
		entityManager.createQuery(libroQuery).getResultList();
		
		TypedQuery<Tuple> tq = entityManager.createQuery(libroQuery);
		for(Tuple t : tq.getResultList()) {
			System.out.println(t.get("codigo"));
			
		}
				
		return null;
		
	}
	/**
	 
	 select * from libro, capitulo where
	 capitulo.id = libro.id 
	 and capitulo.autor = ?;
	 
	 */
	
	
}
