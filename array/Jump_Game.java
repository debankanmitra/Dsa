public class Jump_Game {
    public static void main(String[] args) {
        int[] nums = {0,1};
        boolean output=false;
        if (nums.length==1) {
            output=true;
            System.out.println(output);
        }
        if (nums[0]==0 && nums.length>1) {
            System.out.println("complete false");
        }
        int j=1;
        
        // to go till the last index every value of the index until the second last index have to be 1 atleast , it can be more than 1 but atleast 1 , if in some cases the middle indexes contains less than 1 value( 0 ) then its previous index must carry an extra +1 to cover its next vlaue        
        for (int i = nums.length-2; i >= 0; i--) { // -----EXAMPLE : ---
            if (j>nums[i]) {            // [1,2,2,0,3,4] -- we will check from the last-1 index , 3 is > j, 
                j++;                    //                 j won't change , i--
                output=false;           //now nums[i]==0, 0 < j(1) , j=1+1 , i-- , output=false
            }else if(j<=nums[i]){       //now nums[i]==2, 2==j(2) , j=1 , i--  , output=true
                j=1;                    // loop continus till  i >= 0
                output=true;            // if value of j > value at index 0 , output=false
            }                           // return false else return true
        }                               // in particular example result will be true 



        System.out.println(output);
    }
}
