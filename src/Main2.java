import java.util.jar.JarEntry;

public class Main2 {
    public static void main(String[] args) {
        int result = substract(5,4);
        System.out.println("Rezultatul este" + result);

        result = Multiply( 10,8);
        System.out.println ("Rezultatul este" + result);

        double result2 = Divide(9,3);
        System.out.println("Rezultatul este" + result2);

        result2 = Modulus(25,3);
        System.out.println("Rezultatul este" + result2);

        result = Average(8,5,10);
        System.out.println("Rezultatul este"+result);

        result2 =  FarenheitConversion(50);
        System.out.println("Rezultatul este" + result2+ "C");

        result2 =  InchToMeters(150);
        System.out.println("Rezultatul este" + result2+ "M");

        Speed(500,1,60,3600);








    }


    public static int substract (int Firstnumber, int Secondnumber) {
        int result = Firstnumber - Secondnumber;
        return result;

    }

    public static int Multiply (int firstnumber, int secondnumber){

        int result = firstnumber * secondnumber;
        return result;

    }

    public static double Divide(double firstnumber, double secondnumber) {
        double result2 = firstnumber / secondnumber;
        return result2;

    }

    public static double Modulus ( double firstnumber, double secondnumber) {
       double result2 = firstnumber% secondnumber;
        return result2;


    }

    public static int Average(int firstnumber, int secondnumber, int thirdnumber) {
        int result = (firstnumber + secondnumber + thirdnumber)/ 3;
        return result;

    }

    public static double FarenheitConversion( double Farenheit ) {
        double result2 = ( Farenheit-32) * 5/9;
        return result2;


    }

    public static double InchToMeters(double Inch ) {
        double result2 = Inch * 0.0254;
        return result2;

    }

    public static double Speed(double Meters, double Hours, double Minutes,double  Seconds) {
        double result2 = Meters / Seconds;
        System.out.println(result2 + "M/S");
        double result3 = result2 * 18 / 5;
        System.out.println(result3 + "K/H");
        double result4 = result3 * 0.00044704;
        System.out.println(result4 + "M/H");
        return result2;


    }






}
