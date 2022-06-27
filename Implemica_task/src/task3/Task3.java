package task3;

import java.math.BigInteger;

public class Task3 {
    public static BigInteger factorial(int max){
        //amount of received items
        BigInteger sum = BigInteger.valueOf(0);
        //result
        BigInteger result = BigInteger.valueOf(1);

        for(long i = 1; i<=max; i++){
            result  = result.multiply(BigInteger.valueOf(i));
        }

        while (!result.equals(0)) {
            sum = sum.add(result.mod(BigInteger.valueOf(10)));
            result = result.divide(BigInteger.valueOf(10));
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        factorial(100);  //number for factorial
    }
}