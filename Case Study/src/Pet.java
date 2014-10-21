
public class Pet 
{
	public String name;
	public String kind;
	public int age;
	
	
	
	
	public static void main(String[] args)
	{
		Pet pet = new Pet("Riley","dog",4);
		
	}
	
	public int getAgeInHumanYears()
	{
		if(kind.equals("dog") ||kind.equals("cat"))
			return age*7;
		else
			return age*40;
	}
	
	public Pet(String name, String kind, int age)
	{
		this.name = name;
		this.kind = kind;
		this.age = age;
	}

}
