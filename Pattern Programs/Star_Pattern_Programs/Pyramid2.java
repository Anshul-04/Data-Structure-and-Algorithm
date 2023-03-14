package Star_Pattern_Programs;

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
                System.out.print("* ");
            }
            System.out.println();
    }
}
}

/* 

         1 2 3 4 5 
1            *
2           * *
3          * * *
4         * * * *
5        * * * * *

In this pattern No of star equals to the no of row.

*/