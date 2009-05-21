package produit;

import j2ee.ProduitSessionBeanRemote;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ActionSupprimerProduit
 */
public class ActionSupprimerProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionSupprimerProduit() {
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
		int idProduit = Integer.parseInt(request.getParameter("idProduit"));
		
		HttpSession session = request.getSession();
		String role = (String)session.getAttribute("role");
		
		if (role.equals("admin")){
			try {
				Context c = new InitialContext();
				ProduitSessionBeanRemote sessionBean = (ProduitSessionBeanRemote) c.lookup("/clubAnim_beansEAR/ProduitSessionBean/remote");
				sessionBean.supprimerProduit(idProduit);
				//response.sendRedirect("changementDeuantiteEffectueeAvecSucces.html");
			} catch (Exception e) {
	   			request.setAttribute("error",e);
			}
		}
		
		else {
			//rediriger vers l'autentification
		}
   			
	}

}
