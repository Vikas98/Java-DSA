package Arrays;
//Given an array arr[] of N integers, the task is to find all the pairs possible from the given array.
//        Note:
//
//
//        (arr[i], arr[i]) is also considered as a valid pair.
//        (arr[i], arr[j]) and (arr[j], arr[i]) are considered as two different pairs.
//
//Examples:
//
//
//Input: arr[] = {1, 2}
//Output: (1, 1), (1, 2), (2, 1), (2, 2).
//Input: arr[] = {1, 2, 3}
//Output: (1, 1), (1, 2), (1, 3), (2, 1), (2, 2), (2, 3), (3, 1), (3, 2), (3, 3)
public class PairInArray {
    static void pairs(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2};
        pairs(arr);

    }
}
//time complexity O(n^2), space complexity O(1)