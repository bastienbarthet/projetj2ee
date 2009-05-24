package j2ee;

import j2ee.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.jboss.management.j2ee.SessionBean;

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
		String login = request.getParameter("login");
		String role = request.getParameter("role");
		Float reduc = (float)Integer.parseInt(request.getParameter("reduc"));
		String password = request.getParameter("password");
		String beneficiaire = request.getParameter("beneficiaire");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		//adresse
		String rue = request.getParameter("rue");
		String numero = request.getParameter("numero");
		String ville = request.getParameter("ville");
		int codePostal = Integer.parseInt(request.getParameter("codePostal"));
		Adresse adr = new Adresse(rue, numero, ville, codePostal);
		//commande
		ArrayList<Commande> listeDesCommande = new ArrayList<Commande>();
		
		try {
			Context c = new InitialContext();
			ClientSessionBeanRemote sessionBean = (ClientSessionBeanRemote) c.lookup("/clubAnim_beansEAR/ClientSessionBean/remote");
			sessionBean.creer(login, role, reduc, password, beneficiaire, email, tel, adr, listeDesCommande);
			//response.sendRedirect("creationClientOk.html");
		} catch (Exception e) {
   			request.setAttribute("error",e);
   			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
