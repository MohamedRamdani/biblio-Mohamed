package metier;

import java.util.Date;

public class Personne {


/***************************************Attributes**************************************************/
	
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String sexe;
	
/*****************************************Constructors*********************************************/
	
	public Personne(){
		
	}
	
	public Personne(String nom, String prenom, Date dateNaissance, String sexe){
		
		this.nom=nom;
		this.prenom=prenom;
		this.dateNaissance=dateNaissance;
		this.sexe=sexe;
	}
/*****************************************Accesseurs***********************************************/

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public String getSexe() {
		return sexe;
	}
	
/*****************************************Mutateurs*************************************************/
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
/*****************************************toString*****************************************************/
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + "\tprenom=" + prenom + "\tdateNaissance=" + dateNaissance + "\tsexe=" + sexe + "]";
	}
	
/******************************************************************************************************/
	
	
	
	
}
