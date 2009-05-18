package client;

import j2ee.ClientSessionBeanRemote;
import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.management.j2ee.SessionBean;

/**
 * Servlet implementation class ActionCreer
 */
public class ActionCreer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionCreer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numeroClient = Integer.parseInt(request.getParameter("numeroClient"));
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String beneficiaire = request.getParameter("beneficiaire");
		String email = request.getParameter("email");
		int numeroTelephone = Integer.parseInt(request.getParameter("numeroTelephone"));
		
		try {
			Context c = new InitialContext();
			ClientSessionBeanRemote sessionBean = (ClientSessionBeanRemote) c.lookup("/clubAnim_beansEAR/ClientSessionBean/remote");
			sessionBean.creer(numeroClient, login, password, name, beneficiaire, email, numeroTelephone);
			//response.sendRedirect("creationClientOk.html");
		} catch (Exception e) {
   			request.setAttribute("error",e);
   			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
