import java.util.Scanner;

public class currency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double inr_usd = 0.012;
        double usd_inr = 84;
        double inr_eur = 0.011;
        double eur_inr = 90;

        int c = 0;

        while (c != 5) {
            System.out.println("1. INR to USD");
            System.out.println("2. USD to INR");
            System.out.println("3. INR to EUR");
            System.out.println("4. EUR to INR");
            System.out.println("5. EXIT");
            System.out.print("Choose: ");
            c = sc.nextInt();

            if (c == 1) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                System.out.println("USD = " + (a * inr_usd));
            }
            else if (c == 2) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                System.out.println("INR = " + (a * usd_inr));
            }
            else if (c == 3) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                System.out.println("EUR = " + (a * inr_eur));
            }
            else if (c == 4) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                System.out.println("INR = " + (a * eur_inr));
            }
            else if (c == 5) {
                System.out.println("Thankyou");
            }
            else {
                System.out.println("Invalid");
            }

            System.out.println();
        }
    }
}
