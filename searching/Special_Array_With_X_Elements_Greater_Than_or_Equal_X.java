public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    public static int main(String[] args) {
        // THIS IS NOT EFFICIENT SOLUTION WE CAN OPTIMISE IT MORE UISNG BINARY SEARCH
        int[] nums= {0,4,3,0,4};
        for (int i=1;i<=nums.length;i++){
            int count =0;
            for(int num:nums){ 
                if(num>=i){
                    count++;
                }
            }  
            if(i==count)
                return i;     
        }
        return -1;
    }
}
