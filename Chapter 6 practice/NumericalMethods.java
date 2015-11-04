import java.util.Scanner;
public class NumericalMethods
{
    public static void Fibonacci()
    {
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        int fn = scan.nextInt();
        int count = 0;
        while (count <= fn)
        {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
            count++;
        }
        System.out.println(fold2);
    }
}