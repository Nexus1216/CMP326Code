import java.text.DecimalFormat;
import java.util.Scanner;
public class CoinTosses 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int tossNum = 1;
		int heads = 0;
		int tails = 0;
		String t1 = "";
		String t2 = "";
		String t3 = "";
		String t4 = "";
		String t5 = "";
		String t6 = "";
		String t7 = "";
		String t8 = "";
		
		for (int i = 0; i < 8; i++)
		{
			System.out.println("Enter outcome of coin toss number " + tossNum + ": (h of t)");
		
			String tossOC = keyboard.nextLine();
			int len = tossOC.length();
			
			if((tossOC.contains("t")|| tossOC.contains("t") || tossOC.contains("h")|| 
			   tossOC.contains("H")) && (len == 1))
			{
				tossNum++;
				if(tossOC.contains("t")|| tossOC.contains("t"))
				{
					tails++;
					
					if(tossNum == 2)
						t1 = tossOC;
					if(tossNum == 3)
						t2 = tossOC;
					if(tossNum == 4)
						t3 = tossOC;
					if(tossNum == 5)
						t4 = tossOC;
					if(tossNum == 6)
						t5 = tossOC;
					if(tossNum == 7)
						t6 = tossOC;
					if(tossNum == 8)
						t7 = tossOC;
					if(tossNum == 9)
						t8 = tossOC;
				}
				if(tossOC.contains("h")|| tossOC.contains("H"))
				{
					heads++;
					
					if(tossNum == 2)
						t1 = tossOC;
					if(tossNum == 3)
						t2 = tossOC;
					if(tossNum == 4)
						t3 = tossOC;
					if(tossNum == 5)
						t4 = tossOC;
					if(tossNum == 6)
						t5 = tossOC;
					if(tossNum == 7)
						t6 = tossOC;
					if(tossNum == 8)
						t7 = tossOC;
					if(tossNum == 9)
						t8 = tossOC;
				}
				
			}
			else
				System.out.println("Please enter either h or t");
				
			
		
		
		}
		
		if (tossNum >= 8)
		{
			double h = heads;
			double t = tails;
			DecimalFormat df = new DecimalFormat("#.##");
			System.out.println("Toss 1 = " + t1);
			System.out.println("Toss 2 = " + t2);
			System.out.println("Toss 3 = " + t3);
			System.out.println("Toss 4 = " + t4);
			System.out.println("Toss 5 = " + t5);
			System.out.println("Toss 6 = " + t6);
			System.out.println("Toss 7 = " + t7);
			System.out.println("Toss 8 = " + t8);
			System.out.println("Number of heads: " + heads);
			System.out.println("Number of tails: " + tails);
			System.out.println("Percent heads: " + df.format(((h/8) * 100)) +"%");
			System.out.println("Percent tails: " + df.format(((t/8) * 100)) +"%");
			
			
		}
		
		
		
	}

}
