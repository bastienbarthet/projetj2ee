package categorieDeProduit;

public abstract class Lumiere extends j2ee.Produit{

	
	
	public Lumiere(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super(ref, name, description, prix, categorie, sousCategorie, cheminversImage);
		// TODO Auto-generated constructor stub
	}

	
	public String getCategorie(){
		return "Lumière";
	}
	
	public abstract String getSousCategorie();
	
}
