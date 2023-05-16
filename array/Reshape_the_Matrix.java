import java.util.Arrays;

//https://www.youtube.com/watch?v=JCb27sANkC0
public class Reshape_the_Matrix {
    public static void main(String[] args) {      
        int r=1, c=4;
        int[][] mat = {{1,2},{3,4}};  
        int m = mat.length, n = mat[0].length;
        if (m*n != r*c) System.out.println(mat);

        int[][] result = new int[r][c];
        int  row=0,col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }      
                
            }
        }
        
            System.out.println(Arrays.deepToString(result));
        
        
        
    }
}
