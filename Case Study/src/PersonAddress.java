
public class PersonAddress 
{
	String first = "First name not set...";
	String last = "Last name not set...";
	String email = "Email Address not set...";
	String telephone  = "Phone Number not set...";
	
	public PersonAddress()
	{
		
	}
	
	public PersonAddress(String f, String l, String e, String t)
	{
		first = f;
		last = l;
		email = e;
		telephone = t;
		
	}
	
	public String toString()
	{
		return "First: " + first + " Last: " + last + " Email: " 
				+ email + " Telephone: " + telephone;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getTelephone()
	{
		return telephone;
	}
	
	public void setFirst(String f)
	{
		first = f;
	}
	
	public void setLast(String l)
	{
		last = l;
	}
	
	public void setEmail(String e)
	{
		email = e;
	}
	
	public void setTelephone(String t)
	{
		telephone = t;
	}
	

}
