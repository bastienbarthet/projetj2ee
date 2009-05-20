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
	
	
	//nouvelleCommande
	public int creerCommande(String titreCommande, Date dateSortieMateriel, Date dateRetourMateriel);

	//editer une commande
	// fou un idCommande dans la session?
	public void editerCommande(int idCommande);
	
			//ajouter un produit
			public void ajouterProduit(int idCommande, int idProduit, int quantite);
		
			//supprimer un produit
			public void supprimerProduit(int idCommande, int idProduit);
			
			//ajouter un produit
			public void modifierQuantiteProduit(int idCommande, int idProduit, int newQuantite);
			
			//changer date de sortie materiel
			public void changerDateSortie(int idCommande, Date newDateSortie);

			//changer date de retour materiel
			public void changerDateRetour(int idCommande, Date newDateRetour);
			

	//supprimer une commande
	public void supprimerCommande(int idCommande);

	//imprimer devis 
	public void printDevis(int idCommande);

	//valider un devis (passer commande)
	public void validerCommande(int idCommande);
	
	
	//parties admin
			//Lister les commandes existantes, totu client confondu
			public ArrayList<Commande> listerCommandes();
			
			//imprimer facture	
			public void printFacture(int idCommande);
		
			//imprimer bon de commande
			public void printBonDeCommande(int idCommande);


	
}


