package PatternQuestion;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the value of n ");// how much big triangle you wants
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
