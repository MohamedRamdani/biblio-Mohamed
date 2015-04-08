package test;

import Dao.ExemplaireDao;
import metier.EmpruntArchive;

public class TestEmpruntArchive {
	
	public static void main(String[]args){
		
		EmpruntArchive ea1=new EmpruntArchive();
		//ea1.setDateEmprunt(07/08/2015);
		ExemplaireDao Dexemp=new ExemplaireDao();
		
		System.out.println("Emprunt en cours :"+ea1);
		
		System.out.println("\n");
		System.out.println("Voici le livre rechercher :"+Dexemp.findByKey(3));
		
	}

}
