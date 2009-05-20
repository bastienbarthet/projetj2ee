package j2ee;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import j2ee.Adresse;

public class ClientSessionBean implements ClientSessionBeanRemote {

	@PersistenceContext
	EntityManager em;

	@Override
	public void creer(String login, String role, float reduc, String password,
			String beneficiaire, String email, String tel, Adresse adr,
			ArrayList<Commande> listeDesCommande) {
		Client c = em.find(Client.class, login);
		if (c!=null){
			
		}
		else {
		em.persist(new Client(login, role, reduc, password, beneficiaire,
				email, tel, adr, listeDesCommande));
		}
	}

	/**
	 * renvoi le role
	 */
	@Override
	public String identifier(String _login, String _password) {
		Client c;
		c = (Client) em.createQuery(
				"SELECT p FROM Client p WHERE login = _login").getResultList();

		if (c.getPassword() == _password)
			return c.getRole();
		else
			return null;
	}

	@Override
	public boolean changerPasswordClient(String login, String ancienMotDePasse,
			String nouveauMotDePasse) {
		Client c = em.find(Client.class, login);
		if (c.getPassword() == ancienMotDePasse) {
			c.setPassword(nouveauMotDePasse);
			return true;
		} else	return false;
	}

	@Override
	public void changerAdresse(String login, Adresse newAdresse) {
		em.find(Client.class, login).setAdr(newAdresse);
	}

	@Override
	public void changerMail(String login, String newMail) {
		em.find(Client.class, login).setEmail(newMail);

	}

	@Override
	public void changerTelephone(String login, String newTel) {
		em.find(Client.class, login).setTel(newTel);
	}

	@Override
	public void renvoyerPasswordClient(String login) {
		// l'idée c'est de renvoyer le password par mail...

	}
	
	public ArrayList<Commande> listerCommandeClient(String login){
		return em.find(Client.class, login).getListeDesCommandes();
	}

	// ----------------------------------------
	// Accessible a l'admin :

	@Override
	public ArrayList<Client> listerClient() {
		return (ArrayList<Client>) em.createQuery("SELECT p FROM Client p")
				.getResultList();

	}

	@Override
	public void changerReductionClient(String login, float newReducClient) {
		em.find(Client.class, login).setReduc(newReducClient);
	}

}
