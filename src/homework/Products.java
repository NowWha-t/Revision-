package homework;

import java.util.Scanner;

public class Products {

	public static void main(String[] args)  
	
	{
		 
		String input ;
		 
		
		
		
        Scanner scanner = new Scanner(System.in);
		
        float price ;
		int quantity ; 
		float result;
		
		System.out.print("Type the price of the product: "); 
		input = scanner.nextLine();
		price = Float.parseFloat(input);
		
        System.out.print("Type the quantity of the of the product: ");
		input = scanner.nextLine();
		quantity=Integer.parseInt(input);
		
		result= process(quantity,price);
		
		 System.out.print("The teoatal price is : " + result);

		
		
		 
		
		
	}
	public static float  process( int quantity, float price ) 
	{
		return quantity*price;
	} 
	   

	
}
