package Star_Pattern_Programs;

public class DownPyramid {
    public static void main(String[] args) {
        int n = 5;
        downPyramid(n);
    }

   public static void downPyramid(int n) {

    for( int i=0;i<n;i++){
       // #1 for Left Down triangle
      // printing spaces
      for(int j=0;j<i;j++){
        System.out.print(" ");
      }
      // For printing star in each row
      for(int j=0;j<(n-i);j++){
        System.out.print("*");
      }
      // Till now only 1st iteration for left is done,befor going to next line i will also print 
      // star for right
      // #2 for Right Down triangle
      // Usually i will print 5 * for 1st row but in this i have to print one * less
      for(int j=0;j<(n-i-1);j++ ){
        System.out.print("*");
      }
      System.out.println();
    
   }
}
}


/*      

     
1    *********
2     *******  
3      *****
4       ***
5        * 
       12345


1    *****| ****
2     ****| ***  
3      ***| **
4       **| *
5        *| 
       123  45

  */