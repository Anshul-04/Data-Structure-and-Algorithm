package Star_Pattern_Programs;
/* 
        11. DIAMOND 
 
 */
public class Diamond {
    public static void main(String[] args) {
        int n =8;       
        diamond(n);
    }

    public static void diamond(int n) {
        
        upperPyramid(n);
        lowerPyramid(n);
    }

    public static void upperPyramid(int N){
        int n = N-1;
        
        // for each rows
        for(int i=0;i<n;i++){
           // Left triangle
           // printing spaces
           for(int j=0;j<n-i;j++){  //here j is not < till n-i-1 ,as i want one one space in each row
               System.out.print(" ");
           }
           //printing stars
           for(int j=0;j<=i;j++){
                System.out.print("*");
           }

           // Right triangle
           for(int j=0;j<i;j++){
            System.out.print("*");
           }

           System.out.println();
        }
    }

    public static void lowerPyramid(int n) {
         
        // for each rows
        for(int i=0;i<n;i++){
            // for Left Down
            // printing spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            // printing stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            // for Right down
            for(int j=n-i-1;j>0;j--){
               System.out.print("*");
            }

            System.out.println();
        }
    }
}

/* 

=> This is combination of upper and down pyramid


1                       *
2                      ***
3                     *****
4                    *******
5                   *********
6                  ***********
7                 *************   <--|______ till this it is upper Pyramid
8                ***************
7                 *************
6                  ***********
5                   *********
4                    *******
3                     *****
2                      ***
1                       *



*/