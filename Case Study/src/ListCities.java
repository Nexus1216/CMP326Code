import java.util.Scanner;
import java.util.ArrayList;

public class ListCities 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String word = " ";
		int num = 0;
		boolean quit = false;
		ArrayList<String> numWords = new ArrayList();
		String currentWord = "";
		String bWord = "";

		while(!quit)
			{
				System.out.print("Please enter a five-letter word (<enter> to end): ");
		
				word = keyboard.nextLine();
				
				int len = word.length();
				num++;
				
				if(len > 0)
				{
					if(len != 5)
					{
						System.out.println("That's not five letters! ");
					
					}
					else
						numWords.add(word);
				}
				else
				{
					if(numWords.size() < 5)
						System.out.println("Please enter at least five words ");
					else
						quit = true;
				}
				
			}
		
		if(quit)
		{
				for (int i = 0; i < 5; i++)
				{
					
					for (int j = 0; j < 5; j++)
					{
						bWord = bWord + numWords.get(j).charAt(i);
					}
					System.out.println(bWord);
					bWord = "";
				}
		}
		
				
				
			

	}

}
