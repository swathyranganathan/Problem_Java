import java.util.*;
import java.text.*;

public class Currency_Formatter_H {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double payment =scan.nextDouble();
        scan.close();

        //Create NumberFormat instances for different countries
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormate = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormate = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormate = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        //Formate the payment
        String us =usFormat.format(payment);
        String india =indiaFormate.format(payment);
        String china =chinaFormate.format(payment);
        String france =franceFormate.format(payment);

        System.out.println("US: "+us);
        System.out.println("India: "+us);
        System.out.println("China: "+china);
        System.out.println("France: "+france);

    }
}
