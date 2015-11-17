import java.util.Scanner;
public class Practice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i += 2)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
