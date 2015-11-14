import java.util.Scanner;
public class LeapYear
{
    public static void LeapYear()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        int n = year % 4;
        int n2 = year % 400;
        int n3 = year % 100;
        if (n == 0 && n3 != 0 || n2 == 0)
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}