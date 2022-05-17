package homework;

import java.util.Scanner;

public class TableauDeValeurs {

	public static void main(String[] args) 
	{
		String input;
		float t;
		float s = 0;
		
		float [] tab = new float[2];
		
		//Entree des valeurs au clavier
		
		for (int i=0; i< tab.length;i++) 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Entrer les valeurs du tableau: ");
			input = scanner.nextLine();
			tab[i]= Float.parseFloat(input);
			System.out.println(tab[i]);
			
		}
		for(int i = 0; i<2; i++) 
			
		{
			s+=tab[i];
		}
		 System.out.println("la somme est " + s);
		
  
   }
}
