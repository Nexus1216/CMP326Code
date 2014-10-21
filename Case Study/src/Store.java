
public class Store 
{
	public Vegetable v;
	public static int numStores = 0;
	public double area;
	
	public Store()
	{
		v = new Vegetable("Carrot");
		area = 2000;
	}
	
	public Store(String name)
	{
		v = new Vegetable(name);
		area = 2000;
	}

	public static void main(String[] args) 
	{
		Store s = new Store();
		Store s2 = new Store();
		Store s3 = new Store("rutabeta");
		Vegetable vLocal = new Vegetable("Beet");
		
		System.out.println("growing days of v are " + s.v.growingDays);
		System.out.println("growing days of vLocal are " + vLocal.growingDays);
		System.out.println("growing days of v are " + s2.v.growingDays);
		System.out.println("growing days of v are " + s3.v.name);
		
		s3.v.name = s.v.name;
		System.out.println("Set s3.v = s.v");
		System.out.println("store s3 has a vegetable " + s3.v.name);
		System.out.println("store s has a vegetable " + s.v.name);
		
		s.v.name = "zuchini";
		System.out.println("changing s.v.name");
		System.out.println("store s3 has a vegetable " + s3.v.name);
		System.out.println("store s has a vegetable " + s.v.name);
		
		s3.v.name = "squash";
		System.out.println("changing s3.v.name");
		System.out.println("store s3 has a vegetable " + s3.v.name);
		System.out.println("store s has a vegetable " + s.v.name);
		
		
	}

}
