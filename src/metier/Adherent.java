package metier;

import java.lang.reflect.Constructor;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import metier.EmpruntArchive;

import javax.swing.JSpinner.DateEditor;


public class Adherent extends Utilisateur {
	
/******************************************Attributes*********************************************/
	private String telephone;
	private int nbMaxPrets = 3;
	private int dureeMaxPrets = 15;
	private int nbRetards;
	private boolean isConditionsPretAcceptees;
/*********************************************Constructors****************************************************/
		public Adherent (){
			
		}
		
		// Constructeur sans No de telephone
		public Adherent(String nom, String prenom, Date dateNaissance, String sexe,int idUtilisateur, String pwd, String pseudonyme)
		{
			
			super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
			isConditionsPretAcceptees=false;
		}
		
		
		// Constructeur complet
		public Adherent(String nom, String prenom, Date dateNaissance, String sexe,String telephone,int idUtilisateur, String pwd, String pseudonyme)
		{
			
			super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
			this.telephone=telephone;
			isConditionsPretAcceptees=true;
		}
		
/**************************************************************************************************************************/
		public boolean isConditionsPretAcceptees(){
			if (isConditionsPretAcceptees == false){
				System.err.println("Emprunt impossible, Il manque des informations sur l'dentité de cet Adherent");
				return false;
			}
		
			return true;
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
		return  super.toString() + "\nNo de Telephone : " + telephone + "\nNbre Retards = " + nbRetards + "\n";
}
/************************************************************************************************************/

	
	
	

	

}
