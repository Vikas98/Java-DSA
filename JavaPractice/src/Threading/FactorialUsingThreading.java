package Threading;

import java.util.Arrays;
import java.util.List;

public class FactorialUsingThreading {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        list.stream().forEach(item->{
//            Factorial runnable = new Factorial(item);
//            Thread thread = new Thread(runnable);
//            thread.start();
//        });
        list.stream().forEach(item->
        {
            Thread thread = new Factorial2(item);
            thread.start();
        });
    }
}
