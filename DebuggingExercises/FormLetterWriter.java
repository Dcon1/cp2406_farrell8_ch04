/**
 * Created by danny on 8/22/2017.
 */
public class FormLetterWriter {
    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr, or Ms." + lastName);
    }

    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + lastName);
    }

    public static void displayLetter()
    {
        System.out.println("Thank you for your order.");
    }

    public static void main(String[] args) {
        displaySalutation("Kelly");
        displayLetter();
        displaySalutation("Cristy ", "Johnston");
        displayLetter();
    }

}
