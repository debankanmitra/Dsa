public class Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static void main(String[] args) {
    // INEFFICIENT SOLUTION
        int count=0;
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    count++;
                }}}
        System.out.println(count);
    //-------------------------------------
    // EFFICIENT SOLUTION USING BINARY SEARCH
    int counnt=0,start=0,end=grid[0].length-1;      
        for(int i=0;i<grid.length;i++){
            start=0;
            end=grid[i].length-1;
   // BINARY SEARCH         
            while(start <= end){
            int mid = start + (end - start)/2;
            if(grid[i][mid] < 0)
                end = mid - 1;
            else
                start = mid + 1;
        }
   // BINARY SEACRH END         
        counnt+= grid[i].length - start;  // count after each iteration    
        }

        System.out.println(counnt);     
    }
}
