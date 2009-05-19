package souscategorieDeProduits;

import categorieDeProduit.StructureEtLevage;

public class PiedsLevage extends StructureEtLevage {

	public PiedsLevage(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super(ref, name, description, prix, categorie, sousCategorie,
				cheminversImage);
		// TODO Auto-generated constructor stub
	}

	public String getSousCategorie() {
		return "Pieds de Levage";
	}

}
