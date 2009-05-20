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
public class CommandeValidee{
	
	@Id
	private int id;
	
	private String CheminAccesDevis;
	private String CheminAccesFacture;
	private String CheminAccesBonDeLivraison;
	
	

	public int getId() {
		return id;
	}



	public CommandeValidee(int id, String cheminAccesDevis,
			String cheminAccesFacture, String cheminAccesBonDeLivraison) {
		super();
		this.id = id;
		CheminAccesDevis = cheminAccesDevis;
		CheminAccesFacture = cheminAccesFacture;
		CheminAccesBonDeLivraison = cheminAccesBonDeLivraison;
	}



}