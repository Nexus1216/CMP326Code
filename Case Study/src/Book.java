
public class Book implements Comparable <Book>
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
	
	public int compareTo(Book b)
	{
		return this.title.compareTo(b.title);
	}
	
	public boolean equals(Object obj)
	{
		boolean isEqual = false;
		
		if(obj != null)
		{
			if(obj instanceof Book)
			{
				Book otherBook = (Book) obj;
				if(this.title == otherBook.title && this.author == otherBook.author)
				{
					isEqual = true;
				}
			}
		}
		
		
		return isEqual;
	}

	public static void main(String[] args) 
	{
		Book b1 = new Book("Never Cry Wolf", "Farley Mowat");
		Book b2 = new Book("The Perfect Pich", "Jon Steel");
		Book b3 = new Book("The Singularity is Near", "Ray Kurzweil");
		Book b4 = new Book("The Singularity is Near", "Ray Kurzweil");
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
		
		System.out.println(b3.equals(b4));
		System.out.println(b3.equals(b1));
		System.out.println(b4.equals(b3));
		System.out.println(b3.compareTo(b1));
	}

}
