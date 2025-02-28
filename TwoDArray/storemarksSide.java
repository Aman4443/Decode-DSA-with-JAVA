package TwoDArray;

import java.util.Scanner;

public class storemarksSide {
     // This is the question of Storing marks of the student Side By Side
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        int m = arr.length;
        int n = arr[0].length;
        System.out.println("Enter the Elements");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        }
}
