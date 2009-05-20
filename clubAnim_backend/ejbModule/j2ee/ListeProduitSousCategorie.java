package j2ee;

import java.util.ArrayList;

public class ListeProduitSousCategorie {

	private ArrayList<Produit> listeDeProduits;
	private ArrayList<Integer> listeDeQuantites;

	public ListeProduitSousCategorie() {
		super();
		this.listeDeProduits = new ArrayList<Produit>();
		this.listeDeQuantites = new ArrayList<Integer>();
	}

	public ArrayList<Produit> getListeDeProduits() {
		return listeDeProduits;
	}

	public void setListeDeProduits(ArrayList<Produit> listeDeProduits) {
		this.listeDeProduits = listeDeProduits;
	}

	public ArrayList<Integer> getListeDeQuantites() {
		return listeDeQuantites;
	}

	public void setListeDeQuantites(ArrayList<Integer> listeDeQuantites) {
		this.listeDeQuantites = listeDeQuantites;
	}

	public void ajouter(Produit p, int q) {
		listeDeProduits.add(p);
		listeDeQuantites.add((Integer) q);
	}

	public boolean modifierQuantite(Produit p, int q) {
		int pos = listeDeProduits.indexOf(p);
		if (pos != -1) {
			listeDeProduits.remove(pos);
			listeDeQuantites.remove(pos);
			listeDeProduits.add(p);
			listeDeQuantites.add((Integer) q);
			return true;
		}
		else return false;
	}

	public void supprimerProduit(Produit p){
		int pos = listeDeProduits.indexOf(p);
		listeDeProduits.remove(pos);
		listeDeQuantites.remove(pos);
	}
	
}
