package Star_Pattern_Programs;
/* 
        6. HOLLOW SQUARE
 
 */
public class HollowSquare {
    public static void main(String[] args) {
        int n = 5;
        hollowSquare(n);
    }

   public static void hollowSquare(int n){
     // outer loop for no of rows
          for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                if(i==0 || i==n-1){  //printing full star on row only if it is 1st or last row
                    System.out.print("*");
                }
                else{
                    if(j==0 || j==n-1){  // else checking if it's 1st or last column ,then only printing the star
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
             }
             System.out.println();
          }
   }
}


/* 

    *****
    *   *
    *   *
    *   *
    *****
    


*/