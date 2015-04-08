package metier;

import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {

	private Date dateEmprunt;
	private int nbEmpruntEnCours;
	
	ArrayList enCours=new ArrayList();
	
	
	
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

	public EmpruntEnCours(Date dateEmprunt,Utilisateur utilisateur,Exemplaire exemplaire) {
		
	
		
	}

	
}
