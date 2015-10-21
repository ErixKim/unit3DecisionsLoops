import java.util.Scanner;
/**
 * Write a description of class CircleOverlap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */public class CircleOverlap
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the radius of the first circle: ");
        double radius1 = in.nextDouble(); 
        double xcenter1 = 0;
        double ycenter1 = 0;
        System.out.print("Input the radius of the second circle: ");
        double radius2 = in.nextDouble(); 
        double xcenter2 = 40;
        double ycenter2 = 0;

        double dist = 40;

        if(radius1 + radius2 < dist)
        {
            System.out.println("The two circles are disjointed");
        }
        else if(radius1 > radius2 + dist)
        {
            System.out.println("The two circles are mutually contained");
        }
        else if(radius2 > radius1 + dist)
        {
            System.out.println("The two circles are mutually contained");
        }
        else if(radius1 + radius2 > dist)
        {
            System.out.println("The two circles are overlapping");
        }

    }
}
