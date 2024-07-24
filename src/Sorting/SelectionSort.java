package Sorting;

import java.util.Arrays;

public class SelectionSort  {
    static int largest(int [] arr,int n)
    {
        int largest = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i <= n ; i++) {
            if (arr[i]>largest)
            {
                largest = arr[i];
                index = i;
            }
        }
        return index;
    }
    static void selectionSort(int[] arr)
    {
        for (int i = arr.length-1;i>=0;i--)
        {
            int largestEleIndex = largest(arr,i);
            int temp = arr[i];
            arr[i] = arr[largestEleIndex];
            arr[largestEleIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,6,7,8,6,9,4,2,1,23};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
