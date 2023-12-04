package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.LoginDao;

/**
 * Servlet implementation class ValidadorServlet
 */
public class ValidadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidadorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario, password, msj="";
		
		usuario = request.getParameter("usuario");
		password = request.getParameter("password");
		
		try {
			if(LoginDao.validar(usuario,password)>0) {
				msj = "Bienvenido! su usuario y contraseña son correctas";
			}else {
				msj = "Algo salio mal, por favor revise su usuario y contraseña";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		msj = msj.toUpperCase();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/mensaje.jsp");
		
		request.setAttribute("mensaje", msj);
		
		dispatcher.forward(request, response);
	}

}
