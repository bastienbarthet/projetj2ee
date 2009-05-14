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
public interface ProduitSessionBeanRemote {
	
	// lister produit disponible
	public ArrayList<Produit> listerProduit();

	// lister produit disponible d'une categorie spécifié
	public ArrayList<Produit> listerProduitCategorie(String categorie);

	// lister produit disponible d'une souscatégorie
	public ArrayList<Produit> listerProduitSousCategorie(String sousCategorie);


	//ajouter un produit
	public void ajouterProduit(int idProduit, int quantite);

	//supprimer un produit
	public void supprimerProduit(int idProduit);

	//changer une quantité
	public void changerQuantiteProduit(int idProduit, int newQuantite);
	
	
	// modification produit

			//modifier prix
			public void modifierPrix(int idProduit, float newPrix);

			//modifier description
			public void modifierDescription(int idProduit, String newDescription);
		
			//modifier titre
			public void modifierTitre(int idProduit, String newTitre);
		
			//modifier chemin vers image
			public void modifierCheminVersImage(int idProduit, String newChemin);
		
			//modifier quantité
			public void modifierQuantite(int idProduit, int newQuantite);
		
			//modifier catégorie
			public void modifierCategorie(int idProduit, String newCategorie);
		
			//modifier souscatégorie
			public void modifierSousCategorie(int idProduit, String newSousCategorie);


}


