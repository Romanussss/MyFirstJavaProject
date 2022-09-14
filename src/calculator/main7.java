package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main7 {


    public float getfloat(){
        Scanner scan = new Scanner(System.in);
        float x;
        do{
            try{
                System.out.println("Enter a number");
                x = scan.nextFloat();
                return x;
            }catch (InputMismatchException e ){
                System.err.println("Give value"+ scan.nextLine() +"is not valid. Please enter a numeric value." );
            }
        } while(true);
    }









}
