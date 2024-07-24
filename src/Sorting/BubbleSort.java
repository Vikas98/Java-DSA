package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int arr[])
    {
        for (int pass = arr.length-1;pass>=0;pass--)
        {
            for (int i = 0; i <= pass-1 ; i++) {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,5,4,7,8,9,2,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
