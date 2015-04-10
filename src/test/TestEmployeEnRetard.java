package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;
import Dao.ExemplaireDao;
import Dao.UtilisateurDao;

public class TestEmployeEnRetard {

	public static void main(String[] args) {
		ExemplaireDao Dexemp=new ExemplaireDao();
		UtilisateurDao utilisateur=new UtilisateurDao();
		
		System.out.println("\n********************");
		System.out.println("TestEmployeEnRetard");
		System.out.println("********************");
		System.out.println("L'utilisateur 'Employé' suivant à emprunter un exemplaire le 21 Fevrier 2015,puis il tente de faire un autre Emprunt le 8 avril 2015");
		
		Utilisateur utilisateur4=utilisateur.findByKey(5); //Demande d'un utilisateur Employe.
		Exemplaire exemplaire5=Dexemp.findByKey(5); //récupération d'un exemplaire dans la DAO(id=5)
		Exemplaire exemplaire6=Dexemp.findByKey(6); //récupération d'un exemplaire dans la DAO(id=6)
		
		try {
			utilisateur4.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.FEBRUARY,21).getTime(), exemplaire5);
			utilisateur4.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire6);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(utilisateur4.getClass().getSimpleName()+":"+utilisateur4); // affichage d'un employe (id=5)

	}

}
