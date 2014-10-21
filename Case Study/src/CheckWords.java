import java.util.Scanner;

public class CheckWords 
{
	public static void main (String[] arges)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String word = "";
		
		while(!word.equals("quit"))
			{
				System.out.print("Enter a word: ");
		
				word = keyboard.nextLine();
		
				int len = word.length();
		
				String newWord = word.substring(1, len) + word.charAt(0);
		
				String bWord = "";
		
				for (int i = len - 1; i >= 0; i--)
				{
					bWord = bWord + newWord.charAt(i);
				}
		
				System.out.println(word + " is " + bWord + " backwards. ");
			}
	
	}
	
	

}
