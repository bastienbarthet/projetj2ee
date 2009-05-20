package j2ee;

import java.util.HashMap;

public class ListeProduitCommande {
	
	private HashMap<String, ListeProduitCategorie > listeDeCategorie;

	public ListeProduitCommande() {
		super();
		this.listeDeCategorie = new HashMap<String, ListeProduitCategorie >();
	}

	public void setListeDeCategorie(HashMap<String, ListeProduitCategorie > listeDeCategorie) {
		this.listeDeCategorie = listeDeCategorie;
	}

	public HashMap<String, ListeProduitCategorie > getListeDeCategorie() {
		return listeDeCategorie;
	}

	public void ajouter(Produit newProduit, int quantite) {
		String categorie = newProduit.getCategorie();
		ListeProduitCategorie l = listeDeCategorie.get(categorie);
		if (l==null) {
			// on creer la categorie
			ListeProduitCategorie lsc= new ListeProduitCategorie();
			listeDeCategorie.put( categorie, lsc );
			lsc.ajouter(newProduit,quantite);
			
		}
		else {
			// on ajotue a cette sous categorie
			l.ajouter(newProduit, quantite);
		}
		
	}
	


}
