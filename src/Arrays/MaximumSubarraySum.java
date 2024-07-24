package Arrays;

public class MaximumSubarraySum {
    static int maximumSubarraySum(int [] arr)// using prefix subarray sum
    {
        int [] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = arr[i]+prefixSum[i-1];
        }
        int currSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(i==0)
                    currSum = prefixSum[j];
                else
                {
                    currSum = prefixSum[j]-prefixSum[i-1];
                }
                if (currSum>maxSum)
                    maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] arr = {2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maximumSubarraySum(arr));
        System.out.println(kadaneAlgo(arr));
    }
    static int kadaneAlgo(int [] arr)
    {
        int currSum = Integer.MAX_VALUE;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum+arr[i];
            if (currSum>maxSum)
                 maxSum =currSum;
            if (currSum<0)
                currSum = 0;
        }
        return maxSum;
    }
}
//time complexity O(n^2) , space complexity O(n)
// approach 1 using prefix sum subarray
// approach 2 find all subarray and also find their sum O(n^3) space complexity O(1)
// approach 3 kadane's algorithm O(n) space complexity O(1)