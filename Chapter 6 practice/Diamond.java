import java.util.Scanner;
public class Diamond
{
    public static void filledDiamond()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number: ");
        int number = scan.nextInt();
        int count = 0;
        int i = 1;
        while (count <= number)
        {
            while ( i <= number)
            {
              System.out.println("*");
              i += 1;
            }
            
            System.out.println("\n");
            count ++;
        }
        
    }
}