package metier;

import java.util.Date;

public class Exemplaire {
	
	
private int idExemplaire;
private Date dateAchat;
private EnumStatusExemplaire status;
private String isbn;

	public Exemplaire(int idExemplaire,Date dateAchat,String isbn) {
		
		this.idExemplaire=idExemplaire;
		this.dateAchat=dateAchat;
		this.isbn=isbn;		
	}
	
	
}
