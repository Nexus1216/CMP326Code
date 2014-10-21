
public class CallPets 
{
	
	
	public static void main(String[] args)
	{
		Pet dog = new Pet("Riley","dog",4);
		
		System.out.println("Name is: " + dog.name);
		System.out.println("Kind is: " + dog.kind);
		System.out.println("Age is: " + dog.age);
		System.out.println("Age in Human Years is: " + dog.getAgeInHumanYears());
		
		Pet cat = new Pet("Katness","cat",2);
		
		System.out.println("Name is: " + cat.name);
		System.out.println("Kind is: " + cat.kind);
		System.out.println("Age is: " + cat.age);
		System.out.println("Age in Human Years is: " + cat.getAgeInHumanYears());
		
		Pet mouse = new Pet("Jerry","mouse",1);
		
		System.out.println("Name is: " + mouse.name);
		System.out.println("Kind is: " + mouse.kind);
		System.out.println("Age is: " + mouse.age);
		System.out.println("Age in Human Years is: " + mouse.getAgeInHumanYears());
		
	}

}
