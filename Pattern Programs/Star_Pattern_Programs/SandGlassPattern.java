package Star_Pattern_Programs;

/* 
      15. SAND GLASS PATTERN

    ==> IN THIS PATTERN NO OF STARS EQUALS TO WRT ROWS NUMBER    
 */

public class SandGlassPattern {
    public static void main(String[] args) {
        int n = 10 ;
        sandGlass(n);
    }

    public static void sandGlass(int n) {
        lowerPyramid(n);
        upperPyramid(n);
    }

    public static void lowerPyramid(int n) {
        // code for left down triangle with one extra space before star while printing star
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){  
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" *"); // extra space before star
            }
            System.out.println();
        }
    }

    public static void upperPyramid(int n) {
        // code for left  triangle with one extra space after star while printing star
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* "); // extra space after star
            }
            System.out.println();
        }
    }
    
}

/*   


# FOR LOWER PYRAMID
=> The code is Similar to Left Down Triangle ,In this i just add one more space before star
   while printing the star

 * * * *                                                           * * * *  
   * * *                                                            * * * 
     * *   ===> after one extra space while printing star  ===>      * *  
       *                                                              * 
       
# FOR UPPER PYRAMID
=> The code is Similar to Left  Triangle ,In this i just add one more space after star
   while printing the star

         *                                                             * 
       * *  ===> after one extra space while printing star  ===>      * *
     * * *                                                           * * *  
   * * * *                                                          * * * * 
    
       
   
APPROACH -
- FIRST I ADD CODE FOR LOWER THEN UPPER PYRAMID.
 
            1 2 3 4 5 6 7 8 9 10     
1           * * * * * * * * * * 
2            * * * * * * * * *  
3             * * * * * * * * 
4              * * * * * * * 
5               * * * * * *  
6                * * * * * 
7                 * * * * 
8                  * * * 
9                   * * 
10                   * 
1                    * 
2                   * *
3                  * * * 
4                 * * * * 
5                * * * * *
6               * * * * * * 
7              * * * * * * * 
8             * * * * * * * * 
9            * * * * * * * * * 
10          * * * * * * * * * * 

               
   */
