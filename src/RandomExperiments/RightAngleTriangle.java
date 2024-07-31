package RandomExperiments;

import java.util.Scanner;

public class RightAngleTriangle {

    public static void main(String[] args) {
        System.out.println("Enter the value of n (number of rows in a triangle):");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printPattern(n);
    }
    static void printPattern(int n)
    {
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

