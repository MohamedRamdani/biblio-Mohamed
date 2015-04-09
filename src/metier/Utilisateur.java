package metier;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utilisateur extends Personne{
	
/**************************************************Attributes*********************************************/
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
	private int NbEmpruntsEnCours;
	private ArrayList<EmpruntEnCours> EmpruntEncours=new ArrayList<EmpruntEnCours>();
/*************************************************Constructors********************************************/
	
	public Utilisateur (){
		
	}
	
	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe,int idUtilisateur, String pwd, String pseudonyme) {
		super(nom,prenom,dateNaissance,sexe);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
		
	}
/***************************************************Accesseurs***********************************************/
	public void setEmpruntEnCours(Date date,Exemplaire exemplaire){
		
		EmpruntEnCours emp=new EmpruntEnCours(date,exemplaire,this);
		EmpruntEncours.add(emp);
		this.setNbEmpruntsEnCours();
	}
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public String getPwd() {
		return pwd;
	}
	public String getPseudonyme() {
		return pseudonyme;
	}
/****************************************************Mutators*************************************************/
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
public void setNbEmpruntsEnCours() {
		NbEmpruntsEnCours += 1;
	}


public ArrayList<EmpruntEnCours> getEmpruntEncours() {
		return EmpruntEncours;
	}

/**************************************************************************************************************/
	
	@Override
	public String toString() {
		return super.toString() + "idUtilisateur : " + idUtilisateur + "\nMot de passe : " + pwd + "\nPseudonyme : " + pseudonyme + "\n"+this.NbEmpruntsEnCours+" Emprunt en cours:\n"+this.EmpruntEncours+"\n";
	}
	
/**************************************************************************************************************/


	
	
	
	
	
	
	
	
	
	
	

}
