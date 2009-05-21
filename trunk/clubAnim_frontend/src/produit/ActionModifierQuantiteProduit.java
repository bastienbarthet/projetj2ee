package produit;

import j2ee.ClientSessionBeanRemote;
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
 * Servlet implementation class ActionChangerQuantiteProduit
 */
public class ActionModifierQuantiteProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionModifierQuantiteProduit() {
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
		int newQuantite = Integer.parseInt(request.getParameter("newQuantite"));
		
		HttpSession session = request.getSession();
		String role = (String)session.getAttribute("role");
		
		if (role.equals("admin")){
			try {
				Context c = new InitialContext();
				ProduitSessionBeanRemote sessionBean = (ProduitSessionBeanRemote) c.lookup("/clubAnim_beansEAR/ProduitSessionBean/remote");
				sessionBean.modifierQuantite(idProduit, newQuantite);
				//response.sendRedirect("changementDeuantiteEffectueeAvecSucces.html");
			} catch (Exception e) {
	   			request.setAttribute("error",e);
	   			request.getRequestDispatcher("error.jsp").forward(request, response);
			}
		}
		else {
			//on redirige vers la bone page
		}
	}

}
