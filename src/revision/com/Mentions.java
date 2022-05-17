package revision.com;

import java.util.Scanner;

public class Mentions {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        
		 float note; 
		System.out.print("Veuillez saissir votre note: ");
		note = scanner.nextFloat();
		
		if (note == 0) 
		{
		   System.out.print("Note invalide!  ");
		}
		     else if(note >= 10 && note < 12)
		     {
			    System.out.print(" Mention Passable!");
		     }
		     else if (note >= 12 && note < 14)
		     {
		    	System.out.print("Mention Assez Bien ");
		     }
		
		     else if (note >= 14 && note < 16)
		     {
			    System.out.print("Mention Bien");
		     }
		
		     else if (note >= 16 && note < 18) 
		     {
			    System.out.print("Mention Tres Bien");
		     }
		     else if(note >= 17 && note < 20) 
		     {
			    System.out.print("Mention Excellente");
		      }
		 else {
				System.out.print("La note doit etre < 20");
		      }
			}
		}
		
	


