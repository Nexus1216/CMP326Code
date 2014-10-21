import java.util.Scanner;

public class if_Statments 
{
	public static void main (String [] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		 String a = keyboard.nextLine();
		 
		System.out.println("Enter another String:");
		
		 String b = keyboard.nextLine();
		 
		 if(a.equals(b))
		 {
			 System.out.println(a + " is the same as " + b);
		 }
		 else
			 System.out.println(a + " is different than " + b);
		 
		/*
		int num = keyboard.nextInt();
		
		if((num > 8) && (num < 15))
		{
			System.out.println("Number " + num + " is bigger than 8");
			System.out.println("Number is less than 15");
		
		}
		else if(num >= 15)
		{
			System.out.println("Number " + num + " is bigger than 15");
		
		}
		else
		{
			System.out.println("Number " + num + " is less than 8");
		
		}
		
		
		double d = Double.parseDouble(s);
		int i = Integer.parseInt(s);
		
		System.out.println("My number is " + d);
		System.out.println("My number + 1 is " + (d+1));
		
		System.out.println("My number is " + i);
		System.out.println("My number +  1 is " + (i + 1));
		*/
		
		
	
	}

}
