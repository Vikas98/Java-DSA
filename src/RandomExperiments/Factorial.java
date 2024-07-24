package RandomExperiments;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n = 1008;
        int fact=1;
        BigInteger bigInteger = new BigInteger(String.valueOf(fact));
        for (int i = n; i >= 1 ; i--) {
           bigInteger = bigInteger.multiply(BigInteger.valueOf(Long.parseLong(String.valueOf(i))));
        }
        System.out.println(bigInteger);
    }
}
