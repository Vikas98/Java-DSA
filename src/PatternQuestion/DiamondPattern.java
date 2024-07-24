package PatternQuestion;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        System.out.println("Enter the value of n ");// how much big diamond you wants
        int n ;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
//        for above part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for down part of a diamond
        for (int i = n-1; i >= 1; i--) {
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
