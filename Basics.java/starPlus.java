import java.util.Scanner;

public class starPlus {
     public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (i == mid || j == mid)
                    System.out.print("*" + "");
                else
                    System.out.print("0" + " ");
            }
            System.out.println();
        }
    }
}
