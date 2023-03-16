package Star_Pattern_Programs;


/* 
      14. LEFT PASCAL'S TRIANGLE

    ==> IT WILL BE THE COMBINATION OF LEFT TRIANGE AND DOWN LEFT TRIANGLE
    
 */

public class LeftPascalTriangle {
    public static void main(String[] args) {
        int n = 8;
        leftPascalTriangle(n);

    }
    
    public static void leftPascalTriangle(int n) {
        leftTriangle(n);
        leftDownTriangle(n);
    }

    public static void leftTriangle(int N ) {
        int n = N-1;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  "); // two spaces
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftDownTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  "); // two spaces
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* 

      1 2 3 4 5 6 7 8 

1                   *
2                 * *
3               * * *
4             * * * *
5           * * * * *           ____ till this left triangle 
6         * * * * * *          |
7       * * * * * * *   <-------
8     * * * * * * * *   <--------
7       * * * * * * *           |
6         * * * * * *           |_____ after this down left triangle    
5           * * * * *
4             * * * *
3               * * *
2                 * *
1                   *

*/              