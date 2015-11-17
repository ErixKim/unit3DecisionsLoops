public class NestedLoop
{
    public static void NestedLoop()
    {
        for (int i = 1; i <= 2; i++)
        {
            for (int x = 1; x <= 4; x++)
            {
                System.out.println(i + " " + x);
            }
        }
    }
    public static void NestedWhileLoops()
    {
        int x = 1;
        int i = 1;
        while (i <= 2)
        {
            while (x <= 4)
            {
                System.out.println(i + " " + x);
                x++;
            }
            x = 1;
            i++;
            
        }
    }
    public static void NestedDoLoops()
    {
        int x = 1;
        int i = 1;
        do
        {
            do
            {
                System.out.println(i + " " + x);
                x++;
            }
            while(x <= 4);
            x = 1;
            i++;
        }
        while (i <= 2);

    }
}