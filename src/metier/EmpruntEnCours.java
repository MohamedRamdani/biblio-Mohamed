package metier;

import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {
	
	private Date dateEmprunt;
	private Date dateRestitutionEff=null;
	private Exemplaire exemplaire;
	private EnumStatusExemplaire status;
	
	
	

	public EmpruntEnCours(Date dateEmprunt,Date dateRestitutionEff,Exemplaire exemplaire){

		this.dateEmprunt=dateEmprunt;
		this.dateRestitutionEff=dateRestitutionEff;
		this.exemplaire=exemplaire;
		
		}
	
	
	public void setEmp1(Exemplaire exemplaire) {
		
		exemplaire.setStatus(status.PRETE);
		this.exemplaire=exemplaire;
		
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
		return  "\ndate de l'emprunt:" + dateEmprunt
				+ "\ndate de restitution effective:" + dateRestitutionEff;
	}

}
