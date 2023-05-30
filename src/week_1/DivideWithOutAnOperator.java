package week_1;

public class DivideWithOutAnOperator {

    public static int divide(int num1, int num2) {
        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }

        return result;

    }
    /*
    Numbers -- Divide without / operator
            => Write a method that can divide two numbers without using division operator.
     */





}




