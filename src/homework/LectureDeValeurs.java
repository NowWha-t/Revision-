package homework;

import java.util.Scanner;

public class LectureDeValeurs {
	float somme,moyenne; 


	public static void main(String[] args) 
	{ 
		
		float[]value = getvalue();
		displayValue(value) ;
		moyenne(value); 
		minMax(value);
		 
		

	} 
	public static float []  getvalue() 
	{
		String input;
		Scanner scanner = new Scanner(System.in);
		//Creqtion du tablequ
		float [] tabValue = new float[2];
		
		//Remplire le tableau
		
		for(int i = 0 ; i<tabValue.length;i++) 
		 {
			 System.out.println("Veuillez saisir la valeur " + (i+1) + ". " );
			 input = scanner.nextLine();
			 tabValue[i]= Float.parseFloat(input);
		 }
		return tabValue;
		
    }
	public static void displayValue(float[]tabValue ) 
	  { 
		int f=1;
		for (float valeur: tabValue)
		{
			System.out.println("la valeur "  +  f++  + " est " + valeur);
		}
		
	  } 
	public static void moyenne(float []tabValue)
	{
		float somme = 0;
		float moyenne;
		
		for(int i =0; i<tabValue.length ;i++) 
		{
		   somme += tabValue[i];
		}
		moyenne = somme/tabValue.length;
		
		System.out.println("La moyenne est "  +  moyenne);
	}
	public static void minMax(float []tabValue) 
	{
		float min = tabValue[0];
		float max = tabValue[0];
		
		for(int i = 0 ; i< tabValue.length;i++) 
		{
			if (tabValue[i]< min ) min = tabValue[i];
			if (tabValue[i] > max ) max = tabValue[i];
		}
		System.out.println("La valeur minimale du tableau est "  +  min);
		System.out.println("La valeur maximale du tableau est "  +  max);
	}
	
    }
	
