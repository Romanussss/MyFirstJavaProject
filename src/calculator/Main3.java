package calculator;

public class Main3 {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        LogicalOP op = new LogicalOP();


        System.out.println(op.checkBiggerNumber(12, 41));
        System.out.println(op.verifyTextFastTrack("FastTrack"));

        String text = "FastTrack";
        int number = 2;
//

        System.out.println(calc.sum(5, 1));
        System.out.println(calc.substract(5, 4));


        System.out.println(op.verifyTextAndNumber(text, number));

        System.out.println(op.weather(20));
        System.out.println(op.ex7(3));
        System.out.println(op.isNumberEven(5));
        System.out.println(op.GetBigger(2, 2, 2));
        op.to100(105);
        op.toMinus100(-105);
        op.ex3(12, 20);
        op.ex4(5, 10);
        op.to100_forEven(2);
        op.to100_forOdd(args);
        op.addTo_100(1);
        System.out.println(op.addTo_100(1));
        System.out.println(op.addTo_100_average(5));
        op.toMinus100_while(5);
        op.from_a_to_b_while(5, 2);
        op.from_low_to_high_while(30, 20);
        op.to_100_even_while(2);
        op.to_100_odd_while(3);
        System.out.println(op.while_sum(111, 8899));


    }


}





