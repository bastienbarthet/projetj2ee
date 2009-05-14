package j2ee;

import java.util.ArrayList;
import java.util.Date;

public class Administrateur extends Client{

	public Administrateur(int _num, String _login, String _password,
			String _name, String _beneficiaire, String _email, int _tel,
			Date creation, Date sortieMateriel, Date retourMateriel,
			ArrayList<Produit> desProduits) {
		super(_num, _login, _password, _name, _beneficiaire, _email, _tel, creation,
				sortieMateriel, retourMateriel, desProduits);
		// TODO Auto-generated constructor stub
	}

	
	
}
