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
	
	//creer produit
	public void creerProduit(String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage);
	
	// lister produit disponible
	public ArrayList<Produit> listerProduit();

	// lister produit disponible d'une categorie spécifié
	public ArrayList<Produit> listerProduitCategorie(String categorie);

	// lister produit disponible d'une souscatégorie
	public ArrayList<Produit> listerProduitSousCategorie(String sousCategorie);
	
	//ajouter un produit à la BD
	public void ajouterProduit(int idProduit, int idCommande, int quantite);

	//supprimer un produit à la BD
	public void supprimerProduit(int idProduit);


	// modification produit

			//changer une quantité de produit dispo à la BD
			public void modifierQuantite(int idProduit, int newQuantite);
	
			//modifier prix
			public void modifierPrix(int idProduit, float newPrix);

			//modifier description
			public void modifierDescription(int idProduit, String newDescription);
		
			//modifier titre
			public void modifierTitre(int idProduit, String newTitre);
		
			//modifier chemin vers image
			public void modifierCheminVersImage(int idProduit, String newChemin);
		

}


