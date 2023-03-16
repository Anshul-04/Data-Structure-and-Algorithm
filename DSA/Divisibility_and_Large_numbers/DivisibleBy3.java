package Divisibility_and_Large_numbers;

import java.util.*;

/*    Check if a large number is divisible by 3 or not
*/

public class DivisibleBy3 {
    public static void main(String[] args) {

        String s = "789651";
        if (isDivisible(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean isDivisible(String  s){
        int digitSum =0;
        for(int i=0;i<s.length();i++){
            digitSum += s.charAt(i)-'0';  // s.charAt(i)-'0' ,tis convert Character into Integer
        }
        return (digitSum %3 ==0);
    }
}


/*

==> A number is divisible by 3 if sum of its digits is divisible by 3.

For example n = 1332
Sum of digits = 1 + 3 + 3 + 2
             = 9
Since sum is divisible by 3,
answer is Yes.

 */