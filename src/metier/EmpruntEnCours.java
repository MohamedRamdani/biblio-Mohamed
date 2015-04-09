package metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {
	
	private Date dateEmprunt;
	private Date dateRestitutionEff=null;
	private Exemplaire exemplaire;
	private EnumStatusExemplaire status;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	

	public EmpruntEnCours(Date dateEmprunt,Exemplaire exemplaire){

		this.dateEmprunt=dateEmprunt;
		this.dateRestitutionEff=dateRestitutionEff;
		exemplaire.setStatus(EnumStatusExemplaire.PRETE);
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
		return  "date de l'emprunt:" + sdf.format(dateEmprunt)+ " --- "+this.exemplaire+"\n";
	}

}
