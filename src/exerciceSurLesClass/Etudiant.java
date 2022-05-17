package exerciceSurLesClass;

import java.sql.Date;
import java.time.LocalDate;

public class Etudiant {
	public int  id;
	public String nom;
	public String prenom;
	public LocalDate dateDeNaissance;
	private static int nombreObjetsCrees = 0;
	private Filiere filiere;
	
	
	public Etudiant() 
	{
		Etudiant.nombreObjetsCrees++;
		this.id = Etudiant.nombreObjetsCrees;
	}

  public Etudiant(String prenom, String nom, LocalDate dateNaissance, Filiere filiere) 
  {
	  this();
	  this.prenom=prenom;
	  this.nom=nom;
	  this.dateDeNaissance = dateNaissance;
	  this.filiere= filiere;
	  
  }
  



public int getId() {
	return id;
}



public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public LocalDate getDateDeNaissance() {
	return dateDeNaissance;
}

public void setDateDeNaissance(LocalDate dateDeNaissance) {
	this.dateDeNaissance = dateDeNaissance;
}

public Filiere getFiliere() {
	return filiere;
}

public void setFiliere(Filiere filiere) {
	this.filiere = filiere;
}

@Override
public String toString() {
	return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance
			+ ", filiere=" + filiere.getLibelle() + "]";
}



   


}	




