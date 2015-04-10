package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Dao.ExemplaireDao;
import Dao.UtilisateurDao;
import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestAdherentEnRetard {

	public static void main(String[] args) {
		
		ExemplaireDao Dexemp=new ExemplaireDao();
		UtilisateurDao utilisateur=new UtilisateurDao();
		
		System.out.println("\n********************");
		System.out.println("TestAdherentEnRetard");
		System.out.println("********************");
		System.out.println("L'utilisateur 'Adherent' suivant à emprunter un exemplaire le 20 Fevrier 2015,puis il tente de faire un autre Emprunt le 9 avril 2015");
		
		Utilisateur utilisateur3=utilisateur.findByKey(3);
		Exemplaire exemplaire3=Dexemp.findByKey(3); //récupération d'un exemplaire dans la DAO(id=3)
		Exemplaire exemplaire4=Dexemp.findByKey(4); //récupération d'un exemplaire dans la DAO(id=4)
		
		try {
			utilisateur3.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.FEBRUARY,20).getTime(), exemplaire3);
			utilisateur3.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,9).getTime(), exemplaire4);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(utilisateur3.getClass().getSimpleName()+":"+utilisateur3); // affichage d'un adhérent (id=3)
		
		

	}

}
