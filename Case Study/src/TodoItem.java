
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class TodoItem implements Comparable <TodoItem>
{
	//ArrayList<String> items = new ArrayList();
	
	protected String name;
	protected int priority;
	protected String date;
	
	
	
	public TodoItem(String n, int p, String d)
	{
		name = n;
		priority = p;
		date = d;
		
	}
	
	public String toString()
	{
		
		return "Item: " + name + " Priority: " + priority + " Date: " + date;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String n) 
	{
		name = n;
	}
	

	public String getDate()
	{
		return date;
	}
	public void setDueDate(String d)
	{
		date= d;
	}
	
	public int getPriority()
	{
		return priority;
	}
	public void setPriority(int p)
	{
		if(p > 0 && p < 6)
		{
			priority = p;
		}
		else 
		{
			
			System.out.println("ERROR: Priority much be 1-5:");
			if(p < 1)
			{
				priority = 1;
			}
			if(p > 5)
			{
				priority = 5;
			}
			
		}
	}
	
	public int compareTo(TodoItem i)
	{
		
		return this.date.compareTo(i.date);
	}
	
	public boolean equals(Object obj)
	{
		boolean isEqual = false;
		
		if(obj != null)
		{
			if(obj instanceof TodoItem)
			{
				TodoItem otherItem = (TodoItem) obj;
				if(this.name == otherItem.name && this.priority == otherItem.priority)
				{
					isEqual = true;
				}
			}
		}
		
		
		return isEqual;
	}

	public static void main(String[] args) 
	{
		TodoItem i1 = new TodoItem("Go to Bank", 2, "11/20");
		TodoItem i2 = new TodoItem("Meeting with Boss", 5, "11/19");
		TodoItem i3 = new TodoItem("Parent teacher conference", 6, "12/16");
		

		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		i3.setPriority(i3.getPriority());
		System.out.println(i3);
		

		TodoItem [] toDoArray= {i3,i1,i2};
		
		Arrays.sort(toDoArray);
		
		for(int i=0; i<toDoArray.length; i++){
			System.out.println(i+1 + ":" + toDoArray[i]);
		}

	}
	


	
	

}
