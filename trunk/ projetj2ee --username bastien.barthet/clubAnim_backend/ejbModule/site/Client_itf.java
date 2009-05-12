package site;

import java.util.ArrayList;

import javax.ejb.Remote;


@Remote
public interface Client_itf {

	public abstract String getName();

	public void setName(String name, String newName);

	public int getName(String name);
	
	public ArrayList<Client> listeDesClients() ;
	
}
