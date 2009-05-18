package j2ee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 * Interface visible par le client
 * @author blehmann
 *
 */

@Remote
public interface ClientSessionBeanRemote {
	
	//creation client
	public void creer(int _num, String _login, String _password, String _name, String _beneficiaire,String _email, int _tel);
	
	//authentification
	public Client identifier(String login, String password);


	//espace perso

		//change password
		public void changerPasswordClient(int idClient, String ancienMotDePasse, String nouveauMotDePasse);

		//changer adresse
		public void changerAdresse( int idClient, Adresse newAdresse);
		
		//changer telephone
		public void changerTelephone(int idClient, int newTel);
		
		// changer mail
		public void changerMail(int idClient, String newMail);
		
		
		//renvoyer password client (par mail)
		public void renvoyerPasswordClient(int idClient);
		
		//----------------------------------------
		// Accessible a l'admin : 
		
		
		//lister client
		public ArrayList<Client> listerClient();


		//changer reduc client
		public void changerReductionClient(int idClient, float newReducClient);
	
}


