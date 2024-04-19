package ArrayMedium;

import java.util.ArrayList;

public class MatrixInSpiralManner {
    private static ArrayList<Integer> spiralManner(int[][] matrix){
        ArrayList<Integer> lst = new ArrayList<>();
        int r = matrix.length,c = matrix[0].length;
        int top = 0,left = 0,bottom = r-1,right = c-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++)
                lst.add(matrix[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
                lst.add(matrix[i][right]);
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    lst.add(matrix[bottom][i]);
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    lst.add(matrix[i][left]);
            }
            left++;
        }
        return lst;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(spiralManner(matrix));
    }
}
