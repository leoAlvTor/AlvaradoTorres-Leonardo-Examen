package ec.ups.edu.dao;

public abstract class DAOFactory {

	protected static DAOFactory factory = new JPADAOFactory();
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract LibroDAO getLibroDAO();
	public abstract CapituloDAO getCapituloDAO();
	public abstract TelefonoDAO getTelefonoDAO();
	
}
