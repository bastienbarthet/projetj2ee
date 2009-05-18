package j2ee;

import java.util.ArrayList;
import java.util.Date;

public class CommandeSessionBean implements CommandeSessionBeanRemote {

	@Override
	public void ajouterProduit(int idProduit, int quantite) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changerDateRetour(String newDateRetour) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changerDateSortie(String newDateSortie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void creerCommande(Date dateSortieMateriel, Date dateRetourMateriel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editerCommande(int idCommande) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Commande> listCommandeClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Commande> listerCommandes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierQuantiteProduit(int idProduit, int newQuantite) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerProduit(int idProduit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validerCommande(int idCommande) {
		// TODO Auto-generated method stub

	}

}
