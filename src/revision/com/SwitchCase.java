package revision.com;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		String input;
		int choice;
		
		System.out.println("1 - Addition");
		System.out.println("2 - Sustaction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("5 - Modulo");
		System.out.println("6 - Invalid");
		
		System.out.print("Your Choice: ");
		
		input = scanner.nextLine();
		choice = Integer.parseInt(input);
		switch(choice)
		{
			case 1:
			      System.out.print("You took the addition ");
			break;
			
			case 2:
			      System.out.print("You took the sustraction ");
			break;
			
			case 3:
			      System.out.print("You took the multiplication ");
			break;
			
			case 4:
			      System.out.print("You took the division");
			break;
			
			case 5:
			      System.out.print("You took the modulo ");
			break;
			
			case 6:
			      System.exit(0);
			break;
			default:
				System.out.print("Invalid choice");
		}

	}

}
