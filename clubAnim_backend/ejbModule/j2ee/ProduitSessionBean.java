package j2ee;

import java.util.ArrayList;

public class ProduitSessionBean implements ProduitSessionBeanRemote {

	@Override
	public void ajouterProduit(int idProduit, int quantite) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changerQuantiteProduit(int idProduit, int newQuantite) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Produit> listerProduit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Produit> listerProduitCategorie(String categorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Produit> listerProduitSousCategorie(String sousCategorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierCategorie(int idProduit, String newCategorie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifierCheminVersImage(int idProduit, String newChemin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifierDescription(int idProduit, String newDescription) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifierPrix(int idProduit, float newPrix) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifierQuantite(int idProduit, int newQuantite) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifierSousCategorie(int idProduit, String newSousCategorie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifierTitre(int idProduit, String newTitre) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerProduit(int idProduit) {
		// TODO Auto-generated method stub

	}

}
