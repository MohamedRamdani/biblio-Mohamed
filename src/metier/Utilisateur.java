package metier;


import java.util.ArrayList;
import java.util.Date;


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
	
	public int getNbRetards(){
		return 0;
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
		NbEmpruntsEnCours=0;
	for(EmpruntEnCours e:this.EmpruntEncours)
		NbEmpruntsEnCours += 1;
	
	}

	public void setEmpruntEnCours(Date date,Exemplaire exemplaire) throws BiblioException {
	
		if (this.getNbRetards()>0)
		{
			throw new BiblioException("Cet Adherent ne peut pas emprunter de livre.\nIl y a " + this.getNbRetards() + " livre(s) en retard pour cet Adherent");
		}
		
		if (NbEmpruntsEnCours==3 && ((this.getClass().getSimpleName().compareToIgnoreCase("Adherent")) == 0))
		{
			throw new BiblioException ("Le nombre maximum d'emprunt (3 livres) est atteint pour cet Adherent");
			
		}
		
			EmpruntEnCours emp=new EmpruntEnCours(date,exemplaire);
			EmpruntEncours.add(emp);
			this.setNbEmpruntsEnCours();
			emp.setListEmpruntEncours(this.idUtilisateur);
		}

public ArrayList<EmpruntEnCours> getEmpruntEncours() {
		return EmpruntEncours;
	}

public int getNbEmpruntsEnCours() {
	return NbEmpruntsEnCours;
}


/**************************************************************************************************************/
	
	@Override
	public String toString() {
		return super.toString() + "\nidUtilisateur : " + idUtilisateur + "\nMot de passe : " + pwd + "\nPseudonyme : " + pseudonyme + "\n"+this.NbEmpruntsEnCours + " Emprunt en cours:\n" + this.EmpruntEncours+"\n";
	}
	
/**************************************************************************************************************/


	
	
	
	
	
	
	
	
	
	
	

}
