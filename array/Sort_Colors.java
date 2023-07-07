import java.util.Arrays;

public class Sort_Colors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                int temp=0;
                if(nums[j]<nums[i]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                
            }
        }

              System.out.println(Arrays.toString(nums));
        
    }
}
