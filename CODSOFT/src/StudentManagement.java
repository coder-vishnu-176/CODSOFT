import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[50];
        int[] roll = new int[50];
        String[] grade = new String[50];

        int count = 0;
        int ch = 0;

        while (ch != 5) {
            System.out.println("1 Add");
            System.out.println("2 Remove");
            System.out.println("3 Search");
            System.out.println("4 Show All");
            System.out.println("5 Exit");
            System.out.print("Choose: ");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Name: ");
                name[count] = sc.next();
                System.out.print("Roll: ");
                roll[count] = sc.nextInt();
                System.out.print("Grade: ");
                grade[count] = sc.next();
                count++;
                System.out.println("Added");
            }

            else if (ch == 2) {
                System.out.print("Roll: ");
                int r = sc.nextInt();
                int i;
                boolean f = false;
                for (i = 0; i < count; i++) {
                    if (roll[i] == r) {
                        f = true;
                        break;
                    }
                }
                if (f) {
                    for (int j = i; j < count - 1; j++) {
                        name[j] = name[j+1];
                        roll[j] = roll[j+1];
                        grade[j] = grade[j+1];
                    }
                    count--;
                    System.out.println("Removed");
                } else {
                    System.out.println("Not Found");
                }
            }

            else if (ch == 3) {
                System.out.print("Roll: ");
                int r = sc.nextInt();
                boolean f = false;
                for (int i = 0; i < count; i++) {
                    if (roll[i] == r) {
                        System.out.println(name[i] + " " + grade[i]);
                        f = true;
                        break;
                    }
                }
                if (!f) System.out.println("Not Found");
            }

            else if (ch == 4) {
                if (count == 0) System.out.println("No Students");
                for (int i = 0; i < count; i++) {
                    System.out.println(name[i] + " " + roll[i] + " " + grade[i]);
                }
            }

            else if (ch == 5) {
                System.out.println("Bye");
            }

            else {
                System.out.println("Wrong");
            }

            System.out.println();
        }
    }
}
