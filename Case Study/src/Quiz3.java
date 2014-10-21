import java.util.Scanner;
public class Quiz3 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = kb.nextLine();
		int len = word.length() - 1;
		
		for(int i = 0; i < len; i++)
		{
			System.out.println("" + word.charAt(i) + word.charAt(i + 1));
		
		}
		
		
		
		
	}

}
