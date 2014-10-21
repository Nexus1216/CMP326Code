import java.util.Scanner;

public class Characterstic 
{
	private int rating;
	private String descrition = "Tell us a little about yourself... ";
	
	public String getDescrition()
	{
		return descrition;
	}
	
	public void setDescrition(String d)
	{
		descrition = d;
		
	}
	
	public void setRating(int r)
	{
		if(isValid(r))
		{
			rating = r;
		}
		else
		{
			System.out.println("Invalid Rating.");
			setRating();
		}
		
	}
	
	public void setRating()
	{
		while (!isValid(rating))
		{
			
		
		System.out.println("Enter Rating: ");
		Scanner kb = new Scanner(System.in);
		int r = kb.nextInt(); 
		
		if(isValid(r))
		{
			rating = r;
			System.out.println("Description: " + descrition + "Rating: " 
					+ rating);
			
		}
		else
			System.out.println("Invalid Rating.");
			
		}
	}
	
	public int getRating()
	{
		return rating;
	}
	
	public boolean isValid(int r)
	{
		return r > 0 && r < 11;
	}
	
	
	public Characterstic()
	{
		rating = 0;
	}
	
	public Characterstic(String d, int r)
	{
		rating = r;
		descrition = d;
	}

	public static void main(String[] args) 
	{
		Characterstic c1 = new Characterstic();
		Characterstic c2 = new Characterstic("Looking for new adventures. ", 0);
		
		c1.setDescrition("Back on the market! ");
		
		System.out.println("Description: " + c1.getDescrition() + "Description: " 
		+ c1.getRating());
		
		c2.setRating(11);
		
	//	while (!c2.isValid(c2.getRating()))
		//{
	//		if(c2.isValid(c2.getRating()))
		//	{
			//	System.out.println("Description: " + c2.getDescrition() + "Description: " 
				//		+ c2.getRating());
//			}
	//		else
		//		c2.setRating();
	//	}

	}

}
