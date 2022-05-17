package exerciceSurLesClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class TestEtudiantFiliere {

	public static void main(String[] args) 
	{
		
		Filiere filiere1 = new  Filiere("Gl","Genie logiciel");
		Filiere filiere2 = new Filiere("Rt","Reseau Telecom");
		
		List<Etudiant> etudiantgenieLogieciel = new ArrayList<>(); 
		List<Etudiant> etudiantReseauTelecom  = new ArrayList<>(); 
	
		
		
		
		Etudiant etudiant1 = new Etudiant();
		LocalDate dateDeNaissance1 = LocalDate.parse("2000-05-25");
		etudiant1.setPrenom("Mamadou");
		etudiant1.setNom("Diop");
		etudiant1.setDateDeNaissance(dateDeNaissance1);
		etudiant1.setFiliere(filiere2);
		
		
		LocalDate dateDeNaissance2 = LocalDate.parse("1990-02-09");
		Etudiant etudiant2 = new Etudiant("Fatou","Ndiaye", dateDeNaissance2, filiere1);
		Etudiant etudiant3 = new Etudiant("Yacine","faye", dateDeNaissance2, filiere2 );
		Etudiant etudiant4 = new Etudiant("Jean","Ngom", dateDeNaissance2, filiere1);
		
		//ajout des etudiants de filiere1
		etudiantgenieLogieciel.add(etudiant1);
		etudiantgenieLogieciel.add(etudiant2);
		filiere1.setListEtudiant(etudiantgenieLogieciel);
		
		etudiantReseauTelecom .add(etudiant3);
		etudiantReseauTelecom .add(etudiant4);
		filiere2.setListEtudiant(etudiantReseauTelecom);
		
		List<Filiere> listFiliere = new  ArrayList<>();
		
		listFiliere.add(filiere1);
		listFiliere.add(filiere2);
		
		
		//Affichage des filiere
		for(Filiere filiere: listFiliere) 
		{
			System.out.println(filiere.getLibelle());
			
			//affichage des etudiant a la filiere
			for(Etudiant etudiant : filiere.getListEtudiant() ) 
			{
				System.out.println(etudiant);
				System.out.println("--------------------------------------------------------");
				
			}
		}
		
		
	}

} 
