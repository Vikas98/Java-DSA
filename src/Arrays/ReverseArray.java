package Arrays;

public class ReverseArray {
    static void reverse(int [] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,5,6,8,5,6,1,30,9};
        System.out.println("array before reverse" );
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        reverse(arr);
        System.out.println("\narray after reverse ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
/* time complexity O(N/2) ,space complexity O(1)*/