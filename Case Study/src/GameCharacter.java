
public class GameCharacter 
{
	
	public String name;
	public String type;
	public int health;
	
	public static void main(String[] args)
	{
		GameCharacter player1 = new GameCharacter("Hunter","Scout", 10);
		GameCharacter player2 = new GameCharacter("Titan","Soldier", 10);
		GameCharacter player3 = new GameCharacter("Warlock","Medic", 10);
		
		player1.changeHealth(-4);
		player2.changeHealth(4);
		player3.changeHealth(-11);
		
		System.out.println("Player1 - Name: " + player1.name + " Type: " 
		+ player1.type + " Health: " + player1.health);
		
		System.out.println("Player2 - Name: " + player2.name + " Type: " 
				+ player2.type + " Health: " + player2.health);
		
		System.out.println("Player3 - Name: " + player3.name + " Type: " 
				+ player3.type + " Health: " + player3.health);
		
	}
	
	public void changeHealth(int change)
	{
		health += change;
		
		if (health <= 0 )
			System.out.println(name + " is dead");
	}
	
	public GameCharacter(String pName, String pType, int pHealth)
	{
		name = pName;
		type= pType;
		health = pHealth;
	}


}
