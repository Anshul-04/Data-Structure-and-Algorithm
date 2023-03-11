package Star_Pattern_Programs;

public class rightDownTriangle {
    public static void main(String[] args) {
        int n =5;
        rightDown(n);
    }

    public static void  rightDown(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/*   
    1 2 3 4 5
1   * * * * *
2   * * * *
3   * * *
4   * *
5   *

 */