
public class Book 
{
	protected String title;
	protected String author;
	
	public Book (String t, String a)
	{
		title = t;
		author = a;
		
	}
	
	public String toString()
	{
		return title + " By " + author;
	}

	public static void main(String[] args) 
	{
		Book b1 = new Book("Never Cry Wolf", "Farley Mowat");
		Book b2 = new Book("The Perfect Pich", "Jon Steel");
		Book b3 = new Book("The Singularity is Near", "Ray Kurzweil");
		TextBook t1 = new TextBook("48 Laws of Power", "Robert Greene" , "Self Help");
		TextBook t2 = new TextBook("Our Final Invention", "James Barrat" , "Non Fiction");
		TextBook t3 = new TextBook("Daemon", "Daniel Suarez" , "Fiction");
		
		Book[] properties = {b1, b2, b3, t1, t2, t3};
		
		for (int i = 0; i < properties.length; i++)
		{
			System.out.println(properties[i]);
		}
		
		System.out.println("");
		System.out.println("Print only TextBooks");
		
		for (int i = 0; i < properties.length; i++)
		{
			if(properties[i] instanceof TextBook)
			System.out.println(properties[i]);
		}
		
		System.out.println("");
		System.out.println("Print only Books");
		
		for (int i = 0; i < properties.length; i++)
		{
			if(properties[i] instanceof Book)
			System.out.println(properties[i]);
		}

	}

}
