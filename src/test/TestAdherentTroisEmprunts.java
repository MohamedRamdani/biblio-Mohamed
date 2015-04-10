package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Dao.ExemplaireDao;
import Dao.UtilisateurDao;
import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;

public class TestAdherentTroisEmprunts {

	public static void main(String[] args) {

		ExemplaireDao Dexemp=new ExemplaireDao();
		UtilisateurDao utilisateur=new UtilisateurDao(); 
		
		System.out.println("\n**************************");
		System.out.println("TestAdherentTroisEmprunt");
		System.out.println("************************");
		System.out.println("L'utilisateur 'Adhérent' suivant veut emprunter 4 livres");
		
		Utilisateur utilisateur5=utilisateur.findByKey(2); //Demande d'un utilisateur Adherent.
		Exemplaire exemplaire7=Dexemp.findByKey(7); //récupération d'un exemplaire dans la DAO(id=7)
		Exemplaire exemplaire8=Dexemp.findByKey(8); //récupération d'un exemplaire dans la DAO(id=8)
		Exemplaire exemplaire9=Dexemp.findByKey(9); //récupération d'un exemplaire dans la DAO(id=9)
		Exemplaire exemplaire10=Dexemp.findByKey(10); //récupération d'un exemplaire dans la DAO(id=10)
		
		try {
			utilisateur5.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire7);
			utilisateur5.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire8);
			utilisateur5.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire9);
			utilisateur5.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire10);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(utilisateur5.getClass().getSimpleName()+":"+utilisateur5); // affichage d'un employe (id=4)

	}

}
