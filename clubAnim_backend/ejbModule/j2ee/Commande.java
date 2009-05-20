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

	@OneToMany
	private ArrayList<Produit> listeDesProduits;
	private ArrayList<Integer> listeDesQuantites;
	
	
	public Commande(int id, String titreCommande, Date dateSortieMateriel,
			Date dateRetourMateriel) {
		super();
		this.id = id;
		this.titreCommande = titreCommande;
		this.dateSortieMateriel = dateSortieMateriel;
		this.dateRetourMateriel = dateRetourMateriel;
		this.listeDesProduits = new ArrayList<Produit>();
		this.listeDesQuantites = new ArrayList<Integer>();
	}

	public int getId() {
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

	public ArrayList<Produit> getListeDesProduits() {
		return listeDesProduits;
	}


	public ArrayList<Integer> getListeDesQuantites() {
		return listeDesQuantites;
	}


	public void ajouterProduit(Produit newProduit, int quantite){
		listeDesProduits.add(newProduit);
		listeDesQuantites.add(quantite);
	}


}