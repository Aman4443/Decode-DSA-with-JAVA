import java.util.Arrays;

public class dynamicSize {
    public static void main(String[] args) {
      int[] arr = {30,10,40,23,89,34};
      for(int ele : arr){
          System.out.print(ele + " ");
      }
        System.out.println();
      int[] nums = arr; // Shallow copy Doesnot deals with Creation of Array
      nums[0] = 70;
        System.out.print(arr[0] +"  ");
        int[] brr = Arrays.copyOf(arr,arr.length); // Deep copy in which Actaul creation of Array
        brr[0]= 25;
        for(int ele : brr){
            System.out.print(ele +" ");
        }
}
}
