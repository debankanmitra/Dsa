public class First_Bad_Version {
    public static void main(String[] args) {
        int n =12;
        int first=1,last=n,first_bad=n;
        while(first<=last){
            int mid=first+(last-first)/2;
            if(isBadVersion(mid)==true){
                last=mid-1;
                first_bad=mid;
            }else{
                first=mid+1;
            }
        }
        System.out.println(first_bad);
    }

    private static boolean isBadVersion(int mid) {
        return false; // this method is just to handle error , it is not properly written
    }
}
