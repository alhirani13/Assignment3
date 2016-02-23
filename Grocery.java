package Assignment3;

public class Grocery extends Item {

	//variables, constructor here
	protected boolean perishable;
	
	public Grocery(String initName, float initPrice, int initQuantity, int initWeight, boolean perish){
		super(initName, initPrice, initQuantity, initWeight);
		perishable = perish;
	}
	
	//override calculatePrice() if necessary; Implement print methods as necessary	
	// Only re-implement stuff you cannot get from the superclass (Item)
	float calculatePrice () 
	{
		float final_price = 0;
		final_price = (float)(price * quantity); // price * number of items
		final_price += final_price*(.10); // add tax
		if(perishable)
		{
			float ship = (float)(20* weight)*quantity; // add shipping
			ship += ship*.20;
			final_price += ship;
		}
		else
		{
			final_price += (20* weight)*quantity; // add shipping
		}
		return final_price;
	}
	
	void printItemAttributes () 
	{
		if(perishable)
		{
			System.out.printf("%s %f %d %f P\nFinal Price: $%.2d", name, price, quantity, weight, calculatePrice() );
		}
		else
		{
			System.out.printf("%s %f %d %f NP\nFinal Price: $%.2d", name, price, quantity, weight, calculatePrice() );

		}
	}
	
}
