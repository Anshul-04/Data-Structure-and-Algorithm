package Star_Pattern_Programs;

public class LeftDownTriangle {
    public static void main(String[] args) {
        int n =6;
        leftDown(n);
    }

    public static void leftDown(int n){
     
        for(int i=0;i<n;i++){
            //for spaces
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            //for stars
            for(int j =0;j<n-i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        

    }
}

/*
   1 2 3 4 5 
1  * * * * *
2    * * * * 
3      * * * 
4        * * 
5          * 


 */