public class NestedLoops
{
    public static void numberOutput()
    {
        int x = 1;
        for (int i = 1;
        i <= 2;
        i++)
        {
            for (x = 1;
            x <= 4;
            x ++)
            {
                System.out.println(i + " " + x);
            }
        }

    }

    public static void numberOutputWhile()
    {
        int x = 1;
        int i = 1;
        while (i <= 2)
        {
            while(x <= 4)
            {
                System.out.println(i + " " + x);
                x++;
            }
            x = 1;
            i++;
        }
    }

    public static void numberOutputDoLoop()
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