//Runtime: 1 ms, faster than 38.49%
// NOT OPTIMISED

import java.util.Arrays;
public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static int[] main(String[] args) {
    //--------------- FIRST WAY---------    
        int[] nums = { 1, 3 }; // 4 -- 3,5
        int start = 0, end = nums.length - 1, target = 1;
        int[] output = new int[2];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target && nums[start] == nums[end]) {
                output[0] = start;
                output[1] = end;
                System.out.println(Arrays.toString(output));
            } else if (nums[mid] == target && nums[start] < target) {
                start++;
            } else if (nums[mid] == target && nums[end] > target) {
                end--;
            } else if (nums[mid] < target) {
                start = mid+ 1; // if 7 < 8 , start=7+1
            } else if (nums[mid] > target) {
                end = mid - 1; // if 8>7 , end=8-1
            }
        }
        System.out.println(-1);

    //--------- SECOND WAY ----
     start=0 ; end=nums.length-1;
        while (start<=end){
            if(nums[start]==target && nums[end]==target){
                return new int[]{start,end};
            }
            if(nums[start]!=target) start++;
            if(nums[end]!=target) end--;          
        } 
        return  new int[]{-1,-1};    
    }
}
