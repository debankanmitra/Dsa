/* FORMULA:
 * Rotation of 1st part + rotation of 2nd part + rotation of whole part=ANSWER
 * 
 * We can minimize the code by creating function
 */ 

public class Rotate_array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;

       
        k = k % nums.length; // if k=10 , it will take all the 7 parts which will be same and again all the
                             // remaining three part , so % will automatically resize it 10%7=3
        int start = 0, end = nums.length - k - 1, temp = 0;
        while (start < end) { // first part
            temp = nums[start]; // rotation for 1-4
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        start = nums.length - k;
        end = nums.length - 1;
        while (start < end) { // second part
            temp = nums[start]; // rotation for 5-7
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        start = 0;
        end = nums.length - 1;
        while (start < end) { // last part
            temp = nums[start]; // rotaion from zero to last index of the two rotated part
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
       
    }
}