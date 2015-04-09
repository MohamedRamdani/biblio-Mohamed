package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;
import Dao.ExemplaireDao;
import Dao.UtilisateurDao;

public class TestDeBase {

	public static void main(String[] args) {
		
		//Instanciation de ExemplaireDao
		ExemplaireDao Dexemp=new ExemplaireDao();
		UtilisateurDao utilisateur=new UtilisateurDao(); 
		
		
		
		System.out.println("Demande de deux exemplaires par leur id aux Dao:");
		System.out.println("************************************************");
		
		Exemplaire exemplaire1=Dexemp.findByKey(3); //récupération d'un exemplaire dans la DAO(id=3)
		Exemplaire exemplaire2=Dexemp.findByKey(7); //récupération d'un exemplaire dans la DAO(id=7)
		System.out.println(exemplaire1); // affichage d'un exemplaire 
		System.out.println(exemplaire2); // affichage d'un deuxieme exemplaire 
		
		System.out.println("\nDemande d'un adhérent par leur id aux Dao:");
		System.out.println("******************************************");
		
		Utilisateur utilisateur1=utilisateur.findByKey(2);
		System.out.println(utilisateur1.getClass().getSimpleName()+":"+utilisateur1); // affichage d'un adhérent (id=2)
		
		
		System.out.println("\nDemande d'un employé par leur id aux Dao:");
		System.out.println("*****************************************");
		
		Utilisateur utilisateur2=utilisateur.findByKey(5);
		System.out.println(utilisateur2.getClass().getSimpleName()+":"+utilisateur2); // affichage d'un adhérent (id=5)
		
		System.out.println("\nCreation d'un emprunt en cours pour un Adherent:");
		System.out.println("**************************************************");
		
		try {
			utilisateur1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,10).getTime(), exemplaire1);
		} 
		catch (BiblioException e2) {
			e2.printStackTrace();
		}
		
		System.out.println("\nAffichage de l'utilisateur Adherent avec un emprunt en cours:");
		System.out.println("***************************************************************");
		
		System.out.println(utilisateur1.getClass().getSimpleName()+":"+utilisateur1);
		
		System.out.println("\nCreation d'un emprunt en cours pour un Employe:");
		System.out.println("**************************************************");
		
		try {
			utilisateur2.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,7).getTime(), exemplaire2);
		} 
		catch (BiblioException e1) {
			
			e1.printStackTrace();
		}
		
		System.out.println("\nAffichage de l'utilisateur Employe avec un emprunt en cours:");
		System.out.println("***************************************************************");
		
		System.out.println(utilisateur2.getClass().getSimpleName()+":"+utilisateur2);
		
		System.out.println("\nTestAdherentEnRetard");
		System.out.println("********************");
		System.out.println("L'utilisateur 'Adherent' suivant à emprunter un exemplaire le 20 Fevrier 2015,puis il tente de faire un autre Emprunt le 9 avril 2015");
		
		Utilisateur utilisateur3=utilisateur.findByKey(3);
		Exemplaire exemplaire3=Dexemp.findByKey(8); //récupération d'un exemplaire dans la DAO(id=8)
		Exemplaire exemplaire4=Dexemp.findByKey(1); //récupération d'un exemplaire dans la DAO(id=1)
		
		try {
			utilisateur3.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.FEBRUARY,20).getTime(), exemplaire3);
			utilisateur3.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,9).getTime(), exemplaire4);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(utilisateur3.getClass().getSimpleName()+":"+utilisateur3); // affichage d'un adhérent (id=3)
		
		
		System.out.println("\nTestAdherentEnRetard");
		System.out.println("********************");
		System.out.println("L'utilisateur 'Employé' suivant à emprunter un exemplaire le 21 Fevrier 2015,puis il tente de faire un autre Emprunt le 8 avril 2015");
		
		Utilisateur utilisateur4=utilisateur.findByKey(6); //Demande d'un utilisateur Employe.
		Exemplaire exemplaire5=Dexemp.findByKey(5); //récupération d'un exemplaire dans la DAO(id=5)
		Exemplaire exemplaire6=Dexemp.findByKey(6); //récupération d'un exemplaire dans la DAO(id=6)
		
		try {
			utilisateur4.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.FEBRUARY,21).getTime(), exemplaire5);
			utilisateur4.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire6);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(utilisateur3.getClass().getSimpleName()+":"+utilisateur4); // affichage d'un employe (id=6)
		
		System.out.println("\nTestAdherentTroisEmprunt");
		System.out.println("********************");
		System.out.println("L'utilisateur 'Adhérent' suivant veut emprunter 4 livres");
		
		Utilisateur utilisateur5=utilisateur.findByKey(4); //Demande d'un utilisateur Adherent.
		Exemplaire exemplaire7=Dexemp.findByKey(5); //récupération d'un exemplaire dans la DAO(id=5)
		Exemplaire exemplaire8=Dexemp.findByKey(6); //récupération d'un exemplaire dans la DAO(id=6)
		Exemplaire exemplaire9=Dexemp.findByKey(7); //récupération d'un exemplaire dans la DAO(id=5)
		Exemplaire exemplaire10=Dexemp.findByKey(8); //récupération d'un exemplaire dans la DAO(id=6)
		
		try {
			utilisateur5.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire7);
			utilisateur5.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire8);
			utilisateur5.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire9);
			utilisateur5.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire10);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(utilisateur3.getClass().getSimpleName()+":"+utilisateur5); // affichage d'un employe (id=6)
		
		
	}

}
