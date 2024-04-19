package ArrayMedium;

public class SetMatrixZero {
    private static void setMatrixZero(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int[] row = new int[r];
        int[] col = new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1 || col[j]==1) matrix[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZero(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
