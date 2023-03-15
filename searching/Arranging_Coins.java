public class Arranging_Coins {
    public static int main(String[] args) {
    // --------Inefficient solution-----------
        int i=1,n=8;
        int count=0;
        while (i<=n){
            n=n-i;
            count++;
            i++;
        }
        return count;
    // --------------------------------------
    // -------- EFFICEINT USING BINARY SEARCH-----
/*     long start=0, end=n;
    while(start<=end){
        long mid=start+(end-start)/2;
        long pivot=mid*(mid+1)/2;
        if(pivot==n){
            return (int)mid;
        }
        if(pivot>n){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return (int)end;  */
    }
}
