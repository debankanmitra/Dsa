public class Search_in_Rotated_Sorted_Array {
    public static int main(String[] args) {
        // AS IT IS A HALF SORTED ARRAY AND WE ARE TOLD TO DO IT WITHIN O(NlogN) WE WILL USE BINARY SEARCH 
        // SO IF WE TAKE THE MID INDEX THE TARGET MUST BE IN LEFT HALF , RIGHT HALF OR MID INDEX ITSELF
        // TO VERIFY IF IT IS IN LEFT HALF OR NOT , NUMBER AT START INDEX MUST BE LESSER OR EQAUL TO THE TARGET NUMBER 
        // AND FOR THE RIGHT HALF THE END INDEX NUMBER CAN'T BE SMALLER THAN THE TARGET
        // SO THERE IS TWO SCENARIO, TARGET=0
        // [4,5,6,7,0,1,2] - HERE MID=7>END AND START > TARGET .SO,START=MID+1 (RIGHT HALF)
        // [7,0,1,2,3,4,5] - HERE MID=2<END , MID=2>TARGET  ,START > TARGET .SO,END=MID-1 (LEFT HALF)

        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        
        int start=0,end=nums.length-1,mid;
        if(nums[start]>target && nums[end]<target)
            return -1;
        while(start<=end){
            mid=start+(end-start);
            if(nums[mid]==target)
                return mid;
            if(nums[start]>target && nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
}
