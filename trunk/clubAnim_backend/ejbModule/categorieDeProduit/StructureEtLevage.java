package categorieDeProduit;

public abstract class StructureEtLevage extends j2ee.Produit{

	
	
	public StructureEtLevage(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super(ref, name, description, prix, categorie, sousCategorie, cheminversImage);
		// TODO Auto-generated constructor stub
	}

	
	public String getCategorie(){
		return "Structure et Levage";
	}
	
	public abstract String getSousCategorie();
	
}
