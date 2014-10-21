import java.util.Scanner;

public class backwards 
{

	public static void main(String[] args) 
	{
		Scanner kB = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		
		String word = "";
		word = kB.nextLine();
		int len = word.length();
		String newWord = "";
		
		for (int i = len - 1; i >= 0; i--)
		{
			newWord = newWord + word.charAt(i);
		}
		
		System.out.println(newWord);
		

	}

}
