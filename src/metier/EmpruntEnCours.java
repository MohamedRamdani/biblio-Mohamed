package metier;

import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {
	
	private Date dateEmprunt;
	private Date dateRestitutionEff=null;
	private Exemplaire exemplaire;
	private Utilisateur utilisateur;
	private EnumStatusExemplaire status;
	ArrayList<Exemplaire> emp1=new ArrayList<Exemplaire>();
	
	

	public EmpruntEnCours(Date dateEmprunt,Date dateRestitutionEff,Utilisateur utilisateur){

		this.dateEmprunt=dateEmprunt;
		this.dateRestitutionEff=dateRestitutionEff;
		
		this.utilisateur=utilisateur;
		
	}
	
	
	public void setEmp1(Exemplaire exemplaire) {
		
		exemplaire.setStatus(status.PRETE);
		this.exemplaire=exemplaire;
		
		this.emp1.add(this.exemplaire);
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
		return  "\n" + utilisateur+"\n" +this.emp1 +"\ndate de l'emprunt:" + dateEmprunt
				+ "\ndate de restitution effective:" + dateRestitutionEff;
	}

}
