class sub{
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max=Integer.MIN_VALUE,sum=0;
        // for (int i = 0; i < nums.length; i++) {
        //     sum=0;
        //     for (int j = i; j < nums.length; j++) {
        //          sum+=nums[j];
        //        if(sum>max){
        //          max=sum;   
        //        }
                
        //     }
        // }

        /*============== BETTER METHOD =============*/
        // DEBUG TO UNDERSTAND HOW ITS WORKING , NOT SO DIFFICULT
     
        for (int i = 0; i < nums.length; i++) {
      // it is working like 0+=-2=-2 is it greater than min if yes then min=-2,if no then sum =0, again it will start the sum from next number       
                sum+=nums[i];
                if(sum>max){
                   max=sum;   
                }
                if(sum<0){  // <0 because no number is less than integer.min i.e -2147483648
                   sum=0;   // to sum=0 , sum has to be become <0 after plus-minus
                }
                     
        }
        System.out.println(max);
    }
}