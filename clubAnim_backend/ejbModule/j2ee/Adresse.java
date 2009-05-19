package j2ee;
import javax.persistence.*;


@ Entity
public class Adresse{
	
	public String numero;
	public String ville;
	public int codePostal;
	public String rue;	
	
	public Adresse(String rue, String numero, String ville, int codePostal) {
		this.rue = rue;
		this.numero = numero;
		this.ville = ville;
		this.codePostal = codePostal;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	
}