public class Minimum_Absolute_Sum_Difference {
    public static void main(String[] args) {
        int[] nums1 = {1,10,4,4,2,7}, nums2 = {9,3,5,1,7,4};
    //TLE EXCEEDED,HERE I WAS TRYING TO DO FOR EVERY INDEX IN nums 2 i subtract it with all numbers in nums 1 and do summation    
        int i=0,sum,min2=999999,min;
        if(nums1==nums2) System.out.println(0);
        while (i<nums1.length) {
            sum=0; min=999999;
            for (int k : nums1) if (Math.abs(k-nums2[i])<min) min=Math.abs(k-nums2[i]);
            
            for (int j = 0; j < nums2.length; j++) {
                if (j==i) sum+=min;j++;
                if (j<=nums2.length-1) sum+=Math.abs(nums1[j]-nums2[j]);  
            }
            if (sum<min2) min2=sum;
        i++;
        }
        System.out.println(min2);
    }
}
