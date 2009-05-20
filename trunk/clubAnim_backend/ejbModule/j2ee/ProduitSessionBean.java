package j2ee;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProduitSessionBean implements ProduitSessionBeanRemote {

	@PersistenceContext
	EntityManager em;

	
	@Override
	public ArrayList<Produit> listerProduit() {
		return (ArrayList<Produit>) em.createQuery("SELECT p FROM Produit p").getResultList();
	}

	@Override
	public ArrayList<Produit> listerProduitCategorie(String _categorie) {
		return (ArrayList<Produit>) em.createQuery("SELECT p FROM Produit p WHERE categorie=_categorie").getResultList();
	}

	@Override
	public ArrayList<Produit> listerProduitSousCategorie(String _sousCategorie) {
		return (ArrayList<Produit>) em.createQuery("SELECT p FROM Produit p WHERE sousCategorie=_sousCategorie").getResultList();
	}

	@Override
	public void ajouterProduit(Produit newProduit){
		em.persist(newProduit);

	}
	@Override
	public void modifierCheminVersImage(int idProduit, String newChemin) {
		em.find(Produit.class, idProduit).setCheminversImage(newChemin);

	}

	@Override
	public void modifierDescription(int idProduit, String newDescription) {
		em.find(Produit.class, idProduit).setDescription(newDescription);

	}

	@Override
	public void modifierPrix(int idProduit, float newPrix) {
		em.find(Produit.class, idProduit).setPrix(newPrix);

	}

	@Override
	public void modifierQuantite(int idProduit, int newQuantite) {
		em.find(Produit.class, idProduit).setQuantite(newQuantite);

	}


	@Override
	public void modifierTitre(int idProduit, String newTitre) {
		em.find(Produit.class, idProduit).setName(newTitre);

	}

	@Override
	public void supprimerProduit(int idProduit) {
		em.remove( em.find(Produit.class, idProduit) );

	}


}
