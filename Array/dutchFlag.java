public class dutchFlag {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 1, 2, 1, 2, 0, 0};
        int n = arr.length;
        
        // Dutch National Flag problem
        int lo = 0, mid = 0, hi = n - 1;
        
        while (mid <= hi) {
            if (arr[mid] == 0) {
                // Swap arr[lo] and arr[mid]
                int temp = arr[lo];
                arr[lo] = arr[mid];
                arr[mid] = temp;
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // arr[mid] == 2
                // Swap arr[mid] and arr[hi]
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
        
        // Printing the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }
}
