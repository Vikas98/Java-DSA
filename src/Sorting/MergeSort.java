package Sorting;

import java.util.Arrays;

public class MergeSort {
    static void mergeSort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int mid = start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
           merge(arr,start,mid,end);
        }
    }
    static void merge(int[]arr,int start,int mid,int end)
    {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1 ; i++) {
            leftArray[i] = arr[start+i];
        }
        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = start;
        while (i<n1 && j<n2)
        {
            if (leftArray[i]<=rightArray[j])
            {
                arr[k++] = leftArray[i++];
            }
            else
            {
                arr[k++]=rightArray[j++];
            }
        }
        while (i<n1)
        {
            arr[k++] = leftArray[i++];
        }
        while (j<n2)
        {
            arr[k++]=rightArray[j++];
        }
    }
    public static void main(String[] args) {
        int [] arr ={1,5,4,7,8,9,2,0,3,15};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
