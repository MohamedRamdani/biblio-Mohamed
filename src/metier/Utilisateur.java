package metier;

public class Utilisateur {
	
	
/******************************************Attributes*********************************************/
	private int idUtilisateur;
	private String pwd;
	private String pseudonyme;
/*****************************************Constructors********************************************/
	
	public Utilisateur(int idUtilisateur, String pwd, String pseudonyme) {
		super();
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
		return "Utilisateur [idUtilisateur=" + idUtilisateur + "\tpwd=" + pwd + "\tpseudonyme=" + pseudonyme + "]";
	}
	
/**************************************************************************************************/

/*	public int getNbEmpruntEnCours() {
		return nbEmpruntEnCours;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	

}
