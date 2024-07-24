package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int [] arr)
    {
        for (int i = 1; i <= arr.length-1 ; i++) {
            int ele = arr[i];
            int j = i;
            while (arr[j-1]>ele && j>=1)
            {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = ele;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,4,8,5,2,1,3,5,4,6,48,9};

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
