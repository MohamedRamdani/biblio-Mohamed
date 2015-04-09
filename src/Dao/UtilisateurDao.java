package Dao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.Adherent;
import metier.Employe;
import metier.EnumStatusExemplaire;
import metier.EnumcategorieEmploye;
import metier.Exemplaire;
import metier.Utilisateur;


public class UtilisateurDao {

	private Utilisateur [] UtilisateurDB=
		{
			new Adherent("DUPONT","Jacques",new GregorianCalendar(1990,Calendar.APRIL,27).getTime(),"Masculin","0682858584",1,"passadh","DUPJ"),
			new Adherent("JEAN","Paul",(new GregorianCalendar(2015,Calendar.MAY,27).getTime()),"Masculin","0785868559",2,"passadh","Jean paul"),
			new Adherent("EWING","JR",(new GregorianCalendar(2015,Calendar.MAY,27).getTime()),"Masculin","0785868559",3,"passadh","ewing jr"),
			new Employe("ARMELLE","Jeanne",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"Feminin",4,"0785825668","motpasse1","Biblio1",EnumcategorieEmploye.BIBLIOTHECAIRE),
			new Employe("POTIRON","Sophie",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"Feminin",5,"0745668339","motpasse2","Biblio2",EnumcategorieEmploye.BIBLIOTHECAIRE),
			new Employe("PASTA","Jacqueline",(new GregorianCalendar(2015,Calendar.APRIL,27).getTime()),"Feminin",6,"0695868235","motpasse3","Biblio3",EnumcategorieEmploye.BIBLIOTHECAIRE)
		};
		
	
	
	public Utilisateur findByKey(int id) {
		
		for(Utilisateur utilisateur:UtilisateurDB)
			if((utilisateur.getIdUtilisateur()==id)) return utilisateur;
					
			return null;
		}
	

}
