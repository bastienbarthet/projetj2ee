package j2ee;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import j2ee.Adresse;

public class ClientSessionBean implements ClientSessionBeanRemote {

	
	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public void changerPasswordClient(int idClient, String ancienMotDePasse, String nouveauMotDePasse){
		Client c = em.find(Client.class, idClient);
		if (c.getPassword()==ancienMotDePasse) c.setPassword(nouveauMotDePasse);
	}
	
	
	@Override
	public void changerAdresse( int idClient, Adresse newAdresse) {
		em.find(Client.class, idClient).setAdr(newAdresse);
	}
	
	@Override
	public void changerMail(int idClient, String newMail) {
		em.find(Client.class, idClient).setEmail(newMail);

	}

	@Override
	public void changerTelephone(int idClient, int newTel) {
		em.find(Client.class, idClient).setTel(newTel);
	}

	@Override
	public Client identifier(String _login, String _password) {
		Client c;
		if (_login.equals("admin")){
		c = (Administrateur) em.createQuery("SELECT p FROM Client p WHERE login = _login").getResultList();
		}
		else{
		
		c = (Client) em.createQuery("SELECT p FROM Client p WHERE login = _login").getResultList();
		}
		if ( c.getPassword()==_password ) return c;
		else return null;	
	}


	@Override
	public void renvoyerPasswordClient(int idClient) {
		// l'idée c'est de renvoyer le password par mail...

	}

}
