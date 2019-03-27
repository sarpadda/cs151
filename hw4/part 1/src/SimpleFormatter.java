/**
   A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
   public String formatHeader()
   {
      total = 0;
      return "     I N V O I C E\n\n\n";
   }

   public String formatLineItem(LineItem item)
   {
      total += item.getPrice();
      String text=String.format(
            "%s: $%.2f  x%d \n",item.toString(),item.getPrice(), item.getTimes());

      return text;
   }

   public String formatFooter()
   {
	      String text=String.format("\n\nTOTAL DUE: $%.2f\n", total);
	       
      return text;
   }

   private double total;
}
