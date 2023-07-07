// SAME AS PEAK INDEX IN A MOUNTAIN OF ARRAY
public class Find_Peak_Element {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int start=0,end=nums.length-1,mid;
        while(start<=end){
            mid= start+(end-start)/2;
           if (nums[mid]>nums[mid+1]){
                end=mid; // when this happens , then start<end should be given
            }else{
                start=mid+1;
            }
        }
        System.out.println(nums[end]);
    }
}
