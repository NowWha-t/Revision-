package exerciceSurLesClass;

import java.util.List;

public class Filiere
{
   private int id;
   private String code;
   private String libelle;
   private static int compteur = 0;
   private List<Etudiant> listEtudiant;
   
   
	public  Filiere() 
	{
		Filiere.compteur++;
		this.id= compteur;
		
	}
	public Filiere(String code,String libelle) 
	{
		this();
		this.code= code;
		this.libelle= libelle;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	public List<Etudiant> getListEtudiant() {
		return listEtudiant;
	}
	public void setListEtudiant(List<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}
	@Override
	public String toString() 
	{
		return "Filieres [id=" + id + ", code=" + code + ", libelle=" + libelle  + "]";
	}

}
