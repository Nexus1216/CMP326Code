
import java.util.Scanner;

public class Machine_Change 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in); 
		int pennies = 1;
		int nickels = 5;
		int dimes = 10;
		int quarters = 25;
		int change;
		
		String h = "goodbye!";
		int len = h.length();
		
		System.out.println("The String " + h + " has length " + len);
		System.out.println("or length " + h.length());		
		
		char firstChar = h.charAt(0);
		
		System.out.println("\nThe first character is " + firstChar);
		System.out.println("The second character is " + h.charAt(1));
		
		int position = h.indexOf("!");
		
		
		System.out.println("The index of ! is " + position);
		System.out.println("The position of O is " + h.indexOf("o"));
		System.out.println("The position of 'bye' is " + h.indexOf("bye"));
		
		
		int secHalf = len / 2;
		
		System.out.println("The substring beginning at 4 is " + secHalf);
		
		
		System.out.println("The first half is " + h.substring(0, secHalf));
		System.out.println("The seconf half is " + h.substring(secHalf, len));
		
				
		
		
		
		
		System.out.println("Enter a number between 1 and 99");
		
		
		int amount = keyboard.nextInt();
		
		//change = amount;
		
		int numQuarters = amount/quarters;
		change = amount % quarters;
		
		int numDimes = change/dimes;
		change = change % dimes;
		
		int numNickels = change/nickels;
		int numPennies = change % nickels;
		
		//int numPennies = amount/pennies;
		// amount = amount % numPennies;
		
		System.out.println("Your change is: " + numQuarters + " quarters "  + numDimes+ " dimes "  + numNickels + " nickles "  + numPennies + " pennies");
		
		
		
		
	
	
	
	}
}
