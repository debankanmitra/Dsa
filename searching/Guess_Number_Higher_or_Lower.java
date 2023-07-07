public class Guess_Number_Higher_or_Lower {
    public static void main(String[] args) {
        int low=1;
        int n=19;                // THERE WILL BE A NUMBER WITHIN 1 TO N , SO LOW=1 AND HIGH =N 
        int high=n;              // WE HAVE FIND THE NUMBER THROUGH BINARY SEARCH
        int mid=0;
        while(low<=high){
             mid=low+(high-low)/2;
            if(guess(mid)==0){
                System.out.println(mid);;
            }else if(guess(mid)==-1){
                high=mid-1;
            }else if(guess(mid)==1){
                low=mid+1;
            }
        }
        System.out.println(mid);
    }
// --------------------------------- guess function----------------
    public static int guess(int mid) {
        int n=19;
        if (mid<n) {
            return 1;
        } else if(mid>n) {
            return -1;
        }else{
            return 0;
        }
    }
}
