package Algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 7, 6, 5,23 ,4 ,1 ,10 ,121 ,44 };
        int n = arr.length;
 
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));
 
        quickSort(arr, 0, n-1);
        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));
    }

    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high){
            int pIdx = partition(arr,low,high);
            quickSort(arr,low,pIdx-1);
            quickSort(arr,pIdx+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i=low;
        int j= high;
        while(i<j){
            while(i<=high && arr[i]<=pivot ){
                i++; // Pointer i moves to the right until an element greater than the pivot is found, 
            }
            while(arr[j]>pivot){
                j--;  // pointer j moves to the left until an element less than or equal to the pivot is found.
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
        return j;
    } 
}


/*         

1) quickSort function is a recursive function that sorts an array using the QuickSort algorithm.
2) The function checks if low is less than high, if true then it finds a partition index (pIdx) using partition 
   function and calls quickSort on both sides of partition index recursively.
3) partition function selects a pivot element (in this case, the first element) and rearranges the array 
   such that all the elements smaller than pivot come before it and  all the larger elements come after it.
4) The function initializes two pointers i and j at low and high respectively.
5) The loop continues until i is less than j.
6) Pointer i moves to the right until an element greater than the pivot is found, 
7) pointer j moves to the left until an element less than or equal to the pivot is found.
8) If i is less than j, then the elements at i and j are swapped.
9) When the loop is complete, pivot element is swapped with the element at index j.
10) The function returns the partition index j.


TIME COMPLEXITY :--     O(nlogn) on average and best case,
                        O(n^2)  in the worst case.

 SPACE COMPLEXITY :--  O(logn) on average and best case, and
                        O(n)  in the worst case.
                        
==>  In the average case, QuickSort has a fast running time and uses less memory as compared to other sorting
     algorithms. However, the worst-case time complexity of QuickSort is O(n^2),
     which happens when the pivot element is always the minimum or maximum element of the array or 
     the array is already sorted in ascending or descending order. In such cases, 
     QuickSort performs very poorly and becomes very slow.

==>    To avoid the worst-case scenario, various optimization techniques are used such as 
       choosing the pivot element at random or choosing the median element as the pivot element. 
       These techniques can reduce the probability of worst-case scenarios and make QuickSort more efficient.


       */