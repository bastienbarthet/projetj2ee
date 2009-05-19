package categorieDeProduit;

public abstract class Son extends j2ee.Produit{

	
	
	public Son(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super(ref, name, description, prix, categorie, sousCategorie, cheminversImage);
		// TODO Auto-generated constructor stub
	}

	
	public String getCategorie(){
		return "Son";
	}
	
	public abstract String getSousCategorie();
	
}
