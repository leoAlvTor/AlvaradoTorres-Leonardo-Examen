package ec.ups.edu.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.jpa.JPADAOFactory;
import ec.edu.ups.jpa.JPALibroDAO;
import ec.edu.ups.modelo.Autor;
import ec.edu.ups.modelo.Capitulo;
import ec.edu.ups.modelo.Libro;
import ec.ups.edu.dao.AutorDAO;
import ec.ups.edu.dao.LibroDAO;

/**
 * Servlet implementation class ServletLibro
 */
@WebServlet("/ServletLibro")
public class ServletLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletLibro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("INICIA EL PROCESO <------------------");
		
		JPADAOFactory.getFactory().getLibroDAO().create(new Libro(0, "Hola!", "12", 500, null));
		
		
		
		System.out.println("FINALIZA EL PROCESO ------------------>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Proceso para crear un libro
		
		
	}
	
	

}
