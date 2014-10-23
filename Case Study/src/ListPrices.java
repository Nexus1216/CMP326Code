import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ListPrices 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		ArrayList<Double> price = new ArrayList();
		
		double total = 0;
		DecimalFormat df = new DecimalFormat("$#,###.00");
		boolean exit = false;
		
		while(!exit)
		{
			System.out.print("Please enter a price (<0> to end): ");
			String p = kb.nextLine();
			
			if (p.equals(""))
				exit = true; 
			else
				price.add(Double.parseDouble(p));
		}
		
		System.out.println("Your Receipt:");
		
		for (int i = 0; i < price.size(); i++)
		{
			System.out.format("$%13.2f%n",price.get(i));
			total += price.get(i);
		}
		
		System.out.println("--------------");
		System.out.format("$%13.2f%n", total);

	}

}
