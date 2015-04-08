package test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import Dao.ExemplaireDao;
import metier.Adherent;
import metier.EmpruntArchive;
import metier.EmpruntEnCours;
import metier.Utilisateur;
		
	public class TestBiblioMe {
		
		public static void main(String[]args){
				
		Utilisateur util1=new Utilisateur(007,"permis de tuer","James BOND");
		System.out.println("Creation du user :"+util1);
		ExemplaireDao Dexemp=new ExemplaireDao();
				
		EmpruntArchive ea1=new EmpruntArchive((new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),null,util1,Dexemp.findByKey(3));
				
		System.out.println(ea1);

		Adherent a1 = new Adherent();
		
		System.out.println("etat : " + a1.isConditionsPretAcceptees());
		
		
		
	}

}
