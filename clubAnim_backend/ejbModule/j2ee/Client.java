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

	
	@OneToMany
	private ArrayList<Commande> listeDesCommande;
	

	// Constructeur
	public Client(	int _num, 
			String _login, String _password,
			String _name, 
			String _beneficiaire,
			String _email, 
			int _tel
		){
		this.login=_login ; 
		this.password=_password; 
		this.tel = _tel;
		this.email = _email;
		this.setNum(_num);
		this.setName(_name);
		this.setBeneficiaire(_beneficiaire);

		listeDesCommande = new ArrayList<Commande>();
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