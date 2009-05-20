package j2ee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 * Interface visible par le client
 * 
 * @author blehmann
 * 
 */

@Remote
public interface ClientSessionBeanRemote {

	// creation client
	public void creer(String login, String role, float reduc, String password,
			String beneficiaire, String email, String tel, Adresse adr,
			ArrayList<Commande> listeDesCommande);

	// authentification
	//renvoi le role, null si c pas bon
	// a priori, role = "admin" ou "client"
	public String identifier(String login, String password);

	// espace perso

	// change password
	public boolean changerPasswordClient(String login, String ancienMotDePasse,
			String nouveauMotDePasse);

	// changer adresse
	public void changerAdresse(String login, Adresse newAdresse);

	// changer telephone
	public void changerTelephone(String login, String newTel);

	// changer mail
	public void changerMail(String login, String newMail);

	// renvoyer password client (par mail)
	public void renvoyerPasswordClient(String login);
	
	public ArrayList<Commande> listerCommandeClient(String login);

	// ----------------------------------------
	// Accessible a l'admin :

	// lister client
	public ArrayList<Client> listerClient();

	// changer reduc client
	public void changerReductionClient(String login, float newReducClient);

}
