package site;

import java.io.IOException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ActionGetName extends HttpServlet {

	private static final long serialVersionUID = 943811965891795660L;

	public ActionGetName() {
        super();
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		try {
			
			Context c = new InitialContext();
			ClientSessionBeanRemote sessionBean = (ClientSessionBeanRemote) c.lookup("/clubAnim_beansEAR/ClientSessionBean/remote");
			String n = sessionBean.getName(name);

			req.setAttribute("client",new Client(name));
			
   			req.getRequestDispatcher("getName.jsp").forward(req, res);
   			
		} catch (Exception e) {
   			req.setAttribute("error",e);
   			req.getRequestDispatcher("error.jsp").forward(req, res);
		}
	}



}
