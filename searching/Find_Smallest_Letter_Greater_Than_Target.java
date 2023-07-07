public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target='c';
        int l=0,r=letters.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(target>=letters[letters.length-1]){
                System.out.println(letters[0]);
            }
            if(letters[mid]>target){
                 r=mid;
            }else{ 
                l=mid+1;
            }
        }
        System.out.println(letters[r]);
    }
}
// DEBUG THE CODE TO KNOW HOW IT IS WORKING 
// THERE IS ONLY TWO WAYS IT CAN BE DONE EITHER YOU SET 
//1) l<r and r=mid and return r
//2) l<=r and r=mid-1 and return l 
//There is also many other ways for this problem but here 2nd one is the most efficient