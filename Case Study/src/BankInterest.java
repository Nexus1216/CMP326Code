import java.text.DecimalFormat;
import java.util.Scanner;

public class BankInterest 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		boolean quit = false;
		
		while(!quit)
		{
			System.out.print("Enter initial balance: ");
			double balance = keyboard.nextDouble();
			System.out.print("Enter APR: ");
			double interest = keyboard.nextDouble();
			String year = " year";
			double annual = 0;
			double monthly = 0;
			double daily = 0;
			
			double aBalance = balance;
			double mBalance = balance;
			double dBalance = balance;
			
			
			
			if(balance < 0)
			{
				System.out.println("Done.");
				quit = true;
			}
			else
			{
				for(int i = 1; i <= 10; i++)
				{
					annual = (aBalance*interest);
					monthly = (mBalance*(interest/12));
					daily = (dBalance*(interest/365));
					
					if(i > 1)
						year = " years";
					
					aBalance += annual;
					mBalance += (annual + monthly);
					dBalance += (annual + monthly + daily);
					
					System.out.println("After " + i + year);
					DecimalFormat df = new DecimalFormat("#.##");
					System.out.println("Annually compounded: " + df.format(aBalance));
					System.out.println("Monthly compounded: " + df.format(mBalance));
					System.out.println("Daily compounded: " + df.format(dBalance));
				}
			}
			
			
		}
		
		

	}

}
