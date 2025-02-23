package Array;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target Element :");
        int x = sc.nextInt();
        System.out.print("Enter the Array size :");
        int n = sc.nextInt();
        int[]arr = new int [n];
        System.out.println("enter the Array Element :");
        for (int i = 0; i <=n-1 ; i++) {
            arr[i]= sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i <=n-1; i++) {
            if(arr[i]==x)
            found = true;
        }
        if(found){
            System.out.println("element found");
        } else {
            System.out.println("Not found");
        }
}
}
