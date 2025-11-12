
import java.util.Scanner;
public class grade
{
    public static void main(String[] args)
    {
        System.out.print("---Student Grade Calculator---");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Tamil mark(out of 100): ");
        int a=sc.nextInt();
        System.out.print("Enter your English mark(out of 100): ");
        int b=sc.nextInt();
        System.out.print("Enter your Maths mark(out of 100): ");
        int c=sc.nextInt();
        System.out.print("Enter your Science mark(out of 100): ");
        int d=sc.nextInt();
        System.out.print("Enter your Social mark(out of 100): ");
        int e=sc.nextInt();
        int tot=a+b+c+d+e;
        int avg=tot/5;
        System.out.println(" ");
        System.out.println("---Results---");
        System.out.println(" ");
        System.out.println("Total Marks: " +tot);
        System.out.println("Average Percentage: "+avg+"%");
        if(avg>=85 && avg<=100)
        {
            System.out.println("O grade");
        }
        else if(avg>=70 && avg<=84)
        {
            System.out.println("A grade");
        }
        else if(avg>=55 && avg<=69)
        {
            System.out.println("B grade");
        }
        else if(avg>=40 && avg<=54)
        {
            System.out.println("C grade");
        }
        else
        {
            System.out.println("D grade");
        }
    }
}