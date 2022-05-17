package homeworkEtudiantFiliere;

import java.time.LocalDate;


public class Etudiant 
{
   private int id;
   private String prenom;
   private String nom;
   private LocalDate dateDeNaissance;
   private static int numeroEtudiant=0;
   private Filiere filiere ;
   
   public Etudiant() 
   {
	   Etudiant.numeroEtudiant++;
	   this.id=numeroEtudiant;
	   
   }
   public Etudiant(String prenom, String nom, LocalDate dateDeNaissance,Filiere filiere ) 
   {
	   this();
	   this.prenom = prenom;
	   this.nom = nom;
	   this.dateDeNaissance = dateDeNaissance;
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


public void setFiliere(Filiere filiere) {
	this.filiere = filiere;
}
public Filiere getFiliere() {
	return filiere;
}
public LocalDate getDateDeNaissance() {
	return dateDeNaissance;
}
public void setDateDeNaissance(LocalDate dateDeNaissance) {
	this.dateDeNaissance = dateDeNaissance;
}
public int getId() {
	return id;
}
@Override
public String toString() {
	return "Etudiant numero: " + id + " \nPrenom: " + prenom + " \nNom: " + nom + " \nDate de daissance: " 
+ dateDeNaissance+ " \nFiliere: " + filiere.getLibelle() ;
}


   
}
