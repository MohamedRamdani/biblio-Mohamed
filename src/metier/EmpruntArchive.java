package metier;

import java.util.ArrayList;
import java.util.Date;

public class EmpruntArchive {

	private Date dateEmprunt;
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
