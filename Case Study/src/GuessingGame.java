import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		
		boolean quit = false;

		System.out.print("Guess a Number (between 1 and 10): ");
		
		
		while(!quit)
		{
			
			int magicNum = rnd.nextInt(10);
			int guessNum = keyboard.nextInt();
		
			if(guessNum > magicNum)
				System.out.print("Too High... Enter the another Number: ");
			if(guessNum < magicNum)
				System.out.print("Too Low...  Enter the another Number: ");
			if(guessNum == magicNum)
			{
				System.out.print("CONGRATULATIONS!!! YOU GUESSED IT!!! ");
				quit = true;
			}
		}
		
		
		
		

	}

}
