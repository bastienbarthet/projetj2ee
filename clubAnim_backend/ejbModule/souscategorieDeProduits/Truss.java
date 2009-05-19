package souscategorieDeProduits;

import categorieDeProduit.StructureEtLevage;

public class Truss extends StructureEtLevage {

	public Truss(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super(ref, name, description, prix, categorie, sousCategorie,
				cheminversImage);
		// TODO Auto-generated constructor stub
	}

	public String getSousCategorie() {
		return "Structure Milos M290";
	}

}
