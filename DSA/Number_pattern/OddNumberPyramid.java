package Number_pattern;

public class OddNumberPyramid {
    public static void main(String[] args) {
        int n = 4;
        oddNumberPyramid(n);
    }

    static void oddNumberPyramid(int n){

        for(int i=1;i<=n;i++){
            // for space (n-i)
	        for(int j=(n-i);j>0;j--){
	            System.out.print(" ");
	        }
            int num = (2*i)-1;
	        for(int j=1;j<=i;j++){
	            System.out.print(num);
                // num += 2;
	        }
            if(i!=1){
                for(int j=1;j<=i-1;j++){
                    System.out.print(num);
                    // num += 2;
                }
            }
            System.out.println();
        }
        
    }
    
}

/* 

Input

4
Output

   1   
  333  
 55555 
7777777
          *
         ***
        *****
       *******
*/