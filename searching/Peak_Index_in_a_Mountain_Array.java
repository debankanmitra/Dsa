public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        // If this is mountain array we just have to find the peak
        // the number in the peak will always be a greatest number of all
        // so we have to find the index of greatest number thats it
        int[] arr = { 0, 1, 0 };
        int start = 0, end = arr.length - 1, mid;
        while (start < end) {
            mid = start + (end - start) / 2;          // ex: [0,11,10,5,2]
            if (arr[mid] > arr[mid + 1]) {            // mid=11 ,if11>10, end=mid (not mid-1 , mind it) 
                end = mid;                            // if 0<10 then the start will be 11
            } else {                                  // thats why we returning end , end is playing safe side
                start = mid + 1;
            }
        }
        System.out.println(end);
    }
}
