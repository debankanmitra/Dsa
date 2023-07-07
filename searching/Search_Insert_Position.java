public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int start=0,end=nums.length-1;         // ex: [1,3,5,6] ,target=2
        if (target>nums[end])                  // mid=+3/2=1
            System.out.println(end+1);         // so end will be 1-1=0 and start is also 0 
        while(start<=end){                     // mid=0+0/2=0 , so now start will be 0+1=1 
            int mid =(start+end)/2;            // thats why we return start not end
            if(nums[mid]==target){             // when start>end loop will stop and final value of start will be +1 than end
                System.out.println(mid);
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(start); // We can't print end because we are doing end=mid-1 ,if end =mid we can print end then
    }
}
