import java.util.Arrays;

public class Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] fake_matrix=new int[matrix.length][matrix[0].length];
        //b=matrix;
        System.out.println(Arrays.deepToString(matrix));
   
        int z=0;
        for (int i = 0; i < fake_matrix.length; i++) {
            fake_matrix[z][i]=matrix[z][i];
            if (i==fake_matrix.length-1 && z<fake_matrix[0].length) {
                if (i==fake_matrix.length-1 && z==fake_matrix[0].length-1) {
                    break;
                }  
                z++;
                i=-1;  
            }
        }
        System.out.println(Arrays.deepToString(fake_matrix));
    }
}
