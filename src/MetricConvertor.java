import java.util.Scanner;
import java.lang.Math;

public class MetricConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double measureMile = 0;
        double measureFeet = 0;
        double measureInch = 0;
        double measureMeter = 0;
        final double mathMile = 0.00062137;
        final double mathFeet = 3.28084;
        final double mathInch = 39.37008;


        boolean valid = true;

        //DO WHILE FOR CHECKING METERS

        do {
            System.out.println("Please enter a value for meters below. \n(Cannot be negative or a letter)");

            if (scan.hasNextDouble()){
                measureMeter = scan.nextDouble();

                //Buffer
                scan.nextLine();

                if (measureMeter > 0){
                    valid = false;
                } else {
                    System.out.println("Your math ain't mathin'.\nThat is a zero or a negative.");
                }

            } else {
                scan.nextLine();
                System.out.println("Jesus, come on man that is a letter.");
            }
        } while (valid);

        measureMile = measureMeter * mathMile;
        measureFeet = measureMeter * mathFeet;
        measureInch = measureMeter * mathInch;

        System.out.printf("Meters : %5.2f", measureMeter);
        System.out.printf("\nMiles : %5.2f", measureMile);
        System.out.printf("\nFeet : %7.2f", measureFeet);
        System.out.printf("\nInches : %5.2f", measureInch);

    }
}