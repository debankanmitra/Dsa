// I WAS GETTING TTL ERROR FOR NOT USING LONG , DONNO WHY
public class Valid_Perfect_Square {
    public static boolean main(String[] args) {
        int num=16;
        int start = 1, end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sqr=mid*mid;
            if (sqr == num) {
                return true;
            } else if (sqr > num) {
                end = (int)mid - 1;
            } else {
                start = (int)mid + 1;
            }
        }
        return false;
    }
}
