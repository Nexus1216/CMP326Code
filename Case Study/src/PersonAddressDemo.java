
public class PersonAddressDemo 
{
	
	public static void main(String[] args) 
	{
		PersonAddress pA1 = new PersonAddress();
		PersonAddress pA2 = new PersonAddress("John", "Doe", "123@abc.com", "456-7890");
		PersonAddress pA3 = new PersonAddress();
		
		pA3.setFirst("Tommy");
		pA3.setLast("Tutone");
		pA3.setEmail("abc@123.com");
		pA3.setTelephone("867-5309");
		
		System.out.println(pA1);
		System.out.println(pA2);
		System.out.println(pA3);
		
	}

}
