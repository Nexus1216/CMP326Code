import java.util.Scanner;
public class HandShakes 
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("How many guests are invited to the party: ");
		
		int numGuests = keyboard.nextInt();
		int guestsLeft = 0;
		int handShakes = 0;
		
		for(int i = numGuests;  i > 0; i--)
		{
			handShakes = handShakes + guestsLeft;
			guestsLeft++;
			
			System.out.println("When Guest " + guestsLeft + " arrives, Handshakes =  " + 
			guestsLeft + " , Total Handshakes = " + (guestsLeft + handShakes));
			
		}
	}

}
