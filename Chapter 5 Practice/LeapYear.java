import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = s.nextInt();
        boolean leapyear = false;
        String end = "no it is not";
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) 
        {
            leapyear = true;
            end = "yes it is";
        }
        System.out.printf("Is "+year+" a leap year: "+ end);
    }
}