package TwoDArray;

import java.util.Scanner;

public class productInTwoD {
     // This Question is to solve the product using Input Scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int m = arr.length;
        int n = arr[0].length;
        int y = 0;
        System.out.println("Enter the Elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
              arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                y*=arr[i][j];
                System.out.println("Product is :"+ " "+ y);
            }
        }
    }
}
