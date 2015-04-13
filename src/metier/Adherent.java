package metier;

import java.util.Date;
import java.util.GregorianCalendar;


public class Adherent extends Utilisateur {
	
/******************************************Attributes*********************************************/
	private String telephone;
	private int nbMaxPrets = 3;
	private int dureeMaxPrets = 15;
	private int nbRetards;
	private boolean isConditionsPretAcceptees;
	private boolean identite = true;
/*********************************************Constructors****************************************************/
	
		
		// Constructeur complet
		public Adherent(String nom, String prenom, Date dateNaissance, String sexe,String telephone,int idUtilisateur, String pwd, String pseudonyme)
		{
			
			super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
			this.telephone=telephone;
			isConditionsPretAcceptees=true;
		}
		
			public Adherent (){
				
				this("Non renseigné","Non renseigné",null,"Non renseigné","Non renseigné",0,"Non renseigné","Non renseigné");
				identite = false;
			}
		
/**
 * @throws BiblioException ************************************************************************************************************************/
		public boolean isConditionsPretAcceptees(){
			
			getNbRetards();
			
			if (this.nbRetards != 0 | this.getNbEmpruntsEnCours()==nbMaxPrets | identite){
				isConditionsPretAcceptees=false;
			}
			else
				isConditionsPretAcceptees=true;
		
			return this.isConditionsPretAcceptees;
		}
/*************************************************************************************************************************/
		
		public int getNbRetards(){
			nbRetards=0;
			
			for (EmpruntEnCours eec : super.getEmpruntEncours()) {
				
				GregorianCalendar aujourdhui=new GregorianCalendar();
				
				aujourdhui.setTime(new Date());
				
				aujourdhui.add(GregorianCalendar.DAY_OF_YEAR,-dureeMaxPrets);
				
				Date date=aujourdhui.getTime();
				
				if (eec.getDateEmprunt().before(date))
				{
					nbRetards++;
				}
			}
		
			return nbRetards;
			
		}
/************************************************Accesseurs********************************************************/

		public String getTelephone() {
			return telephone;
		}
	
		public int getNbMaxPrets() {
			return nbMaxPrets;
		}
	
		public int getDureeMaxPrets() {
			return dureeMaxPrets;
		}	

/*************************************************Mutators*************************************************/

		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
	
		public void setNbMaxPrets(int nbMaxPrets) {
			this.nbMaxPrets = nbMaxPrets;
		}
	
		public void setDureeMaxPrets(int dureeMaxPrets) {
			this.dureeMaxPrets = dureeMaxPrets;
		}
	
		public void setNbRetards(int nbRetards) {
			this.nbRetards = nbRetards;
		}
/***********************************************************************************************************/

	@Override
	public String toString() {
		//return  "Adherent : \n" + super.toString() + "\nNo de Telephone : " + telephone + "\nNbre Retards = " + nbRetards + "\n";
		return  super.toString() + "No de Telephone : " + telephone + "\nNbre Retards = " + nbRetards + "\n" + "NbEmpruntsEnCours : " + super.getNbEmpruntsEnCours() + "\n" + "Emprunt en cours : " + super.getEmpruntEncours() + "\n";
}
/************************************************************************************************************/

	
	
	

	

}
