package metier;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import metier.EmpruntEnCours;

public class Utilisateur extends Personne{
	
/******************************************Attributes*********************************************/
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
/*****************************************Constructors********************************************/
	
	public Utilisateur (){
		
	}
	
	
	
	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe,int idUtilisateur, String pwd, String pseudonyme) {
		super(nom,prenom,dateNaissance,sexe);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
		
	}
/*****************************************Accesseurs***********************************************/
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public String getPwd() {
		return pwd;
	}
	public String getPseudonyme() {
		return pseudonyme;
	}
/*****************************************Mutators*************************************************/
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
/***************************************************************************************************/
	
	@Override
	public String toString() {
		return super.toString() + "Utilisateur [idUtilisateur=" + idUtilisateur + "\tpwd=" + pwd + "\tpseudonyme=" + pseudonyme + "]";
	}
	
/**************************************************************************************************/

/*	public int getNbEmpruntEnCours() {
		return nbEmpruntEnCours;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	

}
