package Star_Pattern_Programs;

public class SquarePattern {
    public static void main(String[] args) {
        int n=5;
        rightStar(n);
    }

    public static void rightStar(int n)
    {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();            
        }
    }
}


/*
 

   1 2 3 4 5 
1  * * * * *
2  * * * * *
3  * * * * *
4  * * * * *
5  * * * * *

   
 */