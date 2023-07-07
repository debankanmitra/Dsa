// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        
    // INEFFICIENT SOLUTION
    /*Arrays.sort(nums);
        int j=0;
        for(int i: nums){
            if(i==j)return i;
            if(i!=j)j=i;
        }
        return j;*/
        
    // INEFFICIENT USING HASHMAP
    /*Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.add(i)==false) return i; // When a similar element is present in the array it will return false when adding the similar element second time
                                             // bcuz collections contains no duplicate values
        }
        return -1; */   

    // EFFICIENT SOLUTION
    int len = nums.length;
        for (int num : nums) {
            int idx = Math.abs(num);
            if (nums[idx] < 0) {
                System.out.println(idx);
            }
            nums[idx] = -nums[idx];
        }
        System.out.println(len);    
    }
}
