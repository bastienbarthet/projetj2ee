package client;

import j2ee.ClientSessionBeanRemote;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ActionChangerPassword
 */
public class ActionChangerPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionChangerPassword() {
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
		String login = request.getParameter("login");
		String ancienMotDePasse = request.getParameter("ancienMotDePasse");
		String nouveauMotDePasse = request.getParameter("nouveauMotDePasse");
		HttpSession session = request.getSession();
		String role = (String)session.getAttribute("role");
		
		if (role.equals(null)) {
			//renvoyer a l'identification
		}
		
		else if (role.equals("admin")||role.equals("client")) {
			try {
				Context c = new InitialContext();
				ClientSessionBeanRemote sessionBean = (ClientSessionBeanRemote) c.lookup("/clubAnim_beansEAR/ClientSessionBean/remote");
				sessionBean.changerPasswordClient(login, ancienMotDePasse, nouveauMotDePasse);
				//response.sendRedirect("motDePasseChangeAvecSucces.html");
			} catch (Exception e) {
	   			request.setAttribute("error",e);
	   			request.getRequestDispatcher("error.jsp").forward(request, response);
			}
		}
		
		else {
			// acces denied
		}
		
	}

}
