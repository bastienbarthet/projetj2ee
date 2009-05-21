package j2ee;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CommandeSessionBean implements CommandeSessionBeanRemote {

	private int cpt=1;
	@PersistenceContext
	EntityManager em;


	@Override
	public int creerCommande(String titreCommande, Date dateSortieMateriel, Date dateRetourMateriel){
		int id = cpt++;
		em.persist(new Commande(id, titreCommande, dateSortieMateriel, dateRetourMateriel) );
		return id;
	}
	
	@Override
	public void ajouterProduit(int idCommande, int idProduit, int quantite) {
		em.find(Commande.class, idCommande).ajouterProduit(em.find(Produit.class, idProduit), quantite);
	}

	@Override
	public void changerDateRetour(int idCommande, Date newDateRetour) {
		em.find(Commande.class, idCommande).setDateRetourMateriel(newDateRetour);
	}

	@Override
	public void changerDateSortie(int idCommande, Date newDateSortie) {
		em.find(Commande.class, idCommande).setDateSortieMateriel(newDateSortie);
	}


	@Override
	public void editerCommande(int idCommande) {
		// TODO Auto-generated method stub
	}

	@Override
	public ArrayList<Commande> listerCommandes() {
		return (ArrayList<Commande>) em.createQuery("SELECT p FROM Commande p").getResultList();
		}

	
	@Override
	public void modifierQuantiteProduit(int idCommande, int idProduit, int newQuantite) {
		
		Produit p = em.find(Produit.class, idProduit);
		em.find(Commande.class, idCommande).changerQuantite(p, newQuantite);

	}

	@Override
	public void printBonDeCommande(int idCommande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printDevis(int idCommande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printFacture(int idCommande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerCommande(int idCommande) {
		em.find(Commande.class, idCommande);
		

	}

	@Override
	public void validerCommande(int idCommande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerProduit(int idCommande, int idProduit) {
		// TODO Auto-generated method stub
		
	}

}
