import java.util.Scanner;

public class Substrings
{
   public static void sortedString()
   {
       Scanner scan = new Scanner(System. in);
       System.out.println("Input a word of any length: ");
       String input = scan.next();
       int length = input.length();
       int count = 1;
       while( count <= length)
       {
           int num = 0;
           while(num <= length && num + count <= length)
           {
               System.out.println(input.substring(num, count + num));
               num++;
            }
           count++; 
        }
    }
}
