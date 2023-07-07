public class sqrt {
    public static void main(String[] args) {
        int i = 46338;
        long result = 1;
        int x = 2147395600;
        while (result <= x) {
            i++;
            result = i * i; // The values of i * i is monotonically increasing,
            // so the problem can be solved using binary search.
            // Once the Integer reaches MAX_VALUE it will start to overflow and you will end
            // up in negative value.
        }
        System.out.println(i - 1);

        // ----------------------- Modified Solution using binary search
        // --------------------------------
        // it works in a way that square root of the number will always be lesser than
        // the actual number , so using binary search we will eventually reach the number
        //Video soln: https://youtu.be/smWjd5p5oLA
        
        long start = 0, end = x, ans = 0;
        if (x <= 0)
            System.out.println((int) ans);
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                System.out.println((int) mid);
            } else if (mid * mid > x) {
                end = mid - 1;
            } else if (mid * mid < x) {
                ans = mid;
                start = mid + 1;
            }
        }
        System.out.println((int) ans);
    }
}