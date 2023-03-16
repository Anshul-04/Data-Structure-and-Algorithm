package Divisibility_and_Large_numbers;

public class DivisibleBy4 {
    public static void main(String[] args) {

        String s = "64652";
        if (isDivisible(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isDivisible(String s) {
        int n = s.length();
        //  base case
        if (n == 0) {
            return false;
        }
        // Integer.parseInt(string_variable) is used in Java
        // to convert string to integer
        if (n == 1) {
            return ((Integer.parseInt(s)) % 4 == 0);
        }

        int lastDigit = s.charAt(n - 1) - '0';
        int secondLastDigit = s.charAt(n - 2) - '0';

        int lastTwoDigitNum = secondLastDigit*10 + lastDigit ;
        return  lastTwoDigitNum % 4 ==0 ;
    }
 // BY SUBSTRING METHOD
    static boolean SubStringMethod(String str)
    {
        // Get the length of the string
        int n = str.length();

        // Empty string
        if (n == 0)
            return false;
        // Integer.parseInt(string_variable) is used in Java
        // to convert string to integer

        // If there is single digit
        if (n == 1)
            return ((Integer.parseInt(str)) % 4 == 0);

        // getting last two characters using substring
        str = str.substring(n - 2);
        // If number formed by last two digits is
        // divisible by 4.
        return ((Integer.parseInt(str)) % 4 == 0);
    }
}

/*

==> A number is divisible by 4 if number formed by last two digits of it is divisible by 4.

How does this work?

Let us consider 76952, we can write it as
76942 = 7*10000 + 6*1000 + 9*100 + 5*10 + 2

The proof is based on below observation:
Remainder of 10i divided by 4 is 0 if i greater
than or equal to two. Note than 100, 1000,
... etc lead to remainder 0 when divided by 4.

So remainder of "7*10000 + 6*1000 + 9*100 +
5*10 + 2" divided by 4 is equivalent to remainder
of following :
0 + 0 + 0 + 5*10 + 2 = 52
Therefore we can say that the whole number is
divisible by 4 if 52 is divisible by 4.


 */