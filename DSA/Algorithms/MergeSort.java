package Algorithms;
import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 7, 6, 5,23 ,4 ,1 ,10 ,121 ,44 };
        int n = arr.length;
 
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));
 
        mergeSort(arr, 4, 9);
        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));
    }

    //Mergesort

    public static void mergeSort(int[] arr,int l,int r) {
       if(l<r){
           int mid = l +(r-l)/2;
           mergeSort(arr,l,mid);
           mergeSort(arr,mid+1,r);
           merge(arr,l,mid,r);
       }
    }

    public static void merge(int[] arr,int l,int m,int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
/*       

Time Complexity: 
                 O(N log(N)),  Sorting arrays on different machines. Merge Sort is a recursive algorithm
                 and time complexity can be expressed as following recurrence relation. 

                    T(n) = 2T(n/2) + θ(n)
 */