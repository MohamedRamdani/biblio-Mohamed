package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.EmpruntEnCours;
import metier.Exemplaire;
import metier.Utilisateur;
import Dao.ExemplaireDao;
import Dao.UtilisateurDao;

public class TestDeBase {

	public static void main(String[] args) {
		
		//Instanciation de ExemplaireDao
		ExemplaireDao Dexemp=new ExemplaireDao();
		UtilisateurDao utilisateur=new UtilisateurDao(); 
		
		
		System.out.println("\n**********************************************");
		System.out.println("Demande de deux exemplaires par leur id aux Dao:");
		System.out.println("************************************************");
		
		Exemplaire exemplaire1=Dexemp.findByKey(1); //récupération d'un exemplaire dans la DAO(id=3)
		Exemplaire exemplaire2=Dexemp.findByKey(2); //récupération d'un exemplaire dans la DAO(id=7)
		System.out.println(exemplaire1); // affichage d'un exemplaire 
		System.out.println(exemplaire2); // affichage du deuxieme exemplaire 
		
		System.out.println("\n****************************************");
		System.out.println("Demande d'un adhérent par leur id aux Dao:");
		System.out.println("******************************************");
		
		Utilisateur utilisateur1=utilisateur.findByKey(1);
		System.out.println(utilisateur1.getClass().getSimpleName()+":"+utilisateur1); // affichage d'un adhérent (id=1)
		
		System.out.println("\n*****************************************");
		System.out.println("Demande d'un employé par leur id aux Dao:");
		System.out.println("*****************************************");
		
		Utilisateur utilisateur2=utilisateur.findByKey(4);
		System.out.println(utilisateur2.getClass().getSimpleName()+":"+utilisateur2); // affichage d'un employé (id=4)
		
		System.out.println("\n************************************************");
		System.out.println("Creation d'un emprunt en cours pour un Adherent:");
		System.out.println("************************************************");
		
		try {
			utilisateur1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,10).getTime(), exemplaire1);
		} 
		catch (BiblioException e2) {
			e2.printStackTrace();
		}
		
		System.out.println("\n*************************************************************");
		System.out.println("Affichage de l'utilisateur Adherent avec un emprunt en cours:");
		System.out.println("*************************************************************");
		
		System.out.println(utilisateur1.getClass().getSimpleName()+":"+utilisateur1);
		
		System.out.println("\n***********************************************");
		System.out.println("Creation d'un emprunt en cours pour un Employe:");
		System.out.println("***********************************************");
		
		try {
			utilisateur2.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,7).getTime(), exemplaire2);
		} 
		catch (BiblioException e1) {
			
			e1.printStackTrace();
		}
		
		System.out.println("\n************************************************************");
		System.out.println("Affichage de l'utilisateur Employe avec un emprunt en cours:");
		System.out.println("************************************************************");
		
		System.out.println(utilisateur2.getClass().getSimpleName()+":"+utilisateur2);
		
		
	}

}
