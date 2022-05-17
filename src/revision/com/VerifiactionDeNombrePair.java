package revision.com;

import java.util.Scanner;

public class VerifiactionDeNombrePair {

	public static void main(String[] args) 
	
	{
		String input;
		int nombre;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Veuillez saisir un nombre svp: ");
	    input = scanner.nextLine();
	    nombre = Integer.parseInt(input);
		   
		nombrePair(nombre) ;
		 
		
		   

		
	}
	 // Ce programme verifie si un nombre saisi par l'utilisateur est pair

   public static void nombrePair(int nombre)  
   {
	   
	   
	   if ( nombre % 2 == 0
			   )  
	   {
		   System.out.println(nombre  +  " est un nombre pair ");
	   }
	   else
	   {
		   System.out.println(nombre  +  " n'est pas un nombre pair ");
	   }
	   
   }
   
		   
	   
   }
	

