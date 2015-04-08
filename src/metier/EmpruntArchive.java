package metier;

import java.util.Date;

public class EmpruntArchive {
	
	private Date dateEmprunt;
	private Date dateRestitutionEff;
	
		
	
	

	public EmpruntArchive(){
		
		
	}
	
	
	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}

	
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
		
	}

	public void setDateRestitutionEff(Date dateRestitutionEff) {
			this.dateRestitutionEff = dateRestitutionEff;
		}

	@Override
	public String toString() {
		return "dateRestitutionEff :" + dateRestitutionEff+", dateEmprunt:" + dateEmprunt;
	}


}
