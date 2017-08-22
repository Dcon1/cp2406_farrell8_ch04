/**
 * Created by danny on 8/22/2017.
 */
public class Billing {
    public static void computeBill(double price)
    {
        System.out.println("The price for a single photo book is " + price + " The total price is " + (((price / 100) * 8) + price) );
    }
    public static void computeBill(Double price, Integer quantity)
    {
        System.out.println("The price for a single photo book is " + price + " You have ordered " + quantity + " Photo books, the total price is " + ((((price / 100) * 8) + price) * quantity));
    }
    public static void computeBill(Double price, Integer quantity, Double couponValue)
    {
        System.out.println("The price for a single photo book is " + price + " You have ordered " + quantity + " Photo books, the total price is " + (((((price / 100) * 8) + price) * quantity) - couponValue));
    }

    public static void main(String[] args) {
        computeBill(10.00);
        computeBill(10.00, 2);
        computeBill(10.00, 2, 2.00);
    }
}
