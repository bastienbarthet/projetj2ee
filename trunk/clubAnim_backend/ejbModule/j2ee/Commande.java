package j2ee;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.*;



@ Entity
public class Commande{
	
	@Id
	private int id;
	
	private String titreCommande;
	private Date dateSortieMateriel;
	private Date dateRetourMateriel;

	@OneToMany
	private ListeProduitCommande listeDesProduits;
	
	
	public Commande(int id, String titreCommande, Date dateSortieMateriel,
			Date dateRetourMateriel) {
		super();
		this.id = id;
		this.titreCommande = titreCommande;
		this.dateSortieMateriel = dateSortieMateriel;
		this.dateRetourMateriel = dateRetourMateriel;
		this.listeDesProduits = new ListeProduitCommande();
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

	public ListeProduitCommande getListeDesProduits() {
		return listeDesProduits;
	}


	public void ajouterProduit(Produit newProduit, int quantite){
		listeDesProduits.ajouter(newProduit, quantite);
	}
	
	public boolean changerQuantité(Produit p, int newQuantite){
		ListeProduitCategorie lc = listeDesProduits.getListeDeCategorie().get(p.getCategorie());
		if (lc ==null){
			return false;
		}
		else{
			ListeProduitSousCategorie lsc = lc.getListeDeCategorie().get(p.getSouscategorie());
			if (lsc==null){
				return false;
			}
			else{
				return lsc.modifierQuantite(p, newQuantite);
			}
		}
	}
	
	public void supprimerProduit(Produit p){
		ListeProduitCategorie lc = listeDesProduits.getListeDeCategorie().get(p.getCategorie());
		if (lc !=null){
			ListeProduitSousCategorie lsc = lc.getListeDeCategorie().get(p.getSouscategorie());
			if (lsc!=null){
				lsc.supprimerProduit(p);
			}
		}
	}


}