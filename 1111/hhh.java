package 1111;

public class hhh {
    
}
package TwoDimensionalArrays;
import java.util.*;
public class inputOutput {
    // Here is the Basics dealing with understanding of Two Dimensional Input and Output
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int m = arr.length;
        int n = arr[0].length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the 2D Array:");

        // Input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("The 2D Array is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
