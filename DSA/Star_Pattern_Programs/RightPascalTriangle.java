package Star_Pattern_Programs;

/* 
      13. RIGHT PASCAL'S TRIANGLE

    ==> iT WILL BE THE COMBINATION OF RIGHT TRIANGE AND DOWN RIGHT TRIANGLE
    
 */

 public class RightPascalTriangle {
        public static void main(String[] args) {
            int n = 8;
            rightPascalTriangle(n);

        }
        
        public static void rightPascalTriangle(int n) {
            rightTriangle(n);
            rightDownTriangle(n);
        }

        public static void rightTriangle(int N ) {
            int n = N-1;

            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void rightDownTriangle(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


}


/* 

    1 2 3 4 5 6 7 8
1   *
2   * *
3   * * *
4   * * * *
5   * * * * *             ____ till this right triangle 
6   * * * * * *          | 
7   * * * * * * *     <---
8   * * * * * * * *   <---
7   * * * * * * *        |
6   * * * * * *          |_____ after this down right triangle
5   * * * * *
4   * * * *
3   * * *
2   * *
1   *


 */
