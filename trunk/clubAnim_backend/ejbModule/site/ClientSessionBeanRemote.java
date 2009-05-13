package site;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ejb.Remote;


@Remote
public interface ClientSessionBeanRemote {

	public void create(String name);

	public void setName(String name, String newName);

	public String getName(String name);
	
	public ArrayList<Client> listeDesClients();
	
}
