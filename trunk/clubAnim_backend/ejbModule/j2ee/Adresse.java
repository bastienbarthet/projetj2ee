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
public class Adresse{
	
	
	
	public String rue;
	public String numero;
	public String ville;
	public int codePostal;
	
	
	


}