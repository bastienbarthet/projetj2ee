package j2ee;

import j2ee.ClientSessionBeanRemote;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionChangerTelephone
 */
public class ActionChangerTelephone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionChangerTelephone() {
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
		String newTel = request.getParameter("newTel");
		
		try {
			Context c = new InitialContext();
			ClientSessionBeanRemote sessionBean = (ClientSessionBeanRemote) c.lookup("/clubAnim_beansEAR/ClientSessionBean/remote");
			sessionBean.changerTelephone(login, newTel);
			//response.sendRedirect("changementDeNumeroDeTelephoneEffectueAvecSucces.html");
		} catch (Exception e) {
   			request.setAttribute("error",e);
   			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
