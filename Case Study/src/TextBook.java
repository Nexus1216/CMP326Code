
public class TextBook extends Book
{
	private String subject;
	
	public TextBook (String t, String a, String s)
	{
		super(t,a);
		subject = s;
	}
	
	public String toString()
	{
		return super.toString() + " Subject: " + subject;
	}

}
