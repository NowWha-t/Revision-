package homework;

import java.util.Scanner;

public class LectureDeValeurDunTableau {

	public static void main(String[] args) 
	{
		int[]element = tabInt();
	    displayElements(element);
	    moyenne(element); 
	    variance(element); 
	    minMax(element);
		

	}
	public static int []tabInt()
	{
		String input ;
		int N;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir le nombre d'elements du tableau: ");
		input = scanner.nextLine(); 
		N = Integer.parseInt(input);
		
		//Creation du tableau
		int []tabInt= new int[N];
		
		//Remplir le tableau
		for(int i = 0; i< tabInt.length; i++) 
		{
			System.out.println("Saisir la valeur " + (i+1));
			input = scanner.nextLine();
			tabInt[i]= Integer.parseInt(input);
		}
		return tabInt;
		
	}
	public static void displayElements ( int []tabInt ) 
	{
        int j = 1;
		
		for(int element: tabInt) 
		{
			System.out.println("L'element  " + j++ + " est: " + element );
		}
	}
	public static void moyenne(int []tabInt) 
	{
		int somme =0;
		float moyenne;
		
		
		for ( int i = 0 ; i<tabInt.length; i++) 
		{
			somme += tabInt[i];
		}
		moyenne = somme/tabInt.length;
		System.out.println("La moyenne est " + moyenne);
	}
	public static void variance(int []tabInt) 
	{
		int carre = 0;
		float variance;
		for(int i = 0 ; i<tabInt.length; i++) 
		{
			carre += 2*tabInt[i];
		}
		variance = carre/tabInt.length;
		System.out.println("La la variance  est " + variance);

	}
	public static void minMax(int []tabInt) 
	{
		int min = tabInt[0];
		int max = tabInt[0];
        for(int i=0; i<tabInt.length; i++) 
        {
        	if (tabInt[i]< min ) min= tabInt[i];
        	if (tabInt[i] > max ) max= tabInt[i];
        }
        System.out.println("La valeur minimale du tableau est "  +  min);
		System.out.println("La valeur maximale du tableau est "  +  max);
	}

}
