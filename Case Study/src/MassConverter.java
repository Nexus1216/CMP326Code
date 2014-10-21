import java.util.Scanner;
import java.text.*;

public class MassConverter 
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of stones to be weigh: ");
		
		double Stones = keyboard.nextInt();
		
		double lbs = Stones * 14;
		
		double kg = lbs * 0.453592;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(Stones) + " stones weigh " + df.format(kg) + " Kilograms.");
		
		
	}

}
