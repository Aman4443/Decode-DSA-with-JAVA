import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0]; // Initializing max to the first element
        
        // Starting the loop from i = 1 as the first element is already in max
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Updating max if the current element is larger
            }
        }
        
        System.out.println("Maximum Element is: " + max);
    }
}
