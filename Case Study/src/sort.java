
public class sort 
{

	public static void main(String[] args) 
	{
		int [] myArray = {207, 3, 26, 1000, 7, 2};
		
		
		
		selectionSort(myArray);
		
		
	}
	
	public static void selectionSort(int [] a)
	{
		 
		for(int i = 0; i < a.length; i++)
		{
			int minIndex = i;
			
			for(int j = i; j < a.length; j++)
			{
				if(a[minIndex] > a[j])
				{
					minIndex = j;
					
					System.out.println("Found new min Element: " + a[minIndex] + " at Index: " + minIndex);
				}
			}
			
			System.out.println("Min Element in Array is: " + a[minIndex] + " at Index: " + minIndex);
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
			System.out.print("Array so far is: ");
			for(int k = 0; k < a.length; k++)
			{
				System.out.print(a[k] + " ");
			}
			
			System.out.println();
		}
			
	}
	
	public static void insertionSort(double [] a)
	{
		
	}

}
