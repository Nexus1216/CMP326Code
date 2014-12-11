import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ToDoList 
{
	private ArrayList<TodoItem> items = new ArrayList();
	String name = "";
	String date = "";
	int priority = 0;
	public static void main(String[] args) 
	{
		ToDoList tDL = new ToDoList();
		tDL.addItem();
		
	}
	
	
	public void addItem()
	{
		ArrayList<TodoItem> items = new ArrayList();
		Scanner kb1 = new Scanner(System.in);
		Scanner kb2 = new Scanner(System.in);
		Scanner kb3 = new Scanner(System.in);
		String n = " ";
		int p = 0;
		String d = " ";
		boolean quit = false;
		
		Scanner infile = null;
		Scanner kb = new Scanner(System.in);
		
			while(!quit)
			{
				try
				{	
					System.out.print("Enter Task: ");
					name = kb1.nextLine();
					if (name.equals("end"))
					{
						quit = true;
						break;
					}
				
					System.out.print("Enter Priority: ");
					priority = kb3.nextInt();
					
					if(priority > 5 || priority < 1)
					{
						throw new Exception("ERROR: Priority much be 1-5:");
					}

					System.out.print("Enter Date: ");
					date = kb2.nextLine();
					if (date.equals("end"))
					{
						quit = true;
						break;
					}
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
					if(p < 1)
					{
						priority = 1;
					}
					if(p > 5)
					{
						priority = 5;
					}
				}
				
				addItem(name,priority,date);
				
				
			}
			
			compareSort();
			
			
		
		
	}

	
		
	public void addItem(String n, int p, String d)
	{
		items.add(new TodoItem(n,p,d));
	}
	
	
	public void compareSort()
	{
		Collections.sort(items);
	}
	

}
