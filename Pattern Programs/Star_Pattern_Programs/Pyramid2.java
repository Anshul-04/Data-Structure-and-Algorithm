package Star_Pattern_Programs;

/* 
       8. PYRAMID WITH EQUAL NO OF STAR WRT ROWS
 
 */

public class Pyramid2 {
    public static void main(String[] args) {
        int n = 5;
        pyramid2(n);
    }
    
    public static void pyramid2(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j=(n-i);j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* "); //extra space with star
            }
            System.out.println();
    }
}
}

/* 


=>  In This pattern No of star equals to the no of row.
=>  The code is similar to left Triangle but while printing star i have added one more 
     space with it


         1 2 3 4 5 
1            *
2           * *
3          * * *
4         * * * *
5        * * * * *


*/