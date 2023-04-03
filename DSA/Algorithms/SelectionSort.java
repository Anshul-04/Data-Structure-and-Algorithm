package Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 7, 6, 5,23 ,4 ,1 ,10 ,121 ,44 };
        int n = arr.length;
 
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));
 
        selectionSort(arr);
        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        int n = arr.length;

        for(int i=0;i<n;i++){
            int min_Index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_Index]){
                    min_Index = j;
                }
            }
            if(min_Index!=i){
                int temp = arr[i];
                arr[i] = arr[min_Index];
                arr[min_Index] = temp;
            }

        }
    }
}

/*  

--Complexity Analysis of Selection Sort:

 TIME COMPLEXITY :  O(N2) as there are two nested loops:

    One loop to select an element of Array one by one = O(N)
    Another loop to compare that element with every other Array element = O(N)
    Therefore overall complexity = O(N) * O(N) = O(N*N) = O(N2)

AUXILARY SPACE:-    O(1) as the only extra memory used is for temporary variables while swapping two values 
                    in Array. The selection sort never makes more than O(N) swaps and can be useful 
                    when the memory write is a costly operation. 
 */