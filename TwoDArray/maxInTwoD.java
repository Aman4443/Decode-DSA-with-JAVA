package TwoDArray;

public class maxInTwoD {
    // This is the Question for finding the largest Element in array
    public static void main(String[] args) {
        int [][] arr = {{1,5,6},{2,-9,30},{5,10,3}};
        int m = arr.length;
        int n = arr[0].length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx,arr[i][j]);
            }
        }
        System.out.println( "Maximum Element is" +" " + mx);
    }
}
