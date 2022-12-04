import java.security.KeyPair;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class DivideTwoIntegers {
    public static void main(String[] args) {

        int dividend = -2147483648, divisor = -2, trueAnsw = 3;
//        Explanation: 10/3 = 3.33333.. which is truncated to 3.

        System.out.println(divideTwoIntegers(dividend,divisor));

    }

    public static int divideTwoIntegers (int dividend, int divisor){
        boolean isNegative = false;
        if (dividend == -2147483648) {
            dividend = 2147483647;
            isNegative = !isNegative;
        }
        if (divisor == -2147483648) {
            divisor = 2147483647;
            isNegative = !isNegative;
        }
        if (dividend<0){
            dividend = 0-dividend;
            isNegative = !isNegative;
        }
        if (divisor<0){
            divisor = 0-divisor;
            isNegative = !isNegative;
        }

        int summOfDivisor = divisor;
        int counter = 0;


//        while (summOfDivisor<=dividend){
//            counter++;
//            summOfDivisor += divisor;
//        }

        int r = 0, co = 0;





        if (isNegative){
            counter = 0-counter;
        }
        return counter;
    }

    private static Pair doTwice (int integ, int howManyIntsAreInInteg){
        Pair p = new Pair((integ+integ),(howManyIntsAreInInteg+howManyIntsAreInInteg));
        return p;
    }

    private static class Pair
    {
        int a, b;
        public Pair (int a, int b){
            a=a;
            b=b;
        }

    }


}