package Sorting;

import java.util.Arrays;

public class OptimizedBubbleSort {
    static void bubbleSort(int[] arr)
    {
        boolean flag;
        for (int pass = arr.length-1;pass>=0;pass--)
        {
            flag = false;
            for (int i = 0; i <=pass-1 ; i++) {
                if (arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }
            if (flag==false)
                break;
        }
    }
  public static void main(String[]args)
    {
        int [] arr = {1, 1, 2, 3, 4, 4, 6, 6, 6, 7, 9, 65};
        long startTime = System.currentTimeMillis();
        bubbleSort(arr);
        long endTime = System.currentTimeMillis();

        long totaltime = endTime-startTime;

        System.out.println(Arrays.toString(arr));
        System.out.println("total time taken by the program "+totaltime);
    }
}
