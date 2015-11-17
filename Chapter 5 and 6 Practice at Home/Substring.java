import java.util.Scanner;
public class Substring
{
    public static void Substring()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the word: ");
        String word = scan.next();
        int length = word.length();
        int count = 1;
        
        while (count <= length)
        {
            int num = 0;
            while (num <= length && num + count <= length)
            {
                System.out.println(word.substring(num,count +num));
                num ++;
            }
            count ++;
        }
    }
}