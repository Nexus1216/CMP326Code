
public class SymMatrix 
{

	public static void main(String[] args) 
	{
		int [] [] grid = new int [4] [4];
		int [] [] grid2 = new int [2] [4];
		
		
		System.out.println(SymMatrix.symetrical(grid));
		System.out.println(SymMatrix.symetrical(grid2));
	}
	
	public static boolean symetrical (int [] [] s)
	{
		return s.length == s[0].length;
	}

}
