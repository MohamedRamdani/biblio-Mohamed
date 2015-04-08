package metier;

import java.util.ArrayList;
import java.util.Date;

public class EmpruntArchive {
	
	private Date dateEmprunt;
	private Date dateRestitutionEff=null;
	private Exemplaire exemplaire;
	private Utilisateur utilisateur;
	private EnumStatusExemplaire status;
	ArrayList<EmpruntArchive> emp1=new ArrayList<EmpruntArchive>();
	
	

	public EmpruntArchive(Date dateEmprunt,Date dateRestitutionEff,Utilisateur utilisateur,Exemplaire exemplaire){

		this.dateEmprunt=dateEmprunt;
		this.dateRestitutionEff=dateRestitutionEff;
		exemplaire.setStatus(status.PRETE);
		this.utilisateur=utilisateur;
		this.exemplaire=exemplaire;
		emp1.add(this);
		
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
		return  "\n" + utilisateur+"\n" +exemplaire +"\ndateEmprunt:" + dateEmprunt
				+ "\ndate de restitution effective:" + dateRestitutionEff;
	}

}
