package comptebancaire;

import java.util.Scanner;

public class Bissextile {

	public static void main(String[] args) 
	{
		String input ;
		int annee;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Donner une annee: ");
		input = scanner.nextLine();
		annee = Integer.parseInt(input);
		
		if (annee <= 0) 
		{
			System.out.println("Donnez une autre annee!");
		}
		else 
		{
			System.out.println(" Est ce annee " + annee + " une annee bissextile ?:  " + estBissextile(annee));
		}
		
		 
	}
	public static Boolean estBissextile(int annee) 
	{
		boolean bissextile = false;
		if (annee % 400 == 0) 
		{
			bissextile = true;
		}
		else if ( annee % 4 == 0 || annee % 100 != 0)
		{
			bissextile = true;
		}
		else 
		{
			bissextile = false;
		}
		  return bissextile;
	}

}
