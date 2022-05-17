package revision.com;

import java.util.Scanner;

public class Etudiants {

	public static void main(String[] args) 
	{
		float[]notes = getNotes();
		afficherNotes(notes);
	}
    
	public static float [] getNotes() 
	{
		String input;
		int nombreEdt;
		float [] tabNotes;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Donner le nombre d'etudiants: ");
		input = scanner.nextLine();
		nombreEdt = Integer.parseInt(input);
		System.out.println(" Le nombre d'etudiants est " + nombreEdt);
		
		//Creation du tableau.
		
		tabNotes = new float [nombreEdt];
		
		//Affichage du tableau 
		for (int i = 0 ; i<nombreEdt; i++) 
		   {
			System.out.println("Donnez la note de l'etudiant " + (i+1) + ": ");
			input = scanner.nextLine();
			tabNotes[i] = Float.parseFloat(input);
		   }
		       return  tabNotes;
	}
		public static void afficherNotes(float []tabNotes) 
		{ int j =1;
			for(float note: tabNotes) 
			 {
				System.out.print("Donnez la note de l'etudiant "  + j++ + ": " + note);
			 }
		}
	    
}
