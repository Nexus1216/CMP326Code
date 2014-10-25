
public class Planet 
{
	private double surfaceArea;
	
	public Planet(double a)
	{
		surfaceArea = a;
	}
	
	public String toString()
	{
		return "Planet with srface area " + surfaceArea + " million sq. miles";
	}
	
	public static double getTotalSurfaceArea(Planet[] p)
	{
		double total = 0;
		for(int i = 0; i < p.length; i++)
		{
			total += p[i].surfaceArea;
		}
		
		return total;
		
	}

	public static void main(String[] args) 
	{
		Planet[] solarSystem = new Planet[3];
		solarSystem[0] = new Planet(20);
		solarSystem[1] = new Planet(7);
		solarSystem[2] = new Planet(9);
		
		for(int i = 0; i < solarSystem.length; i++)
		{
			System.out.println(solarSystem[i]);
		}
		
		

	}

}
