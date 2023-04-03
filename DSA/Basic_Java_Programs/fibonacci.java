package Basic_Java_Programs;

import java.util.Scanner;

/*

    Fibonacci series in Java

    In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
    The first two numbers of fibonacci series are 0 and 1
 */

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }

    public  static void fibonacci(int n){
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2);

        for(int i=2;i<n;i++){
           n3 = n1+n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
