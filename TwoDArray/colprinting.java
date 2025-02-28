package TwoDArray;

public class colprinting {
     // This question is here to print the Column Wise Matrices.
     public static void main(String[] args) {
        int[][] b = {{3,5},{7,8},{4,1}};
        int m = b.length;
        int n = b[0].length;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(b[j][i] +" ");
            }
            System.out.println();
        }
    }
}
