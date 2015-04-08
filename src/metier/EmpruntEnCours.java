package metier;

import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {
	
	private Date dateRestitutionEff;
	private Date dateEmprunt;
		
	
	

	public EmpruntEnCours(){
		
		
	}
	
	
	
	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}



	public void setDateRestitutionEff(Date dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}



	public Date getDateEmprunt() {
		return dateEmprunt;
	}



	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}



	@Override
	public String toString() {
		return "Emprunter [dateRestitutionEff=" + dateRestitutionEff
				+ ", dateEmprunt=" + dateEmprunt + "]";
	}


}
