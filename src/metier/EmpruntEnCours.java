package metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {
	
	private Date dateEmprunt;
	private Date dateRestitutionEff=null;
	private Exemplaire exemplaire;
	private EnumStatusExemplaire status;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	private static ArrayList emp1=new ArrayList();
	private int idUtilisateur;
	

	public EmpruntEnCours(){

		}
	
	public EmpruntEnCours(Date dateEmprunt,Exemplaire exemplaire){

		this.dateEmprunt=dateEmprunt;
		this.dateRestitutionEff=null;
		exemplaire.setStatus(EnumStatusExemplaire.PRETE);
		this.exemplaire=exemplaire;
		
		}
	
	public void setListEmpruntEncours(int idUtilisateur){
	
		this.idUtilisateur=idUtilisateur;
		emp1.add(this);

	}
	
	public Exemplaire getExemplaire() {
		return exemplaire;
	}

	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}

	public EnumStatusExemplaire getStatus() {
		return status;
	}

	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	public ArrayList getListEmpruntEncours(){
		
		return emp1;
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
	protected void finalize() throws Throwable {
		System.out.println("Emprunt en cours est Garbage collecté !!!");
		super.finalize();
	}

	@Override
	public String toString() {
		
	
		return  "date de l'emprunt:" + sdf.format(dateEmprunt)+ " --- "+this.exemplaire+" --- "+"N°ID de l'utilisateur: "+idUtilisateur+"\n";
		
	}

}
