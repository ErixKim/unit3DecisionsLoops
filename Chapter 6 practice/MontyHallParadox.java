import java.util.Scanner;
import java.util.Random;
public class MontyHallParadox
{
    //Dumb code
    public static void MontyHall()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a door: ");
        int choice = scan.nextInt();
        Random rn = new Random();
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        while (counter <= 1000)
        {
            int cardoor = rn.nextInt(3) + 1;
            if (choice == cardoor)
            {
                counter1 += 1;
            }
            counter += 1;
        }
        System.out.println(counter1);
        counter = 0;
        while (counter <= 1000)
        {
            int goatdoor = rn.nextInt(3) + 1;
            int cardoor = rn.nextInt(3) + 1;
            while (cardoor == goatdoor)
            {
                cardoor = rn.nextInt(3) + 1;
            }
            if (goatdoor == 1 && choice == 2)
            {
                choice = 3;
                if (choice == cardoor)
                {
                    counter2 += 1;
                }
            }
            if (goatdoor == 1 && choice == 3)
            {
                choice = 2;
                if (choice == cardoor)
                {
                    counter2 += 1;
                }
            }
            if (goatdoor == 2 && choice == 1)
            {
                choice = 3;
                if (choice == cardoor)
                {
                    counter2 += 1;
                }
            }
            if (goatdoor == 2 && choice == 3)
            {
                choice = 1;
                if (choice == cardoor)
                {
                    counter2 += 1;
                }
            }
            if (goatdoor == 3 && choice == 1)
            {
                choice = 2;
                if (choice == cardoor)
                {
                    counter2 += 1;
                }
            }
            if (goatdoor == 3 && choice == 2)
            {
                choice = 1;
                if (choice == cardoor)
                {
                    counter2 += 1;
                }
            }
            counter += 1;
        }
        System.out.println(counter2);
    }
    //Smart code
    public static void main(String[] args)
    {
        int change = 0;
        int stay = 0;
        for (int i=0; i<1000; i++)
        {
            Random gen = new Random();
            int door = gen.nextInt(3);
            int chosen = gen.nextInt(3);
            if (door == chosen)
            {
                stay ++;
            }
            else
            {
                change++;
            }
        }
        System.out.println(stay + " " + change);
    }
}