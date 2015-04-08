package metier;

import java.util.Date;

public class Exemplaire {
	
	
	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status;
	private String isbn;

	public Exemplaire(int idExemplaire,Date dateAchat,String isbn,EnumStatusExemplaire status) {
		
		this.idExemplaire=idExemplaire;
		this.dateAchat=dateAchat;
		this.isbn=isbn;	
		this.status=status;
	}

	public int getIdExemplaire() {
		return idExemplaire;
	}

	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public EnumStatusExemplaire getStatus() {
		return status;
	}

	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Exemplaire N°" + idExemplaire + ", date d'achat:"
				+ dateAchat  + ", ISBN:" + isbn+ ", status:" + status;
	}

	
}
