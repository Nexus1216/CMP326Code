
public class Quiz2 
{
	public static void main(String [] args)
	{
		int div3 = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			// if(i % 3 == 0)
			div3++;
			if(div3 > 2)
				div3 = 0;
			if(div3 == 0)
				System.out.println("Divisable by 3");
			else
				System.out.println(i);
		}
		
	}

}
