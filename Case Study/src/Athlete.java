
public class Athlete 
{
	int age = 18;
	int medals = 0;
	String name;
	String sport;
	double medalAverage;
	
	public Athlete()
	{
		name = "John Doe";
		sport = "Football";
		age = 18;
		medals = 0;
	}
	
	public Athlete (int howOld)
	{
		name = "John Doe";
		sport = "Football";
		age = howOld;
		medals = 0;
	}
	
	public Athlete (int howOld, int medalsWon)
	{
		name = "John Doe";
		sport = "Football";
		age = howOld;
		medals = medalsWon;
	}

	public void setAge(int howOld)
	{
		age = howOld;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setMedalsWon(int medalsWon)
	{
		medals = medalsWon;
	}
	
	public int getMedals()
	{
		return medals;
	}
	
	public void setName(String pName)
	{
		name = pName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setSport(String pSport)
	{
		sport = pSport;
	}
	
	public String getSport()
	{
		return sport;
	}
	
	public void medalsPerYear(int medalsWon, int howOld)
	{
		medalAverage = (howOld/medalsWon);
	}
	
	
	
	




}
