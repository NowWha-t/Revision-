package elevesFilieres;

import java.time.LocalDate;

public class Eleves 
{
   public int id;
   public String prenom;
   public String nom;
   public LocalDate dateDeNaissance;
    private static int nombreElevesCree = 0;
    
   public Eleves() 
   {
	   Eleves.nombreElevesCree++;
	   this.id =Eleves.nombreElevesCree;
	   this.prenom = prenom;
	   this.nom = nom; 
	   this.dateDeNaissance = dateDeNaissance;
	   
   }
	
	  public Eleves( String prenom, String nom, LocalDate dateDeNaissance) 
	  {
	    this(); 
	    this.prenom = prenom; 
	    this.nom = nom;
	    this.dateDeNaissance =dateDeNaissance; 
	  }
	 

public int getId() {
	return id;
}


public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public LocalDate getDateDeNaissance() {
	return dateDeNaissance;
}

public void setDateDeNaissance(LocalDate dateDeNaissance) {
	this.dateDeNaissance = dateDeNaissance;
}

@Override
public String toString() {
	return "Je m'appelle "  + prenom +  nom + ", mon numero d'etudiant est " +  id  + " et ma date de naissance est " 
              + dateDeNaissance +"." ;
}
   
   
   
}
