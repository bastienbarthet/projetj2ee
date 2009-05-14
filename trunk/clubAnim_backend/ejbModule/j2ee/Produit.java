package j2ee;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.persistence.*;



@ Entity
public class Produit{
	
	@Id
	private int ref;
	
	private String name;
	
	private String description;
	
	private float prix;
	
	private String categorie;
	private String sousCategorie;
	
	private String cheminversImage;
	
	public Produit(int _ref, String _name, String _desc, float _prix){
		this.setRef(_ref);
		this.name=_name;
		this.description=_desc;
		this.setPrix(_prix);
	}
	
	// Set et Get
	
	public String getName(){
		return this.name;
	}
	public void setName(String _name){
		this.name=_name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public float getPrix() {
		return prix;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setSousCategorie(String sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	public String getSousCategorie() {
		return sousCategorie;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getRef() {
		return ref;
	}

	public void setCheminversImage(String cheminversImage) {
		this.cheminversImage = cheminversImage;
	}

	public String getCheminversImage() {
		return cheminversImage;
	}
	
	
}