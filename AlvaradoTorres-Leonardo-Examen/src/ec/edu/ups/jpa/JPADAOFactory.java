package ec.edu.ups.jpa;

import ec.ups.edu.dao.AutorDAO;
import ec.ups.edu.dao.CapituloDAO;
import ec.ups.edu.dao.DAOFactory;
import ec.ups.edu.dao.LibroDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public LibroDAO getLibroDAO() {
		return null;
	}

	@Override
	public CapituloDAO getCapituloDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AutorDAO getAutorDAO() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
