package metier;

import java.util.Date;


public class Employe extends Utilisateur {
	
	
/******************************************Attributes*********************************************/
	private String codeMatricule;
	private EnumcategorieEmploye categorieEmploye;
	
/*************************************************************************************************/
	
	public Employe (){
		
	}
	
	
	public Employe(String nom, String prenom, Date dateNaissance, String sexe,int idUtilisateur, String pwd, String pseudonyme,String codeMatricule,EnumcategorieEmploye categorieEmploye)
	{
		
		super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
		this.codeMatricule=codeMatricule;
		this.categorieEmploye=categorieEmploye;
		
	}
/**********************************************************************************************************/


	public String getCodeMatricule() {
		return codeMatricule;
	}


	public EnumcategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}

/*********************************************************************************************************/
	public void setCodeMatricule(String codeMatricule) {
		this.codeMatricule = codeMatricule;
	}


	public void setCategorieEmploye(EnumcategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}
/*********************************************************************************************************/


	@Override
	public String toString() {
		return super.toString() + "Employe [codeMatricule=" + codeMatricule
				+ ", categorieEmploye=" + categorieEmploye + "]";
	}


	
	
	
	
	
	
	
	

}
