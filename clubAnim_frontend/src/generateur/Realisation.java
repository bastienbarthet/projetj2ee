package generateur;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import j2ee.Client;
import j2ee.Commande;
import j2ee.Produit;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;



public class Realisation {


	private static HeaderFooter entete (Commande cmd, Client cl) {
		Paragraph p1 = new Paragraph ();
		Chunk ck1 = new Chunk ("Club Animation de l'E.N.S.E.E.I.H.T.\n");
		Chunk ck2 = new Chunk ("2 rue Charles Camichel\n");
		Chunk ck3 = new Chunk ("31071 Toulouse\n");
		Chunk ck4 = new Chunk ("animation@bde.enseeiht.fr\n");
		Chunk ck8 = new Chunk ("Siret 77695112100016");
		p1.add(ck1);
		p1.add(ck2);
		p1.add(ck3);
		p1.add(ck4);
		p1.add(ck8);
		

		
		Paragraph p3 = new Paragraph ();
		Chunk ck9 = new Chunk ("Bénéficiaire\n",new Font (Font.TIMES_ROMAN,Font.DEFAULTSIZE,Font.BOLD));
		Chunk ck5 = new Chunk (cmd.getBeneficiaire()+ "\n");
		Chunk ck6 = new Chunk (cl.getAdr().getNumero() + cl.getAdr().getRue() + "\n");
		Chunk ck7 = new Chunk (cl.getAdr().getCodePostal() + cl.getAdr().getVille());
		p3.add(ck9);
		p3.add(ck5);
		p3.add(ck6);
		p3.add(ck7);
		
		float [] f = {2.0f,1.0f,0.5f,1.5f};
		PdfPTable t1 = new PdfPTable(f);
		t1.setWidthPercentage(100.0f);
		t1.getDefaultCell().setBorderColor(Color.WHITE);
		t1.getDefaultCell().setHorizontalAlignment(PdfPCell.ALIGN_JUSTIFIED);
		t1.getDefaultCell().setVerticalAlignment(PdfPCell.ALIGN_TOP);
		t1.setSpacingBefore(0);
		t1.setSpacingAfter(10f);
		t1.addCell(p1);
		try {
			Image i = Image.getInstance("/media/STORE'N'GO/J2E/Logo.jpg");
			i.setCompressionLevel(9);
			t1.addCell(i);
		} catch (BadElementException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		t1.addCell("");
		t1.addCell(p3);
		
		PdfPTable t2 = new PdfPTable (1);
		t2.setWidthPercentage(100f);
		t2.getDefaultCell().setBackgroundColor(Color.LIGHT_GRAY);
		t2.getDefaultCell().setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
		t2.getDefaultCell().setVerticalAlignment(PdfPCell.ALIGN_CENTER);
		t2.getDefaultCell().setBorder(0);
		t2.setSpacingAfter(10f);
		t2.addCell("Commande n° " + cmd.getNum());
		
		Paragraph p4 = new Paragraph ();
		p4.add(t1);
		p4.add(t2);
		

		
		HeaderFooter hf = new HeaderFooter (p4, false);
		hf.setBorderWidth(0);
		hf.setAlignment(HeaderFooter.ALIGN_CENTER);
		return hf;
	}
	
	private static HeaderFooter piedDePage () {
		HeaderFooter hf = new HeaderFooter(new Phrase(),true);
		hf.setAlignment(HeaderFooter.ALIGN_CENTER);
		hf.setBorderWidthBottom(0);
		return hf;
	}

	private static PdfPTable tableauCommande (Commande cmd) {
		float [] tailles = {5.0f,1.0f,1.0f,1.0f};
		PdfPTable table1 = new PdfPTable (tailles);
		for (int i = 0; i<cmd.getListeDesProduits().size(); i++) {
			Produit prod1 = cmd.getListeDesProduits().get(i);
			Phrase ph1 = new Phrase (prod1.getCategorie() + " --> " + prod1.getSousCategorie() + "\n");
			ph1.add("\t" + prod1.getName());
			table1.addCell(ph1);
			table1.addCell("");
			table1.addCell(prod1.getCategorie());
			table1.addCell((new Float (prod1.getPrix())).toString());
		}
		return table1;
	}
	
	public static void generate (Commande cmd, Client cl) {
		Document doc = new Document ();
		try {
			PdfWriter.getInstance(doc, new FileOutputStream("/media/STORE'N'GO/TESTPDF.pdf"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		doc.setHeader(entete(cmd, cl));
		doc.setFooter(piedDePage());
		doc.open();
		try {
			doc.add(tableauCommande(cmd));
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		doc.close();
	}
	
}