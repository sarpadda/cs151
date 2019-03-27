/**
   A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
   public String formatHeader()
   {
      total = 0;
      return "<font color='green'><b>I N V O I C E</b></font><br>";
   }

   public String formatLineItem(LineItem item)
   {
      total += item.getPrice();
      String text=String.format(
            "%s: $%.2f  x%d \n",item.toString(),item.getPrice(), item.getTimes());
      String htmlText = new String("<br><font color='green'><b>" + text + "</b></font><br>");
      return htmlText;
   }

   public String formatFooter()
   {
	      String text=String.format("\n\nTOTAL DUE: $%.2f\n", total);
	        String htmlText = new String("<br><font color='green'><b>" + text + "</b></font><br>");
      return htmlText;
   }

   private double total;
}
