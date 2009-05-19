package categorieDeProduit;

public abstract class CablageEtDistribution extends j2ee.Produit{

	
	
	public CablageEtDistribution(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super(ref, name, description, prix, categorie, sousCategorie, cheminversImage);
		// TODO Auto-generated constructor stub
	}

	
	public String getCategorie(){
		return "Divers";
	}
	
	public abstract String getSousCategorie();
	
}
