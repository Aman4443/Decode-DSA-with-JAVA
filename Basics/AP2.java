import java.util.Scanner;
// WAP to find numbers from AP
public class AP2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value");
        int n = sc.nextInt();
        for (int i = 1; i <= 2*n+1; i+=3) {
            System.out.println(i);
        }
    }
}
