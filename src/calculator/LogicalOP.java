package calculator;

public class LogicalOP {


    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyTextFastTrack(String text) {
        if (text.equals("FastTrack")) {
            return "learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrack") && number >= 4) {
            return number + text;
        } else {
            return "";
        }
    }

    public String weather(int number) {
        if (number >= 8 || number == 6) {
            return "The amount of snow this winter was(cm) " + number;
        } else {
            return "The forecast snow is " + number;
        }


    }


    public String ex7(int number) {
        if (number > 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        } else return "";


    }


    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else return false;

    }


    public boolean eligibleToVote(int number) {
        if (number >= 18) {
            return true;
        } else return false;
    }


    public int GetBigger(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else return c;

    }

    //1
    public void to100(int a) {
        if (a < 100) {

            for (int i = a; i <= 100; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= 100; i--) {
                System.out.println(i);
            }
        }
    }

    //2
    public void toMinus100(int a) {
        if (a < -100) {

            for (int i = a; i <= -100; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i >= -100; i--) {
                System.out.println(i);
            }
        }
    }

    //3
    public void ex3(int a, int b) {
        if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i++)
                System.out.println(i);
        }
    }

    //4
    public void ex4(int a, int b) {
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a; i <= b; i++)
                System.out.println(i);
        }
    }


    public void to100_forEven(int a) {
        if (a % 2 == 0) {
            for (int i = 2; i <= 100; i += 2) {
                System.out.println(i);
            }
        }
    }


    public void to100_forOdd(String args[]) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }


        }

    }

    public int addTo_100(int nr) {
        int suma = 0;
        if (nr < 100) {
            for (int i = nr; i <= 100; i++) {
                suma += i;
            }
        }
        return suma;


    }


    public int addTo_100_average(int nr) {
        int suma = 0;
        if (nr < 100) {
            for (int i = nr; i <= 100; i++) {
                suma += i;
            }
        } else for (int i = nr; i >= 100; i--) {
            suma += i;
        }
        return suma / (100 - nr);


    }

    public void to100_while(int a) {
        if (a < 100) {

            while (a <= 100) {
                System.out.println(a);
                a++;
            }
        } else {
            while (a >= 100) {
                System.out.println(a);
                a--;
            }

        }
    }


    public void toMinus100_while(int a) {
        if (a < -100) {
            while (a <= -100) {
                System.out.println(a);
                a++;
            }
        } else {
            while (a >= -100) {
                System.out.println(a);
                a--;
            }
        }
    }

    public void from_a_to_b_while(int a, int b) {
        if (a < b) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else {
            while (a >= b) {
                System.out.println(a);
                a--;
            }

        }

    }

    public void from_low_to_high_while(int a, int b) {
        if (a < b) {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        } else {
            while (a >= b) {
                System.out.println(b);
                b++;
            }
        }
    }


    public void to_100_even_while(int a) {
        if (a % 2 == 0) {
            while (a <= 100) {
                System.out.println(a);
                a += 2;
            }
        }
    }

    public void to_100_odd_while(int i){
          i = 1;
        while (i<=100){
            System.out.println(i);
            i= i+2;
        }
    }



}

