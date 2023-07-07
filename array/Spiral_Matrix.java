import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int row=matrix.length;
        if (row==0) {
            //return list;
        }
        int col=matrix[0].length;
        
        int lc=0,rc=col-1,tr=0,br=row-1,direction=0;
        
        while (lc<=rc && tr<=br) {
            if (direction==0) {
                for (int i = lc; i<=rc; i++) { // processing top row after that changing tp row to +1
                    list.add(matrix[tr][i]);
                }
                direction++;tr++;
            }
            else if (direction==1) {            // processing right column after that changing right column to -1
                for (int i = tr; i<=br; i++) {
                    list.add(matrix[i][rc]);
                }
                direction++;rc--;
            }
            else if (direction==2) {  // processing bottom row after that changing bottom row to -1
                for (int i = rc; i>=lc; i--) {
                    list.add(matrix[br][i]);
                }
                direction++;br--;
            }
            else if (direction==3) {   // processing left column after that changing left column to +1
                for (int i = br; i>=tr; i--) {
                    list.add(matrix[i][lc]);
                }
                direction=0;lc++;
            }
        }
          
    }
}

// WROKING ON TOP ROW, WE WILL SHIFT THE ROW BECAUSE WE WILL NOT ACCESS IT LATER
//  lc          rc   // lc - left column , rc right column, tr - top row , br - bottom row
//   1  2  3  4  5
//tr 1  4  5  6  9 
//   3  5  6  7  3
//   8  2  3  4  2
//br 1  4  6  9  3 


// WORKING ON RIGHT COLUMN   //WORKING IN BOTTOM ROW              //WORKING ON LEFT COLUMN
//  lc        rc           //    lc       rc
//   1  2  3  4  5         //    1  2  3  4  5 
//tr 1  4  5  6  9         //tr  1  4  5  6  9 
//   3  5  6  7  3         //    3  5  6  7  9                   // AFTER THAT LC COLUMN
//   8  2  3  4  2         //br  8  2  3  4  2
//br 1  4  6  9  3         //    1  4  6  9  3



// EXPLANATION: https://youtu.be/JkWDKg_pNME