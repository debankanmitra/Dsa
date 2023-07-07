import java.util.Arrays;

public class  Spiral_Matrix_2 {
    public static void main(String[] args) {
        int n=1;
        int q=1;
        int[][] matrix=new int[n][n];
        int lc=0,rc=n-1,tr=0,br=n-1,direction=0;      
        while (lc<=rc && tr<=br) {
            if (direction==0 && q<=n*n) {
                for (int i = lc; i<=rc; i++) {
                    matrix[tr][i]=q;
                    q++;
                }
                direction++;tr++;
            }
            else if (direction==1 && q<=n*n) {           
                for (int i = tr; i<=br; i++) {
                    matrix[i][rc]=q;
                    q++;
                }
                direction++;rc--;
            }
            else if (direction==2 && q<=n*n) {  
                for (int i = rc; i>=lc; i--) {
                    matrix[br][i]=q;
                    q++;
                }
                direction++;br--;
            }
            else if (direction==3 && q<=n*n) {  
                for (int i = br; i>=tr; i--) {
                    matrix[i][lc]=q;
                    q++;
                }
                direction=0;lc++;
            }
        } 
        System.out.println(Arrays.deepToString(matrix));      
    }
    
}
