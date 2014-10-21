import java.util.Scanner;


public class Arrays 
{

	public static void main(String[] args) 
	{
		int[] a = new int[12];
		
		
		System.out.println("a has " + a.length + " Elements.");
		
		for(int i = 0; i < a.length; i++)
		{
			a[0] = 100;
			a[i] = a[0] + i;
			System.out.println("Element " + (i + 1) + " is: " + a[i]);
			
		}
		Scanner kb = new Scanner(System.in);
		System.out.print("How many elements do you want to store?" );
		int n = kb.nextInt();
		int[] b = new int[n];
		
		for(int i = 0; i < b.length; i++)
		{
			b[0] = 100;
			b[i] = b[0] + i;
			System.out.println("Element " + (i + 1) + " is: " + b[i]);
			
		}
		System.out.print("How many elements do you want to store?" );
		int n2 = kb.nextInt();
		int[] c = new int[n2];
		
		for(int i = 0; i < c.length; i++)
		{
			System.out.print("Enter Element " + (i + 1) + ": ");
			int n3 = kb.nextInt();
			c[i] = n3;
			
			
		}
		for(int i = 0; i < c.length; i++)
		{
			System.out.println("Element " + (i + 1) + " is: " + c[i]);
		
		}
		

	}

}
