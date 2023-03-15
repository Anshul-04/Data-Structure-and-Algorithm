package Star_Pattern_Programs;
/* 
        7. PYRAMID 
 
 */
public class Pyramid {
    public static void main(String[] args) {
            int n = 6;
            pyramid(n);
    }

    public static void pyramid(int n) {

        // for(int i=0 ; i < n ; i++){
        //     // For printing the spaces before stars in each row
        //     for(int j=0 ; j < (n-i-1) ; j++){
        //         System.out.print(" ");
        //     }
        //       // For printing the stars in each row
        //     for(int j=0 ; j < (2*i+1) ; j++){
        //         System.out.print("*");
        //     }
        //       // For printing the spaces after the stars in each row
        //     for (int j =0; j<N-i-1; j++)
        //     {
        //         System.out.print(" ");
        //     }

        //     System.out.println();
        // }

        for(int i=1;i<=n;i++){
            // #1 this is for Left triangle
	        for(int j=(n-i);j>0;j--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print("*");
	        }
            // #2 this is for Right triangle ,
            // As we want to print right triangle from the 2nd iteration of i,
            // that's why we use if condition
    	    if(i!=1){
    	       for(int j=1;j<=i-1;j++){
    	           System.out.print("*");
    	       }
    	    }
	       System.out.println();
	    
	    }
        
    }
}

/* 

       12345 
1        *   
2       *** 
3      ***** 
4     *******  
5    ********* 

==> As we can clearly observe that for each row there are some spaces that get printed 
    then some stars and then again some spaces giving it a final pyramidal look. 
    For eg: 
    - In the first row (i=0) there are 4 spaces, 1 star, then again 4 spaces. 
    - In the second row (i=1) there are 3 spaces, 3 stars, then again 3 spaces.
      so we can say that
    - there are N-i-1 spaces, 2*i+1 stars, and then again N-i-1 spaces for each row where i is
      the row index. We thus simply run 3 inner loops first for printing the spaces, 
      then the stars, and then the spaces again.

        ANOTHER APPROACH
==> Think of it as a combination of Left and Right triangle 

               123  45 
        1        *   
        2       **| * 
        3      ***| ** 
        4     ****| ***  
        5    *****| **** 

        1- first we print left triangle
        2 - then print right triangle ,it start from 2nd row of left triangle
        3-  left's 2nd row equal right's 1st row


       
*/