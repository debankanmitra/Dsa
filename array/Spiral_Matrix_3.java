//DIFFICULT PROBLEM

import java.util.Arrays;

public class Spiral_Matrix_3 {
    public static void main(String[] args) {
        int rows = 1, cols = 4, rStart = 0, cStart = 0;
        int[][] ans=new int[rows*cols][2]; // 30 rows and 2 columns
        int n=0; // 0/2+1=1, 1/2+1=1
        //----
        int dx=0;
        int dy=1;
        int temp=0;
        //----    
        
        for(int j=0;j<rows*cols;n++){ //its n++ because we don't want to increase the value of j when loop is running outside the matrix
            
            for(int i=0;i< n/2 + 1;i++){ // n/2+1 to generate 112233445566 this loop will only run two times
                
                if(rStart>=0 && rStart<rows && cStart>=0 && cStart<cols){ // 0<=rstart<=rows-1 and 0<=cstart<=cols-1
                    // here we are assigning the new 1D array to row of 2D array (ans) 
                    // it will remind you some basic concept of aray that every thing in java is an object
                    ans[j]=new int[]{rStart,cStart};
                    j++;
                }
                // * for loop will stop here
                rStart=rStart+dx; //1 1  
                cStart=cStart+dy; //5 6*  
            }
            // now the pointer is in [1,6] out of array so we have to make it [2,5]
            
            temp=dx; // now temp is 0
            dx=dy; //dx is 1
            dy= -temp; // dy is -0
            
        }
        
        System.out.println(Arrays.deepToString(ans));
    }
}
