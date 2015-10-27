import java.util.Scanner;
public class findMaxMin
{
    public static double findMax()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a series of number or a character to quit. ");

        double largest = scan.nextDouble();
        while( scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if (input > largest)
            {
                largest = input;
            }
        }
        return largest;
    }
    public static double findMin()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a series of number or a character to quit. ");
        
        double smallest = scan.nextDouble();
        while( scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if (input < smallest)
            {
                smallest = input;
            }
        }
        return smallest;
    }
}

