
public class Vegetable 
{
	public String name = "";
	public int growingDays = 20;
	
	public Vegetable(String n)
	{
		name = n;
	}

	public static void main(String[] args) 
	{
		Vegetable turnip = new Vegetable("Turnip");
		System.out.println("name is " + turnip.name);
		System.out.println("growing days are" + turnip.growingDays);
	}

}
