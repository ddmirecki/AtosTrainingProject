package codeWars;

import java.math.BigDecimal;
import java.math.BigInteger;


public class NumberOfTrailingZeros {
    public static void main(String[] args) {
        BigInteger factorial = factorial(100);
        int zeros = zeros(1);
        System.out.println(zeros);
        System.out.println(factorial);
    }

    public static int zeros(int n) {
        BigInteger factorial = factorial(n);
        String s = factorial.toString();
        char[] chars = s.toCharArray();
        int counter = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i]=='0'){
                counter++;
            }else{
                break;
            }
        }

        return counter;
    }

    public static BigInteger factorial(int x) {
        BigInteger factorial = BigInteger.valueOf(1);
        if (x == 0 || x == 1) {
            return new BigInteger("1");
        } else  {
            for (int i = 2; i <= x; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));

            }

                return factorial;

        }


    }
}
