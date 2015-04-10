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
		
		Exemplaire exemplaire5=Dexemp.findByKey(5); //récupération d'un exemplaire dans la DAO(id=5)
		Exemplaire exemplaire6=Dexemp.findByKey(6); //récupération d'un exemplaire dans la DAO(id=6)
		
		Utilisateur u6=utilisateur.findByKey(6); // Demande d'un utilisateur id=6	
		
		try {
			u6.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.FEBRUARY,21).getTime(), exemplaire5);
			u6.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,8).getTime(), exemplaire6);
		} 
		catch (BiblioException e) {
			
			e.printStackTrace();
		}
		System.out.println("L'utilisateur suivant souhaite rendre un exemplaire:");
		System.out.println("****************************************************");
		System.out.println("\n"+u6);
		
		r1.retouremprunt(u6, 5); // Passage en parametre de la methode retouremprunt de l'utilisateur et de l'id de l'exemplaire
		System.out.println("\n"+u6);
		System.out.println(ea);
	}

}
