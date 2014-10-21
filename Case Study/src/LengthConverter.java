import java.util.Scanner;

public class LengthConverter 
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in); 
		int Yards = 3;
		int change;

		
		System.out.println("Enter Feet to be converted");
		
		
		int amount = keyboard.nextInt();
		
		
		int numYards = amount/Yards;
		change = amount % Yards;
		
		System.out.println("Your conversion is: " + numYards + " Yards "  + change + " Feet ");
		
		
	}

}
