
public class Apartment extends RentalUnit
{
	private String unitNum;
	
	public Apartment (int num, String name, String uNum)
	{
		super(num,name);
		unitNum = uNum;
	}
	
	public String toString()
	{
		return super.toString() + " Apt#: " + unitNum;
	}

}
