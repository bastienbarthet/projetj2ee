package j2ee;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	
	public static void main(String[] args){
	
		ClientSessionBean c = new ClientSessionBean();
		CommandeSessionBean comm = new CommandeSessionBean();
		ProduitSessionBean p = new ProduitSessionBean();
		
		
		Adresse adr = new Adresse("rue Camichel", "2", "TOULOUSE", 30071);
		c.creer("admin", "admin", (float) 0.7, "password", "Club Animation", "animation@bde.enseeiht.fr", "0683309577", adr, new ArrayList<Commande>() );
		
		
		c.listerCommandeClient("admin");
		
		
		
		int idCommande = comm.creerCommande("Commande Test n°1", new Date(2009,10,10), new Date(2009,10,12) );
		
		ArrayList<Produit> listePre = p.listerProduit();
		
		listePre.toString();
		p.creerProduit("PAR56 WFL", "PAR56 Court, ampoule large type WFL", (float) 6.0 , "Lumiere", "Projecteurs", "pas d image");		
		
		ArrayList<Produit> listePost = p.listerProduit();
		listePost.toString();
		
		
		//comm.ajouterProduit(idCommande, idProduit, 3);
		
		
		
		
		
	
	}
	
}
