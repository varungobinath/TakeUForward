package DynamicProgramming.D2;

public class FallingPathSum {
    private static int fallingPathSum(int[][] matrix,int r,int c){
        if(c<0 || c>=matrix[0].length) return (int) Math.pow(-10,9);
        if(r==matrix.length-1) return matrix[r][c];
        int left = matrix[r][c]+fallingPathSum(matrix,r+1,c-1);
        int down = matrix[r][c]+fallingPathSum(matrix,r+1,c);
        int right = matrix[r][c]+fallingPathSum(matrix,r+1,c+1);
        return Math.max(left,Math.max(down,right));
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 10, 4},
                {100, 3, 2, 1},
                {1, 1, 20, 2},
                {1, 2, 2, 1}};
        int max = Integer.MIN_VALUE;
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<col;i++){
            max = Math.max(max,fallingPathSum(matrix,0,i));
        }
        System.out.println(max);
    }
}
