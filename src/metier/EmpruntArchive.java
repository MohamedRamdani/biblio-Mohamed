package metier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmpruntArchive {

	private Date dateEmprunt;
	private Date dateRestitutionEff;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	private int nbEmpruntEnCours;	
	private Utilisateur utilisateur;
	private Exemplaire exemplaire;
	private static ArrayList<EmpruntEnCours> Archive=new ArrayList<EmpruntEnCours>();
	
	public EmpruntArchive() {
		
	}
	
	public EmpruntArchive(EmpruntEnCours emprunt) {
		
		this.dateEmprunt=dateEmprunt;
		this.utilisateur=utilisateur;
		this.exemplaire=exemplaire;
		Archive.add(emprunt);
		this.dateRestitutionEff=new GregorianCalendar().getTime();
		System.out.println(this.dateRestitutionEff);
			
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public int getNbEmpruntEnCours() {
		return nbEmpruntEnCours;
	}

	public void setNbEmpruntEnCours(int nbEmpruntEnCours) {
		this.nbEmpruntEnCours = nbEmpruntEnCours;
	}

	@Override
	public String toString() {
		return "Archive des Emprunts:\n" + this.Archive;
	}

	
}
