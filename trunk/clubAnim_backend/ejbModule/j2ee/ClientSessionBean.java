package j2ee;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import j2ee.Adresse;


//@DeclarationRole
public class ClientSessionBean implements ClientSessionBeanRemote {

	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void creer(int _num, String _login, String _password, String _name, String _beneficiaire,String _email, int _tel){
		em.persist(new Client(_num,_login,_password,_name,_beneficiaire,_email,_tel));
	}
	
	@Override
	public Client identifier(String _login, String _password) {
		Client c;
		c = (Client) em.createQuery("SELECT p FROM Client p WHERE login = _login").getResultList();

		if ( c.getPassword()==_password ) return c;
		else return null;	
	}
	
	
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
	public void renvoyerPasswordClient(int idClient) {
		// l'idée c'est de renvoyer le password par mail...

	}
	//----------------------------------------
	// Accessible a l'admin : 
	
	
	@Override
	public ArrayList<Client> listerClient() {
		return (ArrayList<Client>) em.createQuery("SELECT p FROM Client p").getResultList();
		
	}
	
	@Override
	public void changerReductionClient(int idClient, float newReducClient) {
		em.find(Client.class, idClient).setReduc(newReducClient);
	}

}
