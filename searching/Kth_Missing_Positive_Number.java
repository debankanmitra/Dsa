// This one is not an efficinet solution 
// THIS CODE IS JUST STARTING A VALUE FROM 1 AND CHECKING IF IT IS PRESENT IN THE ARRAY UNTILL COUNT = K
// IF THE VALUE IS NOT PRESENT THE COUNT VAREIABLE INCREASED BY 1 TO FIND THE NEXT VALUE WHICH IS NOT PRESENT
public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5; 
        int value=1,count=0; 
        while(count<k){
            if(checknum(value,arr)!=0){
                count++;
            }
            value++;
        }
        System.out.println(value-1);;
    }

    public static int checknum(int val,int[] arr) {
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==val){
                return 0;
            }else if(arr[mid]>val){
                right=mid-1;
            }else{
                left=mid+1;
            }         
        }
        return 1;    
    }
}
