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
public interface CommandeSessionBeanRemote {
	
	
	//nouveauDevis
	public void creerCommande(Date dateSortieMateriel, Date dateRetourMateriel);

	//Lister les commandes existantes
	public ArrayList<Commande> listCommandeClient();

	//editer une commande
	public void editerCommande(int idCommande);
	
			//ajouter un produit
			public void ajouterProduit(int idProduit, int quantite);
		
			//supprimer un produit
			public void supprimerProduit(int idProduit);
			
			//ajouter un produit
			public void modifierQuantiteProduit(int idProduit, int newQuantite);
		
			

	//supprimer une commande
	public void supprimerCommande(int idCommande);

	//imprimer devis 
	public void printDevis(int idCommande);

	//valider un devis (passer commande)
	public void validerCommande(int idCommande);
	
	
	//changer date de sortie materiel
	public void changerDateSortie(String newDateSortie);

	//changer date de retour materiel
	public void changerDateRetour(String newDateRetour);
	
	
	//parties admin
			//Lister les commandes existantes, totu client confondu
			public ArrayList<Commande> listerCommandes();
			
			//imprimer facture	
			public void printFacture(int idCommande);
		
			//imprimer bon de commande
			public void printBonDeCommande(int idCommande);


	
}


