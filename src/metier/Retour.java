package metier;

import java.util.ArrayList;

public class Retour {
	
	public static void retouremprunt(Utilisateur utilisateur,int idexemplaire){
		
		ArrayList<EmpruntEnCours> listemprunt=utilisateur.getEmpruntEncours();
		EmpruntArchive empruntarch;
		
		for(EmpruntEnCours e:listemprunt)
		{
			if(e.getExemplaire().getIdExemplaire()==idexemplaire){
				
				e.getExemplaire().setStatus(EnumStatusExemplaire.DISPONIBLE); // Modification du status (l'exemplaire est rendu disponible)
					
					
				listemprunt.remove(e); // l'exemplaire est supprimÃ© de la liste des emprunt de l'utilisateur
				utilisateur.setNbEmpruntsEnCours();
				
				empruntarch=new EmpruntArchive(e,utilisateur.getIdUtilisateur()); 
				empruntarch.setEmpruntArchive();
				
				try {
					e.finalize();
				} catch (Throwable e1) {
					e1.printStackTrace();
				}
			}
		}			
				
	}

}
