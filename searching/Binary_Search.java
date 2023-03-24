public class Binary_Search {
    public static int main(String[] args) {
        // EASIEST NEEDS NO EXPLANATION
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int start=0 , end=nums.length-1,mid;
        if(target>nums[end] || target<nums[start])
            return -1;
        while (start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end =mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
