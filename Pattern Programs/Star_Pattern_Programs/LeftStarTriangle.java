package Star_Pattern_Programs;

public class LeftStarTriangle {

    public static void leftStar(int n) {

        int noOfSpaces = n-1;
        int noOfStar = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=noOfSpaces;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=noOfStar;j++){
                System.out.print("*");
            }
            System.out.println();
            noOfSpaces-=1;
            noOfStar +=1;

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

 */
/* 
   1 2 3 4 5 6 7 8 9
1 
2 
3 
4 
5 
6 
7 
8 
9

*/