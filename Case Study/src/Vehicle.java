
public class Vehicle 
{
	int numWheels = 4;
	int numDoors = 2;
	double gasAmt = 0;
	
	public Vehicle()
	{
		numWheels = 4;
		numDoors = 2;
		gasAmt = 0;
	}
	
	public Vehicle (int doors)
	{
		numWheels = 4;
		numDoors = doors;
		gasAmt = 0;
	}
	
	public Vehicle (int doors, int wheels)
	{
		numWheels = wheels;
		numDoors = doors;
		gasAmt = 0;
	}
	public Vehicle (int doors, int wheels, double gas)
	{
		numWheels = wheels;
		numDoors = doors;
		gasAmt = gas;
	}
	
	public Vehicle (double gas)
	{
		numWheels = 4;
		numDoors = 2;
		gasAmt = gas;
		
	}
	
	public void drive(int howFar)
	{
		gasAmt -= 25.0 * howFar;
	}
	
	public void addGas(double howMuch)
	{
		int numWheels = 9;
		this.numWheels = 18;
	}
	
	public void setNumWheels(int wheels)
	{
		numWheels = wheels;
	}
	
	public int getNumWheels()
	{
		return numWheels;
	}
	
	public void setNumDoors(int doors)
	{
		numWheels = doors;
	}
	
	public int getNumDoors()
	{
		return numDoors;
	}

}
