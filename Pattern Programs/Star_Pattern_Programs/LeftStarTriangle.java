package Star_Pattern_Programs;
/* 
        2. LEFT TRIANGLE 
 
 */

public class LeftStarTriangle {

    public static void leftStar(int n) {

        // int noOfSpaces = n-1;
        // int noOfStar = 1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=noOfSpaces;j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=1;j<=noOfStar;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     noOfSpaces-=1;
        //     noOfStar +=1;

        // }

        for(int i=1;i<=n;i++){
            // for space (n-i)
	        for(int j=(n-i);j>0;j--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print("*");
	        }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n=5;
        leftStar(n);
    }
}

/*
 
     1 2 3 4 5     
 1           * 
 2         * * 
 3       * * * 
 4     * * * * 
 5   * * * * *

 ==> As there are 4 space and 1 star in 1st row, then 3 spaces and 2 star in 2nd row ...
      0 spaces and 5 star in 5th row.

      so the no of spaces is (total no of rows - current row )
      in inner for loop for(int j= (n-i);j>0;j--)
 */

