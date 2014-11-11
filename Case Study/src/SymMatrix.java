
public class SymMatrix 
{

	public static void main(String[] args) 
	{
		int [] [] grid = new int [4] [4];
		int [] [] grid2 = new int [4] [2];
		
		
		System.out.println(SymMatrix.symetrical(grid));
		System.out.println(SymMatrix.symetrical(grid2));
		
		setGrid(grid2);
		printGrid(grid);
		printGrid(grid2);
		
	}
	
	
	public static boolean symetrical (int [] [] s)
	{
		return s.length == s[0].length;
	}
	
	public static void setGrid (int [][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				a[i] [j] = 1;
			}
			
		}
	}
	
	public static void printGrid(int [][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
