
public class Restaurant 
{
	private String name;
	private int streetNum;
	private String streetName;
	
	
	
	public static void main(String[] args) 
	{
		Restaurant r1 = new Restaurant("Denny's", 123, "Main Street");
		Restaurant r2 = new Restaurant();
		System.out.println("Created new objects: ");
		r2.setRestName("Tommy's");
		System.out.println(r1);
		System.out.println(r2);
	}
	
//	public boolean equals(Restaurant)
//	{
	
//	}
	
	public String toString()
	{
		return name + " is at " + streetNum + " " + streetName;
	}
	
	public Restaurant()
	{
		name = "Eatery";
		streetNum = 123;
		streetName = "Ashbey Lane";
	}
	
	public Restaurant(String rName)
	{
		name = rName;
	}
	
	public Restaurant(String rName, int num, String sName)
	{
		name = rName;
		streetNum = num;
		streetName = sName;
	}
	
	public void setRestName(String rName)
	{
		name = rName;
	}
	
	public String getRestName()
	{
		return name;
	}

}
