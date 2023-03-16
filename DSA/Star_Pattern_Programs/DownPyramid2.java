package Star_Pattern_Programs;
/* 
        10. DOWN PYRAMID WITH EQUAL NO OF STARS WRT ROWS 
 
 */
public class DownPyramid2 {
    public static void main(String[] args) {
        int n = 8;
        downPyramid2(n);
    }

    public static void downPyramid2(int n) {
        
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(n-i);j++){
                System.out.print("* "); //extra space with star
            }
            System.out.println();
        }
    }
}


/*     

=> In This pattern No of star equals to the no of row.
=> The code is Similar to Left Down Triangle ,In this i just add one more space 
   while printing the star

     1 2 3 4 5 6 7 8 
     | | | | | | | |     
1    * * * * * * * *
2     * * * * * * *
3      * * * * * *
4       * * * * *
5        * * * *
6         * * *
7          * *
8           *


 */