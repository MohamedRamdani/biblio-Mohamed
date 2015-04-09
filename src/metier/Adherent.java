package metier;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import metier.EmpruntArchive;

import javax.swing.JSpinner.DateEditor;


public class Adherent extends Utilisateur{
	
/******************************************Attributes*********************************************/
	private String telephone;
	private int nbMaxPrets = 3;
	private int dureeMaxPrets = 15;
	private int nbRetards;
/*************************************************************************************************/

		public boolean isConditionsPretAcceptees(){
			
			if (nbMaxPrets < 3 && nbRetards == 0){
				return true;
			}
				
			return false;
		}
			
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
	

/*********************************************Constructors****************************************************/
		public Adherent (){
			
		}
		
		
		public Adherent(String nom, String prenom, Date dateNaissance, String sexe,String telephone,int idUtilisateur, String pwd, String pseudonyme)
		{
			
			super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
			this.telephone=telephone;
			
		}
	
/************************************************Accesseurs************************************************/

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
		return super.toString() + "\nNo de Telephone : " + telephone + "\nNbre Max Prets = " + nbMaxPrets
			+ "\nDuree Max Prets = " + dureeMaxPrets + "\nNbre Retards = " + nbRetards + "\n";
}
/************************************************************************************************************/
	
	
	

	

}
