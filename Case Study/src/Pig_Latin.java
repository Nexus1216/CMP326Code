import java.util.Scanner;
public class Pig_Latin 
{
	public static void main (String[] args)
	{
		boolean run = true;
		
		Scanner keyboard = new Scanner(System.in);
		String ay = "ay";
		String hay = "hay";
		int minimum = 1;
		int vowelPos;
		int aPos = 0;
		int ePos = 0;
		int iPos = 0;
		int oPos = 0;
		int uPos = 0;
		
		System.out.println("Enter a word: ");
	
		String h = keyboard.nextLine();
	
		int len = h.length();
		
		if(isVowel(h.charAt(0)))
		{
			System.out.println(h + " is " + h + hay + " in Pig Latin");
		}
		else
		{
			if(h.contains("a"))
				aPos = h.indexOf("a");
			if(h.contains("e"))
				ePos = h.indexOf("e");
			if(h.contains("i"))
				iPos = h.indexOf("i");
			if(h.contains("o"))
				oPos = h.indexOf("o");
			if(h.contains("u"))
				uPos = h.indexOf("u");
			
			
			int[] vowelArray = new int[6];
			vowelArray[0] = 0;
			vowelArray[1] = ePos;
			vowelArray[2] = iPos;
			vowelArray[3] = oPos;
			vowelArray[4] = uPos;
			vowelArray[5] = aPos;
			
			minimum = 0; //sets the first to be the smallest
			
			
			for (int i = 0; i < vowelArray.length; i++) //goes through your array
			{
				if(vowelArray[i] > 0)
				{
			     if (vowelArray[i] <= minimum || minimum == 0) //checks and replaces if necessary
			     {
			    	 
			        minimum = vowelArray[i];   
			     
			     }
				}
			}
			
			System.out.println(h + " is " + h.substring(minimum, len)+ h.substring(0, minimum) + ay + " in Pig Latin ");

				
				
			
			
		
		}
		
	}
	
	public static boolean isVowel(char letter)
	{
		boolean isVowel = false;
		
		isVowel = (letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') ||  (letter == 'u');
		
		return isVowel;
		
	}

}
