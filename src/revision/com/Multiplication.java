package revision.com;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) 
	{
		// Ce programme permet d'afficher la table de multiplication 
		
		Scanner scanner = new Scanner (System.in);
		String input;
		int base;
		
		System.out.println("Veuillez saisir votre une base: ");
		input = scanner.nextLine();
		base = Integer.parseInt(input);
		
		if ( base<=0 ) 
		{
			System.out.println("La base doit etre superieur a zero");
		}
		
		
		for (int i = 1; i<12; i++) 
		{
			System.out.println(base + " x " + i + "=" + (base*i) );
		}
	}

}
