public class sort {
    public static void main(String[] args) {
        int[] arr = {20, 40, 12, 50, 60,35,87,46};
        int n = arr.length;
        System.out.println("Before using Two Pointer approach");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        // Using Two Pointer Approach
        int i = 0;
        //int i =1; j =5; for part of Array
        int j = n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed Array");
       for(int ele : arr){
           System.out.print(ele +" ");
       }
        System.out.println();
}
}
