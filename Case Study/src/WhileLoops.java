import java.util.Scanner;

public class WhileLoops 
{
	public static void main(String[] args)
	{
		String q= ""; 
		while (!q.contains("quit"))
		{
			Scanner keyboard = new Scanner(System.in);
	
			System.out.println("What is the password? ");
			q = keyboard.nextLine();
		
			if(q.contains("quit"))
			{
				System.out.println("You entered the correct password! ");
			}
			else
				System.out.println("You entered the WRONG password ");
		}
	}
}
