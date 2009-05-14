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
	

	
	
	
	
}


