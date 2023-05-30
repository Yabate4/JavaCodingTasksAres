package week_1;

public class FinRa {

    public static void main(String[] args) {

        System.out.println(FinRa(17));
    }

    public static int FinRa(int number) {

        if (number >= 1 || number <= 30) {
            if (number % 3 == 0) {
                System.out.println("FIN");
            }if (number % 5 == 0) {
                System.out.println("RA");
            } if(number % 3 != 0 && number % 5 != 0){
                System.out.println("FINRA");
            }

        }
          return number;
    }
    }
    /*
    Numbers -- FINRA
        => Write a method that prints out the numbers from 1 to 30 but;
            - for numbers which are multiple of 3 print "FIN" instead of the number,
            - for numbers which are multiple of 5, print "RA" instead of the number,
            - and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.
     */