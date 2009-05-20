package j2ee;

import java.util.ArrayList;
import souscategorieDeProduits.*;
import categorieDeProduit.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProduitSessionBean implements ProduitSessionBeanRemote {

	@PersistenceContext
	EntityManager em;
	int cpt = 1;

	@Override
	public void creerProduit(String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		if (sousCategorie.equals("Amplificateurs"))
			em.persist(new Amplificateurs(cpt++, name, description, prix,
					categorie, sousCategorie, cheminversImage));
		else if (sousCategorie.equals("Brouillard et Fumé"))
			em.persist(new BrouillardEtFume(cpt++, name, description, prix,
					categorie, sousCategorie, cheminversImage));
		if (sousCategorie.equals("Câblage"))
			em.persist(new Cablage(cpt++, name, description, prix, categorie,
					sousCategorie, cheminversImage));
		if (sousCategorie.equals("Consoles"))
			em.persist(new Consoles(cpt++, name, description, prix, categorie,
					sousCategorie, cheminversImage));
		if (sousCategorie.equals("Consoles et Platines"))
			em.persist(new ConsolesEtPlatines(cpt++, name, description, prix,
					categorie, sousCategorie, cheminversImage));
		if (sousCategorie.equals("Diffusion"))
			em.persist(new Diffusion(cpt++, name, description, prix, categorie,
					sousCategorie, cheminversImage));
		if (sousCategorie.equals("Effets"))
			em.persist(new Effets(cpt++, name, description, prix, categorie,
					sousCategorie, cheminversImage));
		if (sousCategorie.equals("Gradateurs"))
			em.persist(new Gradateurs(cpt++, name, description, prix,
					categorie, sousCategorie, cheminversImage));
		if (sousCategorie.equals("Microphones"))
			em.persist(new Microphones(cpt++, name, description, prix,
					categorie, sousCategorie, cheminversImage));
		if (sousCategorie.equals("Multipaires son"))
			em.persist(new MultipaireSon(cpt++, name, description, prix,
					categorie, sousCategorie, cheminversImage));
		if (sousCategorie.equals("Pieds de Levage"))
			em.persist(new PiedsLevage(cpt++, name, description, prix,
					categorie, sousCategorie, cheminversImage));
		if (sousCategorie.equals("Projecteurs"))
			em.persist(new Projecteurs(cpt++, name, description, prix,
					categorie, sousCategorie, cheminversImage));
		if (sousCategorie.equals("Traitement"))
			em.persist(new Traitement(cpt++, name, description, prix,
					categorie, sousCategorie, cheminversImage));
		if (sousCategorie.equals("Pieds"))
			em.persist(new PiedsSon(cpt++, name, description, prix, categorie,
					sousCategorie, cheminversImage));
		if (sousCategorie.equals("Structure Milos M290"))
			em.persist(new Truss(cpt++, name, description, prix, categorie,
					sousCategorie, cheminversImage));

		if (sousCategorie.equals("Divers")) {
			if (categorie.equals("Structure et Levage"))
				em.persist(new AutreLevage(cpt++, name, description, prix,
						categorie, sousCategorie, cheminversImage));
			if (categorie.equals("Lumière"))
				em.persist(new LumiereDivers(cpt++, name, description, prix,
						categorie, sousCategorie, cheminversImage));
			if (categorie.equals("Son"))
				em.persist(new DiversSon(cpt++, name, description, prix,
						categorie, sousCategorie, cheminversImage));
			if (categorie.equals("Divers"))
				em.persist(new Divers(cpt++, name, description, prix,
						categorie, sousCategorie, cheminversImage));
		}
	}

	@Override
	public ArrayList<Produit> listerProduit() {
		return (ArrayList<Produit>) em.createQuery("SELECT p FROM Produit p")
				.getResultList();
	}

	@Override
	public ArrayList<Produit> listerProduitCategorie(String _categorie) {
		return (ArrayList<Produit>) em.createQuery(
				"SELECT p FROM Produit p WHERE categorie=_categorie")
				.getResultList();
	}

	@Override
	public ArrayList<Produit> listerProduitSousCategorie(String _sousCategorie) {
		return (ArrayList<Produit>) em.createQuery(
				"SELECT p FROM Produit p WHERE sousCategorie=_sousCategorie")
				.getResultList();
	}

	@Override
	public void ajouterProduit(Produit newProduit) {
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
		em.remove(em.find(Produit.class, idProduit));

	}

}
