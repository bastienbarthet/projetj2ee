package j2ee;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.persistence.*;



@ Entity
public abstract class Produit{
	
	@Id
	private int ref;
	
	private String name;
	
	private String description;
	
	private float prix;
	
	private String cheminversImage;

	public Produit(int ref, String name, String description, float prix,
			String categorie, String sousCategorie, String cheminversImage) {
		super();
		this.ref = ref;
		this.name = name;
		this.description = description;
		this.prix = prix;
		this.cheminversImage = cheminversImage;
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
	
	public abstract String getCategorie();
	public abstract String getSousCategorie();
	
	
}