package Star_Pattern_Programs;

public class HollowStarTriangle {
    public static void main(String[] args) {
        int n = 6;
        hollowTriangle(n);
    }

    public static void hollowTriangle(int n) {

        for(int i=1;i<=n;i++){
           
            if(i==1 || i==n){
                for(int j=1;j<=i;j++){
                  System.out.print("* ");
                }
                System.out.println();
           }
           else{
              for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
              }
              System.out.println();
           } 
            
        }
    }
}


/* 
     123456
1    *
2    * *
3    *   *
4    *     *
5    *       *
6    * * * * * *

*/

// *
// **
// * *
// *  *
// *   *
// ******