package souscategorieDeProduits;

import categorieDeProduit.Lumiere;

public class BrouillardEtFume extends Lumiere {

	public BrouillardEtFume(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super(ref, name, description, prix, categorie, sousCategorie,
				cheminversImage);
		// TODO Auto-generated constructor stub
	}

	public String getSousCategorie() {
		return "Brouillard et Fumé";
	}

}
