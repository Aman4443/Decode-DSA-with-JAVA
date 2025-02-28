package TwoDArray;

public class rowWise {
      // This question is all about Printing the row Wise matrix
      public static void main(String[] args) {
        int[][] a = {{2,5},{4,6},{8,9}};
        int m = a.length;
        int n = a[0].length;
        // row Wise Printing
        for (int i = 0; i <m ; i++) { // rows
            for (int j = 0; j < n; j++) { // columns
                System.out.print(a[i][j] + " ");
            }
        }
    }
}
