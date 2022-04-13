package calculator;

public class Calculator {




    public  int substract (int Firstnumber, int Secondnumber) {
        int result = Firstnumber - Secondnumber;
        return result;

    }

    public int Multiply (int firstnumber, int secondnumber){

        int result = firstnumber * secondnumber;
        return result;

    }

    public double Divide(double firstnumber, double secondnumber) {
        double result2 = firstnumber / secondnumber;
        return result2;

    }

    public double Modulus ( double firstnumber, double secondnumber) {
        double result2 = firstnumber% secondnumber;
        return result2;


    }

    public int Average(int firstnumber, int secondnumber, int thirdnumber) {
        int result = (firstnumber + secondnumber + thirdnumber)/ 3;
        return result;

    }

    public double FarenheitConversion( double Farenheit ) {
        double result2 = ( Farenheit-32) * 5/9;
        return result2;


    }

    public double InchToMeters(double Inch ) {
        double result2 = Inch * 0.0254;
        return result2;

    }

    public double Speed(double Meters, double Hours, double Minutes,double  Seconds) {
        double result2 = Meters / Seconds;
        System.out.println(result2 + "M/S");
        double result3 = result2 * 18 / 5;
        System.out.println(result3 + "K/H");
        double result4 = result3 * 0.00044704;
        System.out.println(result4 + "M/H");
        return result2;


    }

    public int sum(int firstnumber, int secondnumber) {

        int result = firstnumber + secondnumber;
        return result;
    }
}












