import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ToDoList 
{
	private ArrayList<TodoItem> items = new ArrayList();
	
	public static void main(String[] args) 
	{
		ToDoList tDL = new ToDoList();
		tDL.addItem();

	}
	
	public void addItem()
	{
		//ArrayList<TodoItem> items = new ArrayList();
		String name = "";
		int priority = 0;
		String date = "";
		Scanner kb1 = new Scanner(System.in);
		Scanner kb2 = new Scanner(System.in);
		Scanner kb3 = new Scanner(System.in);
		String n = " ";
		int p = 0;
		String d = " ";
		boolean quit = false;
		
		
		
		while(!quit)
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
			setPriority(priority);

			System.out.print("Enter Date: ");
			date = kb2.nextLine();
			if (date.equals("end"))
			{
				quit = true;
				break;
			}
			
			addItem(name,priority,date));
			
			
		}
		
		compareSort();
		
		for(int i = 0; i < items.size(); i++)
		{
			System.out.println(items.get(i).toString());
		}
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
