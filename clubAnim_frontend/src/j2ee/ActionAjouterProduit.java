package j2ee;

import j2ee.ClientSessionBeanRemote;
import j2ee.Produit;
import j2ee.ProduitSessionBeanRemote;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionAjouterProduit
 */
public class ActionAjouterProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionAjouterProduit() {
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
		int  ref = Integer.parseInt(request.getParameter("ref"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		float prix = Integer.parseInt(request.getParameter("prix"));
		String categorie = request.getParameter("categorie");
		String sousCategorie = request.getParameter("sousCategorie");
		String cheminVersImage = request.getParameter("cheminVersImage");
		Produit newProduit = new Produit(ref, name, description, prix, categorie, sousCategorie, cheminVersImage);
		
		try {
			Context c = new InitialContext();
			ProduitSessionBeanRemote sessionBean = (ProduitSessionBeanRemote) c.lookup("/clubAnim_beansEAR/ProduitSessionBean/remote");
			//sessionBean.ajouterProduit(newProduit);
			//response.sendRedirect("produitAjoute.html");
		} catch (Exception e) {
   			request.setAttribute("error",e);
   			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}
