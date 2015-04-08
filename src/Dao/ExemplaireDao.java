package Dao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import metier.EnumStatusExemplaire;
import metier.Exemplaire;


public class ExemplaireDao {

	private Exemplaire [] ExemplaireDB=
		{
			new Exemplaire(1,new GregorianCalendar(1990,Calendar.APRIL,27).getTime(),"isbn",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(2,new GregorianCalendar(1990,Calendar.MAY,5).getTime(),"isbn2",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(3,new GregorianCalendar(1990,Calendar.MAY,5).getTime(),"isbn3",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(4,new GregorianCalendar(1990,Calendar.MAY,5).getTime(),"isbn4",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(5,new GregorianCalendar(1990,Calendar.JUNE,10).getTime(),"isbn5",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(6,new GregorianCalendar(1990,Calendar.JUNE,10).getTime(),"isbn6",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(7,new GregorianCalendar(1990,Calendar.JUNE,10).getTime(),"isbn7",EnumStatusExemplaire.DISPONIBLE),
			new Exemplaire(8,new GregorianCalendar(1990,Calendar.JUNE,10).getTime(),"isbn8",EnumStatusExemplaire.DISPONIBLE)
		};
	
	
	public Exemplaire findByKey(int id) {
		
		for(Exemplaire exemplaire:ExemplaireDB)
			if((exemplaire.getIdExemplaire()==id)) return exemplaire;
					
			return null;
		}
	
	
}
