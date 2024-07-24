package Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            int mid = start+(end-start)/2;
            if (arr[mid] == target)
            {
                return mid;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,8,9,10,15,20};// for binary search the array should be in sorted ordered
        int target = 5;
        if (binarySearch(arr,target)==-1)
        {
            System.out.println("Target value does not exits in given array");
        }
        else
        {
            System.out.println("Index at which the target value is present " +binarySearch(arr,target));
        }
    }
}
// time complexity O(log n)
// space complexity O(1)
