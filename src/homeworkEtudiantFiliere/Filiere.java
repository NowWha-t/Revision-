package homeworkEtudiantFiliere;

import java.util.List;

public class Filiere 
{
   private int id;
   private String codeFiliere;
   private String libelle;
   private static int numeroFiliere =0;
   private List<Etudiant>listEtudiant;
   
   
   public Filiere() 
   {
	   Filiere.numeroFiliere++;
	   this.id = numeroFiliere++;
	  
	  
	   
   }
   public Filiere(String codeFiliere, String libelle) 
   {
	   this();
	   this.codeFiliere = codeFiliere;
	   this.libelle = libelle;
   }
public String getCodeFiliere() {
	return codeFiliere;
}
public void setCodeFiliere(String codeFiliere) {
	this.codeFiliere = codeFiliere;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public int getId() {
	return id;
}
public List<Etudiant> getListEtudiant() {
	return listEtudiant;
}
public void setListEtudiant(List<Etudiant> listEtudiant) {
	this.listEtudiant = listEtudiant;
}
@Override
public String toString() {
	return "Filiere id " + id + ", codeFiliere: " + codeFiliere + "libelle: " + libelle ;
}





   
}
