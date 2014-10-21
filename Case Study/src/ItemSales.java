import java.text.DecimalFormat;


public class ItemSales 
{
	private int numSold = 0;
	private double totSales = 0; 
	private double totDisc = 0;
	private double itemCost = .99;
	private int bulkQuant = 100;
	private double bulkDiscPct = 0;
	
	DecimalFormat df = new DecimalFormat("#.##");
	
	public String toString()
	{
		
		
		return "Quantity: " + numSold + " Discount: $" + df.format(totDisc) + " Total Sales: $" + df.format(totSales);
	}
	
	ItemSales()
	{
		bulkQuant = 100;
		bulkDiscPct = .1;
	
	}
	
	ItemSales(double iCost)
	{
		itemCost = iCost;
		
	}
	
	ItemSales(double itemCost, int bulkQuantity, double discountPecentage)
	{
		this.itemCost = itemCost;
		bulkQuant = bulkQuantity;
		bulkDiscPct = discountPecentage;
	}
	
	ItemSales(int bulkQuantity, double discountPercentage)
	{
		bulkQuant = bulkQuantity;
		bulkDiscPct = discountPercentage;
	}
	
	public void registerSale(int n)
	{
		if(n > bulkQuant)
		{
			itemCost = itemCost - totDisc;
		}
	}
	
	public String displaySales()
	{
		return "Quantity: " + df.format(numSold) + " Total Sales: $" 
				+ df.format(totSales) + " Total Discount: $" + df.format(totDisc);
	}
	
	public static boolean equals(ItemSales i1, ItemSales i2)
	{
		return i1.equals(i2);
	}
	
	public void setNumSold(int sold)
	{
		numSold = sold;
	}
	
	public int getNumSold()
	{
		return numSold;
	}
	
	public void setTotalSales(double cost, int sold)
	{
		totSales = (cost * sold) - totDisc;
	}
	
	public double getTotalSales()
	{
		return totSales;
	}
	
	public void setTotalDiscount(double discount)
	{
		totDisc = itemCost * numSold * discount;
	}
	
	public double getTotalDiscount()
	{
		return totDisc;
	}
	
	public void setItemCost(double cost)
	{
		itemCost = cost;
	}
	
	public double getItemCost()
	{
		return itemCost;
	}
	
	public void setBulkQuant(int quantity)
	{
		bulkQuant = quantity;
	}
	
	public int getBulkQuant()
	{
		return bulkQuant;
	}
	
	public void setBulkDiscPct(int quantity)
	{
		if((numSold >= quantity) && (numSold < (quantity * 2)))
			bulkDiscPct = .1;
		
		if((numSold >= (quantity * 2)) && (numSold < (quantity * 3)))
			bulkDiscPct = .2;
		
		if(numSold >= (quantity * 3))
			bulkDiscPct = .3;
		
		if(numSold < quantity)
			bulkDiscPct = 0;
		
	}
	
	public double getBulkDiscPct()
	{
		return bulkDiscPct;
	}
	

}
