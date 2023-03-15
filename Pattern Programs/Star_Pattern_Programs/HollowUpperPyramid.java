package Star_Pattern_Programs;

/* 
        17. HOLLOW UPPER PYRAMID
 
 */
public class HollowUpperPyramid {
    public static void main(String[] args) {
        int n=5 ;
        hollowPyramid(n);
    }

    public static void hollowPyramid(int n) {
        for(int i=1;i<=n;i++){
            //printing spaces
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            // we are printing 1st and last row fully
            if(i==1 || i==n){
                for(int j=1;j<=2*i-1;j++){
                   System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=2*i-1;j++){
                    if(j==1 || j==(2*i-2)){
                        System.out.print("* ");
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

  SPACES = n-i-1
  STARS = 2*i+1 

       12345 
1        *   
2       *** 
3      ***** 
4     *******  
5    ********* 

       12345 
1        *   
2       * * 
3      *   * 
4     *     *  
5    ********* 


*/