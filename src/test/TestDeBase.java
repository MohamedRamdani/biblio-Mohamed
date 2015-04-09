package test;

import Dao.ExemplaireDao;
import Dao.UtilisateurDao;

public class TestDeBase {

	public static void main(String[] args) {
		
		//Instanciation de ExemplaireDao
		ExemplaireDao Dexemp=new ExemplaireDao();
		UtilisateurDao utilisateur=new UtilisateurDao(); 
		
		System.out.println("Demande de deux exemplaires par leur id aux Dao:");
		
		System.out.println(Dexemp.findByKey(3)); // affichage d'un exemplaire (id=3)
		System.out.println(Dexemp.findByKey(7)+"\n"); // affichage d'un exemplaire (id=7)
		
		System.out.println("Demande d'un adhérent par leur id aux Dao:");
		
		System.out.println(utilisateur.findByKey(2)); // affichage d'un adhérent (id=2)
		
		
		

	}

}
