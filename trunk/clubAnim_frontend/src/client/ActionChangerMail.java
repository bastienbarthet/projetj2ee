package client;

import j2ee.ClientSessionBeanRemote;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionChangerMail
 */
public class ActionChangerMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionChangerMail() {
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
		int idClient = Integer.parseInt(request.getParameter("idClient"));
		String newMail = request.getParameter("newMail");
		
		try {
			Context c = new InitialContext();
			ClientSessionBeanRemote sessionBean = (ClientSessionBeanRemote) c.lookup("/beansEAR/AccountSessionBean/remote");
			sessionBean.changerMail(idClient, newMail);
			//response.sendRedirect("emailChangeAvecSucces.html");
		} catch (Exception e) {
   			request.setAttribute("error",e);
   			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
