package souscategorieDeProduits;

import categorieDeProduit.Son;

public class ConsolesEtPlatines extends Son {

	public ConsolesEtPlatines(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super(ref, name, description, prix, categorie, sousCategorie,
				cheminversImage);
		// TODO Auto-generated constructor stub
	}

	public String getSousCategorie() {
		return "Consoles et Platines";
	}

}
