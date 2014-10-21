import java.text.DecimalFormat;
import java.util.Scanner;
public class TemperatureConverter 
{
	public static void main (String [] args)
	{
		boolean run = true;
		//while(run)
		
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a temperature followed by either “C” for Celsius or “F” for Fahrenheit.");
		
			String h = keyboard.nextLine();
			
			int len = h.length();
			
			String num = h.substring(0, len - 1);
			
			int degrees = Integer.parseInt(num);
			
			double Degrees_C = 5 * (degrees - 32)/9;
			double Degrees_F = (9/5) * degrees + 32;
			DecimalFormat df = new DecimalFormat("#.#");
			
			if(h.charAt(len - 1) == 'C' || h.charAt(len - 1) == 'c')
			{
				System.out.println(df.format(degrees) + " Degrees Celsius is " + df.format(Degrees_F) + " Degrees Fahrenheit.");
			}
			else
				System.out.println(df.format(degrees) + " Degrees Fahrenheit is " + df.format(Degrees_C) + " Degrees Celsius.");
			
	}
	
		

}
