import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

enum Priority
{
	None,
	Low,
	Medium,
	High
}

public class TodoItem implements KeyListener
{
	ArrayList<String> items = new ArrayList();
	
	protected String name;
	protected Priority priority;
	protected String date;
	
	
	
	public TodoItem(String n, Priority p, String d)
	{
		name 
		
	}

}
