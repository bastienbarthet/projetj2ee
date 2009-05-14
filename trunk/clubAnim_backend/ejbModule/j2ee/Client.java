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
public class Client{
	
	@Id
	private int id;
	
	private float reduc;
	private String login;
	private String password;
	private String beneficiaire;
	private String email;
	private int tel;
	private Adresse adr;
	private Date dateCreation;
	private Date dateSortieMateriel;
	private Date dateRetourMateriel;
	
	@OneToMany
	private ArrayList<Produit> listeDesProduits;
	

	// Constructeur
	public Client(	int _num, 
			String _login, String _password,
			String _name, 
			String _beneficiaire,
			String _email, 
			int _tel, 
			Date _dateCreation, 
			Date _dateSortieMateriel, 
			Date _dateRetourMateriel, 
			ArrayList<Produit> _listeDesProduits
		){
		this.login=_login ; 
		this.password=_password; 
		this.tel = _tel;
		this.email = _email;
		this.setNum(_num);
		this.setName(_name);
		this.setBeneficiaire(_beneficiaire);
		this.setDateCreation(_dateCreation);
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
		this.login = name;
	}


	public String getName() {
		return login;
	}


	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}


	public String getBeneficiaire() {
		return beneficiaire;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public Date getDateCreation() {
		return dateCreation;
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




	public void setPassword(String password) {
		this.password = password;
	}




	public String getPassword() {
		return password;
	}



	public void setAdr(Adresse adr) {
		this.adr = adr;
	}



	public Adresse getAdr() {
		return adr;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getEmail() {
		return email;
	}



	public void setTel(int tel) {
		this.tel = tel;
	}



	public int getTel() {
		return tel;
	}



	public void setReduc(float reduc) {
		this.reduc = reduc;
	}



	public float getReduc() {
		return reduc;
	}
	
	
	
	
	
	


}