import java.util.Scanner;
public class Electromagnetic 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Give a wavelength value");
        double wavelength = s.nextDouble();
        if (wavelength > Math.pow(10,-1))
        {
            System.out.println("It is a radio wave");
        }
        else if (wavelength > Math.pow(10,-3) && wavelength < Math.pow(10,-1))
        {
            System.out.println("It is a microwave");
        }
        else if (wavelength > Math.pow(10 , -7) * 7 && wavelength < Math.pow(10,-3))
        {
            System.out.println("It is infrared");
        }
        else if (wavelength > Math.pow(10,-7) * 4 &&  wavelength < Math.pow(10,-7) * 7)
        {
            System.out.println("It is visible light");
        }
        else if (wavelength > Math.pow(10,-8) && wavelength < Math.pow (10,-7) * 4)
        {
            System.out.println("It is ultraviolet");
        }
        else if (wavelength > Math.pow(10,-11) && wavelength < Math.pow(10,-8))
        {
            System.out.println("It is X-rays");
        }
        else if (wavelength < Math.pow(10,-11))
        {
            System.out.println("It is gamma rays");
        }
        
    }
}