import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class ItemSalesDemo 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		
		ItemSales item1 = new ItemSales();
		ItemSales item2 = new ItemSales(19.99);
		ItemSales item3 = new ItemSales(9.99, 100, .1);
		ItemSales item4 = new ItemSales(100, .1);
		
		item1.setItemCost(rnd.nextInt(100));
		item4.setItemCost(99.99);
		
		Scanner keyBoard  = new Scanner(System.in);
		
		System.out.println("Item1 Cost: " + item1.getItemCost());
		System.out.println("Item2 Cost: " + item2.getItemCost());
		System.out.println("Item3 Cost: " + item3.getItemCost());
		System.out.println("Item4 Cost: " + item4.getItemCost());
		
		System.out.println("Enter Item1 Quatity: ");
		item1.setNumSold(keyBoard.nextInt());
		
		System.out.println("Enter Item2 Quatity: ");
		item2.setNumSold(keyBoard.nextInt());
		
		System.out.println("Enter Item3 Quatity: ");
		item3.setNumSold(keyBoard.nextInt());
		
		System.out.println("Enter Item4 Quatity: ");
		item4.setNumSold(keyBoard.nextInt());
		
		item1.setBulkDiscPct(item1.getBulkQuant());
		item2.setBulkDiscPct(item2.getBulkQuant());
		
		item1.setTotalDiscount(item1.getBulkDiscPct());
		item2.setTotalDiscount(item2.getBulkDiscPct());
		item3.setTotalDiscount(item3.getBulkDiscPct());
		item4.setTotalDiscount(item4.getBulkDiscPct());
		
		
		
		item1.setTotalSales(item1.getItemCost(), item1.getNumSold());
		item2.setTotalSales(item2.getItemCost(), item2.getNumSold());
		item3.setTotalSales(item3.getItemCost(), item3.getNumSold());
		item4.setTotalSales(item4.getItemCost(), item4.getNumSold());
		
		item3.registerSale(item3.getNumSold());
		item4.registerSale(item4.getNumSold());
		
		
		System.out.println("Item1 - " + item1);
		System.out.println("Item2 - " + item2);
		
		System.out.println("Item3 - " + item3.displaySales());
		System.out.println("Item4 - " + item4.displaySales());
		
		System.out.println("Is Item1 EQUAL to Item2? " + ItemSales.equals(item1,item2));
		System.out.println("Is Item3 EQUAL to Item3? " + ItemSales.equals(item3,item3));
		
		

	}
	
	

}
