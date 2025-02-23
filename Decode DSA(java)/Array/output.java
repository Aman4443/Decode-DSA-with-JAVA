import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        
        // Using for loop to input array elements
        System.out.println("Enter 7 elements:");
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Using for loop to output array elements
        System.out.print("Array elements: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
