import java.util.Scanner;
public class BARTFare 
{
	public static void main (String [] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter ticket Type: (Adult or Child)");
		String ticType = keyboard.nextLine();
		System.out.println("Enter your Zone:");
		int zone = keyboard.nextInt();
		
		
		
		if((zone > 0 && zone <= 4))
		{
			HandlePricing(zone, ticType);
		}
		else
			System.out.println("Your Fare is: -");
		
	}
	public static void HandlePricing(int zone, String ticType)
	{
		if((ticType.contains("Adult") || ticType.contains("ADULT") || ticType.contains("adult") || 
		   ticType.contains("Child") || ticType.contains("CHILD") || ticType.contains("child")))
		{
		if(zone == 2 || zone == 1)
		{
			if(ticType.contains("Adult") || ticType.contains("ADULT") || ticType.contains("adult"))
				System.out.println("Your Fare is: $20");
			if(ticType.contains("Child") || ticType.contains("CHILD") || ticType.contains("child"))
				System.out.println("Your Fare is: $10.50");
		}
		
		if(zone == 3)
		{
			if(ticType.contains("Adult") || ticType.contains("ADULT") || ticType.contains("adult"))
				System.out.println("Your Fare is: $30.50");
			
		}
		
		if(zone == 3 || zone == 4)
		{
			if(ticType.contains("Child") || ticType.contains("CHILD") || ticType.contains("child"))
				System.out.println("Your Fare is: 20");
			
		}
		
		if(zone == 4)
		{
			if(ticType.contains("Adult") || ticType.contains("ADULT") || ticType.contains("adult"))
				System.out.println("Your Fare is: $43");
		}
		
		}
		else
			System.out.println("Your Fare is: -");
			
		
		
		
		
		
		
	}
}
