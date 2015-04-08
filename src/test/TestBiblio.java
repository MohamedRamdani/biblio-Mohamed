package test;

		import java.util.Calendar;
		import java.util.GregorianCalendar;

		import Dao.ExemplaireDao;
		import metier.EmpruntEnCours;
		import metier.EmpruntArchive;
		import metier.Utilisateur;
		
		
public class TestBiblio {
		
				public static void main(String[]args){
				
				Utilisateur util1=new Utilisateur(007,"permis de tuer","James BOND");
				System.out.println("Creation du user :"+util1);
				ExemplaireDao Dexemp=new ExemplaireDao();
							
				EmpruntEnCours ea1=new EmpruntEnCours((new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),null,util1);
				ea1.setEmp1(Dexemp.findByKey(3));
				ea1.setEmp1(Dexemp.findByKey(4));
				ea1.setEmp1(Dexemp.findByKey(7));
			
				System.out.println(ea1);
				
				EmpruntArchive empa=new EmpruntArchive(ea1);
								
				System.out.println(empa);
					
	}

}
