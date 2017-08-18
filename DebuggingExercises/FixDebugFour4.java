// This class discounts prices by 10%
public class FixDebugFour4
{
   public static void main(String args[])
   {
      final double DISCOUNT_RATE = 0.90;
      int price = 100;
      double price2 = 100.00;
      tenPercentOffInt(price, DISCOUNT_RATE);
      tenPercentOffDouble(price2, DISCOUNT_RATE);
   }
   private static void tenPercentOffInt(int price, final double DISCOUNT_RATE)
   {
      double newPrice = price * DISCOUNT_RATE;
      System.out.println("Ten percent off" + price);
      System.out.println("  New price is " + newPrice);
   }
   private static void tenPercentOffDouble(double price, final double DISCOUNT_RATE)
   {
      double newPrice = (((price / 100) * DISCOUNT_RATE) - price);
      System.out.println("Ten percent off " + price);
      System.out.println("  New price is " + newPrice);
   }
}
