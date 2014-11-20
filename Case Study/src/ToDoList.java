import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ToDoList 
{
	ArrayList<TodoItem> items = new ArrayList();
	
	public static void main(String[] args) 
	{
		TodoItem tDI = new TodoItem("",0,"");
		tDI.addItem();

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
