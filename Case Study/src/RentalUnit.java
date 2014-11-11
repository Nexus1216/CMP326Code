
public class RentalUnit 
{
	protected int streetNum;
	protected String streetName;
	
	public RentalUnit (int num, String name)
	{
		streetNum = num;
		streetName = name;
		
	}
	
	public String toString()
	{
		return "Address: " + streetNum + " " + streetName;
	}

	public static void main(String[] args) 
	{
		RentalUnit r1 = new RentalUnit(1062, "East Gun Hill Road");
		Apartment a1 = new Apartment(181, "Lake Ave " , "1A");
		
		RentalUnit[] properties = {r1,a1};
		
		for (int i = 0; i < properties.length; i++)
		{
			System.out.println(properties[i]);
		}
		
		System.out.println("Print only apartments");
		for (int i = 0; i < properties.length; i++)
		{
			if(properties[i] instanceof Apartment)
			System.out.println(properties[i]);
		}
		
		System.out.println("Print only Rental Units");
		for (int i = 0; i < properties.length; i++)
		{
			if(properties[i] instanceof RentalUnit)
			System.out.println(properties[i]);
		}

	}

}
