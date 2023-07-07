// THIS IS NOT A OPTIMISED SOLUTION
// SO HERE WE ARE USING TWO FOR LOOP AND AND KEEPING END DIMENSION CONSTANT BY K
// WE ARE LOOPING THE START INDEX OF EACH ARRAY AND INDEX OF THE SMALLEST NUMBER IS ADDED TO THE NEW ARRAY
// WE CAN IMPROVE THIS SOLUTION USING HASHMAP : FIRST WE WILL ADD THE FIRST INDEX OF EACH ARRAY
//                                              AGAIN IN ANOTHER LOOP WE WILL FIND FOR THE SMALLEST NUM GREATER THAN END INDEX 
//                                              WE CAN AGAIN USE SORT TO GET THE FIRST FUNCTION
public class Find_Right_Interval {
    public static void main(String[] args) {
        int[][] intervals = { { 3, 4 }, { 2, 3 }, { 1, 2 } };

        int k = 0, min = 9999, point = 0;
        int[] output = new int[intervals.length];
        if (intervals.length == 1)
            System.out.println(-1);
        while (k < intervals.length) {
            for (int i = 0; i < intervals.length; i++) {
                if (i != k && intervals[i][0] == intervals[k][1]) {
                    point = i;
                    break;
                }
                if (intervals[i][0] >= intervals[k][1] && intervals[i][0] < min) {
                    min = intervals[i][0];
                    point = i;
                }
            }
            if (intervals[point][0] == intervals[k][1]) {
                output[k] = point;
            } else if (min == 9999) {
                output[k] = -1;
            } else if (min > 0) {
                output[k] = point;
            } else {
                output[k] = -1;
            }
            k++;
        }
        System.out.println(output);
    }
}
