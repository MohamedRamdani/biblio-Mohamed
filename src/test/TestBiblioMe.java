package test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import Dao.ExemplaireDao;
import metier.Adherent;
import metier.BiblioException;
import metier.Employe;
import metier.EmpruntEnCours;
import metier.EmpruntArchive;
import metier.EnumcategorieEmploye;
import metier.Exemplaire;
import metier.Utilisateur;
		
		
public class TestBiblioMe {
		
				public static void main(String[]args) {
				
			/*	Utilisateur util1=new Utilisateur(007,"permis de tuer","James BOND");
				System.out.println("Creation du user :"+util1);
				ExemplaireDao Dexemp=new ExemplaireDao();
							
				EmpruntEnCours ea1=new EmpruntEnCours((new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),null,util1);
				ea1.setEmp1(Dexemp.findByKey(3));
				ea1.setEmp1(Dexemp.findByKey(4));
				ea1.setEmp1(Dexemp.findByKey(7));
			
				System.out.println(ea1);
				
				EmpruntArchive empa=new EmpruntArchive(ea1);
								
				System.out.println(empa);*/
				
				Adherent a1 = new Adherent("edf","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs","06106525241",12,"hdsh","kshkj");
				Adherent a2 = new Adherent("edf","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs","06106525241",12,"hdsh","kshkj");
				
				
				System.out.println("<<Adherent>>\n" + a1);
				
				
				Utilisateur U1 = new Utilisateur ("aaa","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs",12,"hdsh","kshkj");
				
				Employe E1 = new Employe ("edf","jlde",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"tfs",12,"hdsh","kshkj","fsedf",EnumcategorieEmploye.BIBLIOTHECAIRE);
				
				
				System.out.println("<<Employé>>\n" + E1);
				System.out.println("<<Utilisateur>>\n" + U1);
				
				ExemplaireDao Dexemp=new ExemplaireDao();
				Exemplaire exemplaire3=Dexemp.findByKey(8);
				
			
				
				try {
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					a1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
					
				} catch (BiblioException e) {
					
					e.printStackTrace();
				}
				
				
				try {
				E1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.MARCH,4).getTime(), exemplaire3);
				E1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
				E1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
				E1.setEmpruntEnCours(new GregorianCalendar(2015,Calendar.APRIL,4).getTime(), exemplaire3);
				
				} catch (BiblioException e) {
					
					e.printStackTrace();
				}
				
				
				System.out.println("test :" + a1.getNbRetards());
				System.out.println("<<Utilisateur>>\n" + a1);
				System.out.println("Employé :" + E1);
				
				
				System.out.println("conditions emprunt : " + a2.isConditionsPretAcceptees());
		
				
		
	}

}