package Threading;

import java.util.Arrays;
import java.util.List;

public class FactorialWithoutThreading {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        list.stream().map(item->factorial(item)).forEach(item -> System.out.println(item));
    }

    private static int factorial(int item) {
        int output = 1;
        for (int i = 2; i <=item ; i++) {
            output *= i;
        }
        return output;
    }
}
