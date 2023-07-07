public class Single_Element_in_a_Sorted_Array {
    public static int main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        // HERE FROM START AND END WE ARE GOING TOWARDS MIDDLE AND FOR A NUMBER IF ITS
        // PREVIOUS OR NEXT NUMBER IS SAME WE ARE INCREMENTING 2 STEPS
        // THIS SOLUTION IS EFFICIENT BU WE SHOULD DO IT USING BINARY SEARCH
        int start = 0, end = nums.length - 1;
        if (nums.length == 1)
            return nums[0];
        while (start <= end) {
            if (nums[start] == nums[start + 1])
                start += 2;
            if (start == nums.length - 1)
                return nums[start];
            if (nums[start] != nums[start + 1])
                return nums[start];
            if (nums[end] == nums[end - 1])
                end -= 2;
            if (nums[end] != nums[end - 1])
                return nums[end];
        }
        return -1;
    }
}
