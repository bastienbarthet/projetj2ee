package j2ee;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.*;



@ Entity
public class Commande{
	
	@Id
	private int id;
	
	private String titreCommande;
	
	private Date dateSortieMateriel;
	private Date dateRetourMateriel;
	
	
	private class Couple{
		public Produit produit;
		public int quantite;
	}
	
	@OneToMany
	private ArrayList<Produit> listeDesProduits;
	
	
	

	// Constructeur
	public Commande(	int _num, 
			String _name, 
			Date _dateSortieMateriel, 
			Date _dateRetourMateriel, 
			ArrayList<Produit> _listeDesProduits
		){
		this.setNum(_num);
		this.setName(_name);
		this.setDateRetourMateriel(_dateRetourMateriel);
		this.setDateSortieMateriel(_dateSortieMateriel);
	}


	
	// Set et Get
	public void setNum(int num) {
		this.id = num;
	}


	public int getNum() {
		return id;
	}


	public void setName(String name) {
		this.titreCommande = name;
	}


	public String getName() {
		return titreCommande;
	}


	public void setDateSortieMateriel(Date dateSortieMateriel) {
		this.dateSortieMateriel = dateSortieMateriel;
	}


	public Date getDateSortieMateriel() {
		return dateSortieMateriel;
	}


	public void setDateRetourMateriel(Date dateRetourMateriel) {
		this.dateRetourMateriel = dateRetourMateriel;
	}


	public Date getDateRetourMateriel() {
		return dateRetourMateriel;
	}


	public void setListeDesProduits(ArrayList<Produit> listeDesProduits) {
		this.listeDesProduits = listeDesProduits;
	}


	public ArrayList<Produit> getListeDesProduits() {
		return listeDesProduits;
	}





}