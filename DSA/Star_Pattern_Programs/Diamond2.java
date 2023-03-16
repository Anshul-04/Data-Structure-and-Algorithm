package Star_Pattern_Programs;
/* 
        12. DIAMOND WITH EQUAL NO OF STARS WRT ROWS
 
 */
public class Diamond2 {
    public static void main(String[] args) {
        int n =8;       
        diamond2(n);
    }

    public static void diamond2(int n) {
        upperPyramid2(n-1);
        downPyramid2(n);
    }

    public static void upperPyramid2(int n) {
        
        for(int i=0;i<n;i++){
            //printing spaces
            for(int  j=0;j < (n-i);j++){
                System.out.print(" ");
            }
            // printing star with one more extra spaces afterwards
            for(int j=0;j<=i;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void downPyramid2(int n) {
        
        for(int i=0;i<n;i++){
            //printing spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            // printing star with one more extra spaces afterwards
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}


/* 

=> In this the no of stars will be equal to the row number
   - at 1st row it has 1 star
   - 2nd row 2 stars
   - 3rd row 3 stars and so on.

   I will use Pyramid2 and DownPyramid2 in this and combine them to make the diamond.

1            *
2           * *
3          * * *
4         * * * *
5        * * * * *
6       * * * * * *
7      * * * * * * *   <--|______ till this it is upper Pyramid
8     * * * * * * * *
7      * * * * * * *
6       * * * * * *
5        * * * * *
4         * * * *
3          * * *
2           * *
1            *

*/