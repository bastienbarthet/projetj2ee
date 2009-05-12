package site;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ClientSessionBean implements ClientSessionBeanRemote {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void create(String name){
		em.persist(new Client(name));	
	}

	@Override
	public String getName(String name){
		return em.find(Client.class, name).getName();
	}

	@Override
	public ArrayList<Client> listeDesClients() {
		return (ArrayList<Client>) (em.createQuery("SELECT p FROM Account p").getResultList());
	}

	@Override
	public void setName(String name, String newName){
		em.find(Client.class, name).setName(newName);
	}

}