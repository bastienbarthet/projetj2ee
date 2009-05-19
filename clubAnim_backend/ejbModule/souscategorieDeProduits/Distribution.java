package souscategorieDeProduits;

import categorieDeProduit.CablageEtDistribution;

public class Distribution extends CablageEtDistribution {

	public Distribution(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super(ref, name, description, prix, categorie, sousCategorie,
				cheminversImage);
		// TODO Auto-generated constructor stub
	}

	public String getSousCategorie() {
		return "Distribution";
	}

}
