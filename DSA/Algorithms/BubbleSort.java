package Algorithms;

import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){
      int arr[] = {8,15,7,2,5,11};
      bubbleSort(arr);
    
    }

    public static void bubbleSort(int []arr){
        int n =arr.length;

        for(int i=0;i<n-1;i++){
            System.out.println("For i = "+i);
            System.out.println("----------------------------------");
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("j = "+j+"  arr = "+Arrays.toString(arr));               
            }
            System.out.println();
        }
    }
}

/*


For i = 0
----------------------------------
j = 0  arr = [8, 15, 7, 2, 5, 11]
j = 1  arr = [8, 7, 15, 2, 5, 11]
j = 2  arr = [8, 7, 2, 15, 5, 11]
j = 3  arr = [8, 7, 2, 5, 15, 11]
j = 4  arr = [8, 7, 2, 5, 11, 15]

For i = 1
----------------------------------
j = 0  arr = [7, 8, 2, 5, 11, 15]
j = 1  arr = [7, 2, 8, 5, 11, 15]
j = 2  arr = [7, 2, 5, 8, 11, 15]
j = 3  arr = [7, 2, 5, 8, 11, 15]

For i = 2
----------------------------------
j = 0  arr = [2, 7, 5, 8, 11, 15]
j = 1  arr = [2, 5, 7, 8, 11, 15]
j = 2  arr = [2, 5, 7, 8, 11, 15]

For i = 3
----------------------------------
j = 0  arr = [2, 5, 7, 8, 11, 15]
j = 1  arr = [2, 5, 7, 8, 11, 15]

For i = 4
----------------------------------
j = 0  arr = [2, 5, 7, 8, 11, 15]

 */