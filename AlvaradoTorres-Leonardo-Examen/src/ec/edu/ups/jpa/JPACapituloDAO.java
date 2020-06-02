package ec.edu.ups.jpa;

import ec.edu.ups.modelo.Capitulo;
import ec.ups.edu.dao.CapituloDAO;

public class JPACapituloDAO extends JPAGenericDAO<Capitulo, Integer> implements CapituloDAO{
	public JPACapituloDAO() {
		super(Capitulo.class);
	}
}
