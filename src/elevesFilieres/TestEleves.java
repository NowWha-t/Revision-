package elevesFilieres;

import java.time.LocalDate;

public class TestEleves {

	public static void main(String[] args) 
	{
		Eleves eleve = new Eleves(); 
		LocalDate dateDeNaissance = LocalDate.parse("1999-08-02"); 
		eleve.setPrenom("Amadou");
		eleve.setNom("Sow");
		eleve.setDateDeNaissance(dateDeNaissance);
		
		LocalDate dateDeNaissance1 = LocalDate.parse("2000-07-06");
		Eleves eleve1 = new Eleves("Samba","Diop",dateDeNaissance1);
		
		LocalDate dateDeNaissance2 = LocalDate.parse("1998-09-02");
		Eleves eleve2 = new Eleves("Yacine","Faye",dateDeNaissance2);
		
		LocalDate dateDeNaissance3 = LocalDate.parse("1996-11-12");
		Eleves eleve3 = new Eleves("Saly","Wade",dateDeNaissance3);
		
		LocalDate dateDeNaissance4 = LocalDate.parse("1990-09-22");
		Eleves eleve4 = new Eleves("Matar","Lo",dateDeNaissance4);
		
		
		
		System.out.println(eleve);
		System.out.println("========================================================================");
		
		System.out.println(eleve1);
		System.out.println("========================================================================");
		
		System.out.println(eleve2);
		System.out.println("========================================================================");
		
	   System.out.println(eleve3);
		System.out.println("========================================================================");
		
		System.out.println(eleve4);
		
		
    }

}
