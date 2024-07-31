package RandomExperiments;

import java.util.Scanner;

public class RightAngleTrianglePattern2 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n (number of rows in a triangle):");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }
    static void printPattern(int n)
    {
//        int k=0;
//        for (int i = n; i>0 ; i--) {
//            for (int j = 0; j < n-k; j++) {
//                System.out.print(" ");
//            }
//            for (int j = i; j <= n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            k++;
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

