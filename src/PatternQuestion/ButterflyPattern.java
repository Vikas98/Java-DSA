package PatternQuestion;

import java.util.Scanner;

public class ButterflyPattern {
   public static void main(String[] args)
    {
        System.out.println("Enter the value of n ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {// denotes the number of star to be printed
            for (int j = 0; j < i; j++) {//prints the left side stars
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i) ; j++) {// prints the number of spaces
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {//print the right side stars
                System.out.print("*");
            }
            System.out.println();
        }// the whole above code prints the upper part of the butterfly for down part
        // we just reverse the first loop only
        for (int i = n; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
