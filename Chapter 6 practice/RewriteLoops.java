import java.util.Scanner;
public class RewriteLoops
{
    public static void rewrite1()
    {
        int s = 0;
        int i = 1;
        while (i <= 10)
        {
            s = s + i;
            i++;
        }
    }

    public static void rewrite2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        double x = 0;
        double s = 1;
        while (s > 0.01)
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
    }
}