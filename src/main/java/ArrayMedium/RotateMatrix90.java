package ArrayMedium;

public class RotateMatrix90 {
    private static void rotate(int[][] nums){
        int n = nums.length,temp;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                temp = nums[i][j];
                nums[i][j] = nums[i][n-j-1];
                nums[i][n-j-1] = temp;
            }
        }
    }
    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
