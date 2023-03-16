package Star_Pattern_Programs;

/* 
        1. RIGHT TRIANGLE 
 
 */

public class RightTriangleStar{

    public static void rightStar(int n) {
        //outer loop for no of rows
        for(int i=0;i<n;i++){
            // inner loop runs till the index of outer loop
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n=5;
        rightStar(n);
    }

   
}

/*



   1 2 3 4 5 
1  *
2  * *
3  * * *
4  * * * *
5  * * * * *


 */