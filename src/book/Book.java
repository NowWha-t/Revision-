package book;

import java.util.Scanner;

public class Book 
{
   int id ;
   String titre;
   String prenomAuteur;
   String nomAuteur;
   double prixUnitaire;
   private static int nombreLivre;
   

   public Book() 
	 {
	   Scanner sc = new Scanner(System.in);
	     String input;
		 
		 
		 System.out.println(" Veillez saisir le titre du livre: ");
		 input = sc.nextLine();
		 titre = input;
		 
		System.out.println(" Veillez saisir le prenom de l'auteur: ");
		 input = sc.nextLine();
		 prenomAuteur= input;
		
		 System.out.println("Veillez saisir le nom de l'auteur: ");
		 input = sc.nextLine();
		 nomAuteur= input;
		 
		 System.out.println(" Veillez saisir le prix du  livre: ");
		 input = sc.nextLine();
		 prixUnitaire = Double.parseDouble(input);
		 
		 Book.nombreLivre++;
		 this.id = nombreLivre;
		 this.titre = titre;
		 this.prenomAuteur= prenomAuteur;
		 this.nomAuteur = nomAuteur;
		 this.prixUnitaire= prixUnitaire;
	 }
   
 
@Override
 public  String toString() {
	return " Le numero du livre : "  + id + "\nTitre :" + titre + "\nPrenom de l'uuteur : " + prenomAuteur + 
			"\nNom de l'auteur : " + nomAuteur+ "\nPrixUnitaire : " + prixUnitaire ;
}
 

   
}
