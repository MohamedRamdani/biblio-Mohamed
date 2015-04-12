package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.EmpruntArchive;
import metier.Exemplaire;
import metier.Retour;
import metier.Utilisateur;
import Dao.ExemplaireDao;
import Dao.UtilisateurDao;

public class TestRetour {

	public static void main(String[] args) {
		
		ExemplaireDao Dexemp=new ExemplaireDao();
		UtilisateurDao utilisateur=new UtilisateurDao();
		Retour r1=new Retour();
		EmpruntArchive ea=new EmpruntArchive();
		
		Exemplaire ex1=Dexemp.findByKey(5); //récupération d'un exemplaire dans la DAO(id=5)
		Exemplaire ex2=Dexemp.findByKey(6); //récupération d'un exemplaire dans la DAO(id=6)
		
		Utilisateur ad1=utilisateur.findByKey(3); // Demande d'un utilisateur id=6	
		
		try {
			ad1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.MARCH,31).getTime(), ex1);
			ad1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), ex2);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println("L'utilisateur suivant souhaite rendre un exemplaire:");
		System.out.println("****************************************************");
		System.out.println("\n"+ad1);
		
		System.out.println("\nL'exemplaire est passé à disponible\nLa collection de l'Utilisateur diminuée\nl'Emprunt-Archivé est créé");
		r1.retouremprunt(ad1, 5); // Passage en parametre de la methode retouremprunt de l'utilisateur et de l'id de l'exemplaire
		
		System.out.println("\n**********************************************************");
		System.out.println("Affichage de l'utilisateur suite au retour d'un exemplaire");
		System.out.println("**********************************************************\n");
		System.out.println(ad1);
		
		System.out.println("\n**************************************");
		System.out.println("Affichage de l'Archivage de l'emprunt:");
		System.out.println("**************************************");
		System.out.println(ea.getArchive());
		
	}

}
