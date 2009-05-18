package client;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Action extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6763938993184107165L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

            String fc = req.getParameter("function");
            if (fc.equals("function")
                    || fc.equals("setName")
                    || fc.equals("nouveau")
                    || fc.equals("getName")
                    ) {
                    res.sendRedirect(fc+".html");
                    return;      
            }
            else if (fc.equals("liste")) {
            	try {
            		/*
            		Context c = new InitialContext();
        			ClientSessionBeanRemote sessionBean = (ClientSessionBeanRemote) c.lookup("/clubAnim_beansEAR/ClientSessionBean/remote");
        			ArrayList<Client> liste =  sessionBean.listeDesClients();
            		
        			req.setAttribute("liste",liste);
           			req.getRequestDispatcher("liste.jsp").forward(req, res);
           			
           			*/
        		} catch (Exception e) {
        			
        		}
            }
    }

}

