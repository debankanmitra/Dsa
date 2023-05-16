public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
       if (nums.length==0) {
        System.out.println(0);
       }
      int j=0;
       for (int i = 1; i < nums.length; i++) {
        if (nums[j]!=nums[i]) {
            j++;
            nums[j]=nums[i];
        }
       }
       System.out.println(j+1); // j+1 because j strats with 0


    }
}
