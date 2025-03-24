package TwoDimensional;

public class transformIntoTranform {
    // This question all about solving the Two matrix into transform(existing into column Wise)
    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("Original Matrix is :");
        print(arr);
        // Tranform
        System.out.println("After transform");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);

        // Rotate the above Matrix
        System.out.println("Final Rotated matrix :");
        for (int i = 0; i <m ; i++) {
            int a = 0;  int b = m-1;
            // swap arr[i][a] and [i][b]
            while(a<b){
            int temp = arr[i][a];
            arr[i][a] = arr[i][b];
            arr[i][b] = temp;
            a++;
            b--;
            }
        }
        print(arr);
    }
}
