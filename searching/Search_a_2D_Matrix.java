public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 },{ 10, 11, 16, 20 },{ 23, 30, 34, 60 } };
        int target = 34;

        int rows = 0, cols = matrix[0].length - 1, i = 0;
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][cols]) System.out.println(false);
        while (i < matrix.length) {
            if (target >= matrix[i][rows] && target <= matrix[i][cols]) {
                while (rows <= cols) {
                    int mid = (rows + cols) / 2;
                    if (matrix[i][mid] == target) System.out.println(true);
                    else if (target > matrix[i][mid]) rows = mid + 1;
                    else cols = mid - 1;
                }
            } else {
                i++;
            }
        }
        System.out.println(false);

    }
}
