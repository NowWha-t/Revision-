package revision.com;

import java.util.Scanner;

public class IfConditional {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		int age;
		
		System.out.print("How old are you ?: ");
		age= scanner.nextInt();
		
		if(age <0 )
		{
			System.out.print("The age can't be negative");
		}
		else 
		{
			
			if (age==0) 
			{
				System.out.print("The age can't be equal to zero");
			}
			else if (age >=0 && age<18)
			{
				System.out.print("You are a youth");
			}
			else 
			{
				System.out.print("You are an adult");
			}
		}
		
		
		

	}

}
