package homeworkEtudiantFiliere;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exerciceSurLesClass.Etudiant;
import exerciceSurLesClass.Filiere;
public class TestEtudiantFiliere {

	public static void main(String[] args) 
	{
      //Creation des filieres
		
	    
	    Filiere filiere1 = new Filiere("GR","Genie Logiciel");
		Filiere filiere2 = new Filiere("RT","Reseau telecom");
		Filiere filiere3 = new Filiere("IG","Informatique de gestion");
		
		//Creation des list de filieres
		List<Etudiant> etudiantGenieLogiciel = new ArrayList<>(); 
		List<Etudiant> etudiantReseauTelecom = new ArrayList<>(); 
		List<Etudiant> etudiantInformatiqueGestion = new ArrayList<>(); 
		
		//creation des etudiants
		Etudiant etudiant1 = new Etudiant();
		
		LocalDate dateDeNaissance1 = LocalDate.parse("1998-04-19");
		etudiant1.setPrenom("Amadou");
		etudiant1.setNom("Gaye");
		etudiant1.setDateDeNaissance(dateDeNaissance1);
		etudiant1.setFiliere(filiere1);
		
		LocalDate dateDeNaissance2 = LocalDate.parse("1997-06-09");
		Etudiant etudiant2 = new Etudiant("Aida","Ndiaye", dateDeNaissance2 ,filiere3);
		
		
		LocalDate dateDeNaissance3= LocalDate.parse("1994-12-12");
		Etudiant etudiant3 = new Etudiant("Samba","Dieng", dateDeNaissance3, filiere2);
		
		LocalDate dateDeNaissance4= LocalDate.parse("1984-12-24");
		Etudiant etudiant4 = new Etudiant("Marie","Ndour", dateDeNaissance4, filiere3);
		
		LocalDate dateDeNaissance5 = LocalDate.parse("1996-04-27");
		Etudiant etudiant5 = new Etudiant("Marie","Ndour", dateDeNaissance5, filiere1);
		
		
		//Ajout des etudiant a la filiere1
		etudiantGenieLogiciel.add(etudiant1);
		etudiantGenieLogiciel.add(etudiant5);
		filiere1.setListEtudiant(etudiantGenieLogiciel);
		
		//Ajout des etudiant a la filiere2
		etudiantReseauTelecom.add(etudiant3);
		filiere2.setListEtudiant(etudiantReseauTelecom);
		
		//Ajout des etudiant a la filiere3
		etudiantInformatiqueGestion.add(etudiant2);
		etudiantInformatiqueGestion.add(etudiant4);
		filiere3.setListEtudiant(etudiantInformatiqueGestion);
		 
		 //creation de la lite des filieres
		 
		 List<Filiere> listFililiere = new ArrayList<>();
		 
		//ajouts des fileres a la list
		 
		 listFililiere.add(filiere1);
		 listFililiere.add(filiere2);
		 listFililiere.add(filiere3);
		 
		 //affichage des filiere
		 for(Filiere filiere:  listFililiere) 
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
