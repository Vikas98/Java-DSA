package Mathmatics;
/*Given  two integers N and M. The problem is to find the number
 closest to N and divisible by M. If there are more than one such number,
 then output the one having maximum absolute value.
Example 1:

Input:
N = 13 , M = 4
Output:
12
Explanation:
12 is the Closest Number to
13 which is divisible by 4.*/
public class ClosestNumber {
    static int closestNumber(int N , int M) {
        // code here
        // Calculate the closest multiple of M
        int closestMultiple = Math.round((float) N / M) * M;

        // In case of a tie, choose the one with the maximum absolute value
        int lowerMultiple = closestMultiple - M;
        int higherMultiple = closestMultiple + M;

        int lowerDiff = Math.abs(N - lowerMultiple);
        int closestDiff = Math.abs(N - closestMultiple);
        int higherDiff = Math.abs(N - higherMultiple);

        if (closestDiff < lowerDiff && closestDiff < higherDiff) {
            return closestMultiple;
        } else if (lowerDiff == closestDiff && lowerDiff <= higherDiff) {
            return Math.abs(lowerMultiple) > Math.abs(closestMultiple) ? lowerMultiple : closestMultiple;
        } else if (higherDiff == closestDiff && higherDiff <= lowerDiff) {
            return Math.abs(higherMultiple) > Math.abs(closestMultiple) ? higherMultiple : closestMultiple;
        } else if (lowerDiff < higherDiff) {
            return lowerMultiple;
        } else {
            return higherMultiple;
        }
    }
    public static void main(String[] args) {
        System.out.println(closestNumber(2,3));
    }
}
