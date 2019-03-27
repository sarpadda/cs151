/**
   A product with a price and description.
*/
public class Product implements LineItem
{
   /**
      Constructs a product.
      @param description the description
      @param price the price
   */
   public Product(String description, double price)
   {
      this.description = description;
      this.price = price;
      times=1;
   }
   
   public int getTimes() {
		  return times;
	  }
	  public void addToTimes() {
		   times++;
	  }
   public double getPrice() { return price*times; }
   public String toString() { return description; }
   private String description;
   private double price;
   private int times;
}
