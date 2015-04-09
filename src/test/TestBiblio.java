package test;

		import java.util.Calendar;
import java.util.GregorianCalendar;

		import Dao.ExemplaireDao;
import Dao.UtilisateurDao;
import metier.Adherent;
import metier.EmpruntEnCours;
import metier.EmpruntArchive;
import metier.Utilisateur;
		
		
public class TestBiblio {
		
				public static void main(String[]args){
				
				/*Utilisateur util1=new Utilisateur(007,"permis de tuer","James BOND");
				
				System.out.println("Creation du user :"+util1);
				ExemplaireDao Dexemp=new ExemplaireDao();
							
				EmpruntEnCours ea1=new EmpruntEnCours((new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),null,Dexemp.findByKey(3));
				EmpruntEnCours ea2=new EmpruntEnCours((new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),null,Dexemp.findByKey(4));
				EmpruntEnCours ea3=new EmpruntEnCours((new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),null,Dexemp.findByKey(5));
				
				System.out.println(ea1);*/
					
				UtilisateurDao Util1=new UtilisateurDao();	
				
				System.out.println(Util1.findByKey(2));
				
				
					
	}

}
