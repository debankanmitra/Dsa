// FINAL SOLUTION
import java.util.Arrays;

public class set_Matrix_Zeroes2 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] fake_matrix=new int[matrix.length][matrix[0].length];
        System.out.println(Arrays.deepToString(matrix));
// creating a fake matrix to avoid changing values of original matrix       
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                fake_matrix[i][j]=matrix[i][j];
            }
        }
        
 // iterating the fake matrix
        for (int i = 0; i < fake_matrix.length; i++) {
            for (int j = 0; j < fake_matrix[0].length; j++) {
      
                if (fake_matrix[i][j]==0) {
         // when ij=0 it iterate all the columns from 0 to end, keeping row constant        
                    for (int k = 0; k < fake_matrix[0].length; k++) {
                        matrix[i][k]=0;
                    }
         // again it iterate all the rows from 0 to end, keeping column constant       
                    for (int k = 0; k < fake_matrix.length; k++) {
                        matrix[k][j]=0;
                    }
                }
            }
        }
     
       
        System.out.println(Arrays.deepToString(matrix));
    }
}
