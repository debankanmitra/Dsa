public class Two_Sum_II_Input_Array_Is_Sorted {
    public static int[] main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int low=0 , high=numbers.length-1,num;
        while(low<high){
            num=numbers[low]+numbers[high]; 
            if(num==target){
                return new int[]{low+1, high+1};
            }else if(num>target){
                high--;
            }else{
                low++;
            }
        }
        return new int[]{low+1, high+1};
    }
}
