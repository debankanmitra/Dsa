import java.util.HashMap;
import java.util.Map;
// if the element is not present in the list we will add it , T.C=O(n)
public class Two_sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            result[1] = i;
            result[0] = map.get(target - nums[i]);
            System.out.println(result);
        }
        map.put(nums[i], i);
    }
    System.out.println(result);
    }
}
