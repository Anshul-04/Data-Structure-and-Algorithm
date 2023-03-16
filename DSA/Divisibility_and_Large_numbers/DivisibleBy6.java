package Divisibility_and_Large_numbers;

public class DivisibleBy6 {
    public static void main(String[] args) {
        String s = "1132";
        if (isDivisible(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isDivisible(String s){
        int n = s.length();

        if(n==0){
            return false;
        }
        if(n==1){
            return (n%3==0 && n%2==0);
        }

        int lastDigit = s.charAt(n-1)-'0';  // convert character into Integer
        int digitSum =0;

        for(int i=0;i<n;i++){
            digitSum += s.charAt(i)-'0';
        }

        return (lastDigit%2==0 && digitSum % 3 ==0);

    }

}

/*

==>    A number is divisible by 6 it's divisible by 2 and 3.

    a)  A number is divisible by 2 if its last digit is divisible by 2.
    b)  A number is divisible by 3 if sum of digits is divisible by 3.

 */
