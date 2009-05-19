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
	private String login;
	

	private String role;
	private float reduc;
	private String password;
	private String beneficiaire;
	private String email;
	private String tel;
	private Adresse adr;

	
	@OneToMany
	private ArrayList<Commande> listeDesCommande;
	

	public Client(String login, String role, float reduc, String password,
			String beneficiaire, String email, String tel, Adresse adr,
			ArrayList<Commande> listeDesCommande) {
		super();
		this.login = login;
		this.role = role;
		this.reduc = reduc;
		this.password = password;
		
		// nom client (exemple "BDE IEP Toulouse", etc..)
		this.beneficiaire = beneficiaire;
		
		this.email = email;
		this.tel = tel;
		this.adr = adr;
		this.listeDesCommande = listeDesCommande;
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



	public void setListeDesCommandes(ArrayList<Commande> listeDesCommandes) {
		this.listeDesCommande = listeDesCommandes;
	}


	public ArrayList<Commande> getListeDesCommandes() {
		return listeDesCommande;
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



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getTel() {
		return tel;
	}



	public void setReduc(float reduc) {
		this.reduc = reduc;
	}



	public float getReduc() {
		return reduc;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getRole() {
		return role;
	}
	
	
	
	
	
	


}