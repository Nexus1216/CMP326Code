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
		boolean exit = false;
		int[] rewind1 = {1,2,3,4,5,6};
		int[] rewind2 = {1};
		int[] rewind3 = {1,2,3,4,5};
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
		System.out.println("");
		System.out.println("");
		
		reverseArray(rewind1);
		System.out.println("");
		System.out.println("");
		reverseArray(rewind2);
		System.out.println("");
		System.out.println("");
		reverseArray(rewind3);
		
		
		
		
		
		
	}
	
	public static void reverseArray(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		int[] reverse = new int[a.length];
		
		
		for(int i = 0; i < a.length; i++)
		{
			reverse[reverse.length - 1 - i] = a[0] + i;
		}
		
		for(int i = 0; i > a.length; i++)
		{
			a[i] = reverse[i];
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(reverse[i]);
		}
	}

}
