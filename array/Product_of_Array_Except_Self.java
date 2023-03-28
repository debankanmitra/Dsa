import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
 // https://leetcode.com/problems/product-of-array-except-self/discuss/1584842/java-solution
//The concept is simple, you want to calculate the products from both left side and
//right side (excluding itself). The ans[i] is left * right
        int[] nums = {1,2,3,4};
        int[] ans = new int[nums.length];
        
        int left=1;
        for (int i = 0; i < nums.length; i++) { 
            ans[i]=left;   // 1 
            left*=nums[i]; // 1 , 1*1 , 1*1*2 , 1*1*2*3
                           // 1 , 1 , 2 , 6
        }
        
        int right=1;
        for (int i = nums.length-1; i >= 0; i--) {
            ans[i]*=right;  // 6*1 , 2*8 , 1*12 , 1*24 
            right*=nums[i]; // 1*4*3*2, 1*4*3, 1*4, 1
                            // 24 , 12 , 4 , 1 
        }
        System.out.println(Arrays.toString(ans)); 
    }
}
