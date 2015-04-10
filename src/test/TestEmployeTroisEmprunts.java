package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.BiblioException;
import metier.Exemplaire;
import metier.Utilisateur;
import Dao.ExemplaireDao;
import Dao.UtilisateurDao;

public class TestEmployeTroisEmprunts {

	public static void main(String[] args) {
		
		ExemplaireDao Dexemp=new ExemplaireDao();
		UtilisateurDao utilisateur=new UtilisateurDao(); 
		
		System.out.println("\n************************");
		System.out.println("TestEmployeTroisEmprunt");
		System.out.println("************************");
		System.out.println("L'utilisateur 'Employe' suivant veut emprunter 4 livres");
		
		Utilisateur utilisateur6=utilisateur.findByKey(6); //Demande d'un utilisateur Employe.
		Exemplaire exemplaire11=Dexemp.findByKey(11); //récupération d'un exemplaire dans la DAO(id=11)
		Exemplaire exemplaire12=Dexemp.findByKey(12); //récupération d'un exemplaire dans la DAO(id=12)
		Exemplaire exemplaire13=Dexemp.findByKey(13); //récupération d'un exemplaire dans la DAO(id=13)
		Exemplaire exemplaire14=Dexemp.findByKey(14); //récupération d'un exemplaire dans la DAO(id=14)
		
		try {
			utilisateur6.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire11);
			utilisateur6.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire12);
			utilisateur6.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire13);
			utilisateur6.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire14);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println(utilisateur6.getClass().getSimpleName()+":"+utilisateur6); // affichage d'un employe (id=4)
		
	}

}
