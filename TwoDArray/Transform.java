package TwoDimensional;

public class transposeMatrix {
    // This question for Printing the Transpose of Matrix
    public static void main(String[] args) {
        int[][] arr = {{2, 5}, {4, 8}, {3, 7}};
        int m = arr.length;  // Number of rows
        int n = arr[0].length;  // Number of columns

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < m; i++) {  // Rows
            for (int j = 0; j < n; j++) {  // Columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }

        // Transpose the matrix
        int[][] t = new int[n][m];  // Transpose has m rows and n columns

        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < n; i++) {  // Columns of original matrix become rows in transposed matrix
            for (int j = 0; j < m; j++) {  // Rows of original matrix become columns in transposed matrix
                t[i][j] = arr[j][i];  // Swap row and column
                System.out.print(t[i][j] + " ");
            }
            System.out.println();  // New line after each row of the transpose
        }
    }
}
