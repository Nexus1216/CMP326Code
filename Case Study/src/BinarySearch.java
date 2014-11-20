
public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int[] a = {1,3,5,6,11,21,56,100,500};
		
		System.out.println("77 in in array:"  + binarySearch(a,0,8,77));
		System.out.println("6 in in array:"  + binarySearch(a,0,8,6));
		System.out.println("2 in in array:"  + binarySearch(a,0,8,2));
		System.out.println("500 in in array:"  + binarySearch(a,0,8,500));

	}
	
	public static boolean binarySearch(int n, int[] a, int start, int end)
	{
		int middleIndex = (end - start)/2;
		if(n < a[middleIndex])
		{
			binarySearch(n,a,start,middleIndex);
		}
		return binarySearch(n,a,start,middleIndex);
	}
	
	public static boolean binarySearch(int[] a, int start, int end, int key)
	{
		if(start == end)
		{
			return a[start] == key;
		}
		if(end - start == 1)
		{
			return (a[start] == key) || (a[end] == key);
		}
		int middleIndex = (end + start)/2;
		if(a[middleIndex] > key)
		{
			return binarySearch(a,start,middleIndex - 1, key);
		}
		else
		{
			return binarySearch(a,middleIndex,end,key );
		}
	}

}
