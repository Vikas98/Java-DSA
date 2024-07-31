package RandomExperiments;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the value of n (number of rows in a pascal triangle):");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
    }
    static void printPattern(int n)
    {
        int[] prevRow={};
        int[] nextRow={1};
        int l = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(nextRow[j]+" ");
            }
            System.out.println();
            prevRow = nextRow;
            if(i+1<=n)
                nextRow = new int[i+1];
            else
                break;
            int m = 0;
            int m2 = 1;
            for (int j = 0; j < nextRow.length ; j++) {
                if(m2<prevRow.length && j>0)
                {
                    int value = prevRow[m]+prevRow[m2];
                    nextRow[j] = value;
                    m=m2;
                    m2++;
                }
                nextRow[0] = 1;
                nextRow[nextRow.length-1] = 1;
            }
        }
    }
}
