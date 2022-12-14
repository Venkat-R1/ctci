import java.util.*;

public class string1_7{
    
    private static void rotate(int[][] matrix, boolean clockwise, boolean counterClockwise){
        int n = matrix.length;
        for(int layer=0; layer<n/2; layer++){
            int first = layer;
            int last = n-1-layer;

            for(int i=first; i<last; i++){
                int offset = i-first;
                int top = matrix[first][i];
                if(clockwise){
                    matrix[first][i] = matrix[last-offset][first];
                    matrix[last-offset][first] = matrix[last][last-offset];
                    matrix[last][last-offset] = matrix[i][last];
                    matrix[i][last] = top;
                    
                } else if(counterClockwise){
                    matrix[first][i] =  matrix[i][last];
                    matrix[i][last] = matrix[last][last-offset];
                    matrix[last][last-offset] = matrix[last-offset][first];
                    matrix[last-offset][first] = top;
                }
            }
        }
    }

    public static void main(String[] args){
        int[][]  matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix, true, false);
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}