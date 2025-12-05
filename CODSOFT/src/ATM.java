import java.util.Scanner;

class Account {
    double bal;

    Account(double b) {
        bal = b;
    }

    void deposit(double a) {
        bal += a;
    }

    boolean withdraw(double a) {
        if (a <= bal) {
            bal -= a;
            return true;
        }
        return false;
    }
}

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account acc = new Account(1000);

        int ch = 0;

        while (ch != 4) {
            System.out.println("1.Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Choose: ");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("Balance: " + acc.bal);
            }
            else if (ch == 2) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                acc.deposit(a);
                System.out.println("Done");
            }
            else if (ch == 3) {
                System.out.print("Amount: ");
                double a = sc.nextDouble();
                if (acc.withdraw(a)) {
                    System.out.println("Done");
                } else {
                    System.out.println("No Balance");
                }
            }
            else if (ch == 4) {
                System.out.println("Thankyou");
            }
            else {
                System.out.println("Invalid");
            }

            System.out.println();
        }
    }
}
