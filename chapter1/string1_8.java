public class string1_8 {

    private static void makeZero(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j] == false && matrix[i][j]==0){
                    makeRowColumnZero(matrix,i,j, visited);
                }
            }
        } 
    }
    private static void makeRowColumnZero(int[][] matrix, int i, int j, boolean[][] visited){
        for(int v =0; v<matrix[0].length; v++){
            matrix[i][v] = 0;
            visited[i][v] = true;
        }
        for (int k =0; k<matrix.length;k++){
            matrix[k][j] = 0;
            visited[k][j] = true;
        }
    }
    
    public static void main(String[] args){
        int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9},{13,14,0}};
        makeZero(matrix);
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }   
    }
}
