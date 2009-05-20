package j2ee;

import java.util.HashMap;

public class ListeProduitCategorie {
	
	private HashMap<String, ListeProduitSousCategorie > listeDeCategorie;
	
	public ListeProduitCategorie() {
		super();
		this.listeDeCategorie = new HashMap<String, ListeProduitSousCategorie >();
	}
	
	public HashMap<String, ListeProduitSousCategorie> getListeDeCategorie() {
		return listeDeCategorie;
	}

	public void setListeDeCategorie(
			HashMap<String, ListeProduitSousCategorie> listeDeCategorie) {
		this.listeDeCategorie = listeDeCategorie;
	}
	
	public void ajouter(Produit p, int q){
		String souscategorie = p.getSouscategorie();
		ListeProduitSousCategorie l = listeDeCategorie.get(souscategorie);
		if (l==null) {
			// on creer la categorie
			ListeProduitSousCategorie lsc= new ListeProduitSousCategorie();
			listeDeCategorie.put( souscategorie, lsc );
			lsc.ajouter(p,q);
			
		}
		else {
			// on ajotue a cette sous categorie
			l.ajouter(p, q);
		}
	}
	

}
