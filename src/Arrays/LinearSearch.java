package Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr ,int target)
    {
        for (int i = 0; i < arr.length; i++) {// search value index by index
            if (arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,6,48,3,1,7,9};
        int target = 85;
        //System.out.println("Index at which the target value is present " +linearSearch(arr,target));
        if (linearSearch(arr,target)==-1)
        {
            System.out.println("Target value does not exits in given array");
        }
        else
        {
            System.out.println("Index at which the target value is present " +linearSearch(arr,target));
        }
    }
}
//time complexity is O(n)
//space complexity O(1)
