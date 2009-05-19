package generateur;

import java.util.ArrayList;
import java.util.Date;

import j2ee.Adresse;
import j2ee.Client;
import j2ee.Commande;
import j2ee.Produit;

public class MainGenerator {
	Client client1 = new Client (0, "benok", "", "Benoit Estevenon", "Benoit", "benoit.estevenon@gmail.com", 62722168);
	Adresse adresse1 = new Adresse ("Rue Maynard", "32", "Toulouse", 31000);
	Produit produit1 = new Produit (10, "Test du tableau", "On teste", 0.2f);
	ArrayList<Produit> aL = new ArrayList<Produit> ();
	Commande commande1 = new Commande (0,"Benoit","Estevenon", new Date (), new Date (), new Date (), null);
}
