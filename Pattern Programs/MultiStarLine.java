public class MultiStarLine {
    public static void  multiStar(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        multiStar(n);
    }
}

/*

    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *

 */