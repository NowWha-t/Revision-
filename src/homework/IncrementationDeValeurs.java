package homework;

import java.util.Scanner;

public class IncrementationDeValeurs {

	public static void main(String[] args) 
	{
		double[]number =getNumber();
		 displayNumbers(number);
		 incrementNumber(number); 
		 

	}
	public static double[] getNumber() 
	{ 
		
		   String input ;
	        int longueurtab;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Saisir le nombre d'elements du tableau: ");
			input = scanner.nextLine(); 
			longueurtab = Integer.parseInt(input);
			
			//Creation du tableau
			double []tabDouble= new double[longueurtab];
			
			//Remplir le tableau
			for(int i = 0; i< tabDouble.length; i++) 
			{
				System.out.println("Saisir la valeur " + (i+1) + " : ");
				input = scanner.nextLine();
				tabDouble[i]= Double.parseDouble(input);
			}
			return tabDouble;
	        
	}
	public static void displayNumbers(double []tabDouble) 
	{
		//afficher les valeurs du tableau
			int j =1;
			for(double number: tabDouble) 
			{
				System.out.println("La valeur " + j++ + " est " + ": " + number );
			}
	}
	public static double[] incrementNumber(double []tabDouble) 
	{
		//incrermenter une valeur donnee au tableau
		
		String input;
		int value ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Saisir la valeur que vous voulez ajouter au tableau: ");
		
		for(int i = 0; i<tabDouble.length; i++) 
		{    
			input = scanner.nextLine();
			value = Integer.parseInt(input);
			
		}
		return tabDouble;
		
		
		
	}
	
}

