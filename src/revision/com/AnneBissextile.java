package revision.com;

import java.util.Scanner;

public class AnneBissextile {
	

	public static void main(String[] args) 
	{
		 
		 String input;
		 int annee;
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Veuillez saisir un l'annee svp: ");
		 input = scanner.nextLine();
		 annee = Integer.parseInt(input); 
		 
		   
		 if (annee <= 0 ) 
		 {
			 System.out.print("La valeur ne correspond pas");
		 }
		 else 
		 {
			 System.out.println( "Is " + annee + " an even number ? :"+ anneeBissextile( annee) );
		 }
	}
	public static boolean anneeBissextile(int annee) 
	{
		boolean bissextile = false;
		if( annee % 400 == 0) 
		{
			bissextile = true ;
		}
		else if ( annee % 4 == 0 && annee % 100 !=0 ) 
		{
			bissextile = true ;
		}
	   else 
	   {
		   bissextile = false ;
	   }
		return bissextile;  
			   
	}
	
	public static boolean anneeBissextile2(int annee) 
	{
		return ((annee % 400 == 0 || annee % 4 == 0 && annee % 100 !=0 ));
	}
}

	
