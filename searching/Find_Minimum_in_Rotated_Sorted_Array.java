public class Find_Minimum_in_Rotated_Sorted_Array {
    public static int main(String[] args) {
    // NOT EFFICIENT    
        int[] nums = { 2,1,2 };
        int start=0,end=nums.length-1,min=99;
        while(start<=end){
           if(nums[start]<nums[end] && nums[start]<min){
                min= nums[start];
           }else if(nums[end]<min){
              min= nums[end];
            }
            start++;
            end--;
        }
        return min;
    }
}
