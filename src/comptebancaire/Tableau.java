package comptebancaire;

import java.util.Scanner;

public class Tableau {

	public static void main(String[] args) 
	{
		int[] tabInt = getValue();
		
		System.out.println(  "Tableau initial." );
		 displayTab(tabInt);
		 
		 System.out.println(  "" );
		 
		 System.out.println(  "Tableau inverse." );
		 int [] value = reverseTab(tabInt);
		 displayTab(value);
		 
	}
	public static int []getValue()
	{
		String input;
		int longueurTab;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Longueur du tableau: ");
		input = scanner.nextLine();
		longueurTab = Integer.parseInt(input);
		
		//Creation du Tableau
		int [] tabInt = new int [longueurTab];
		for (int i = 0; i<tabInt.length; i++ ) 
		{
			System.out.println("Saisir la valeur " + (i + 1) + " du tableau");
			input = scanner.nextLine();
			tabInt[i] = Integer.parseInt(input);
			
			
		}
		return tabInt;
	}
	public static void displayTab(int []tabInt) 
	{
		int j=0 ;
		System.out.print("[");
		
		while (j<tabInt.length-1) 
		{
			System.out.print( tabInt[j] + "," );
			j++;
		}
		System.out.print(  tabInt[j] + "]");
		
	}
	public static int []reverseTab(int [] tabInt)
	{
		int f = tabInt.length-1;
		for(int i = 0; i>f; i++) 
		{
			int sauv = tabInt[i];
			tabInt[i]=tabInt[f];
			tabInt[f]=sauv;
			f-=f;
		}
		return tabInt;
		
	}
	
	

}
