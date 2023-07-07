import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
        // VIDEO: https://youtu.be/XZ6ZL1Qg6og
        int[] nums1 = { 1, 2, 2, 1 }, nums2 = { 2, 2 };
        // VARIABLES:
        // map -> For each number in nums1[] we store it's occurence
        // list -> We represent our array to return as a lisit initially
        // so we can dynamically add elements and we do not know how many
        // we might need to add.
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // In our first loop, we will build a map where the key is a number in nums1[]
        // and the value is how many times it occurs in nums1[]
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i]) + 1);
            else
                map.put(nums1[i], 1);
        }

        // With this map, we can now inspect nums2[]. Anytime we see a number in nums2[]
        // that is a key in map and has a positive value, we know we can add this key to
        // our list
        // When we add an element to our list, we need to reduce the value in our map by
        // 1,
        // since we only want to add this to our list the same amount of times it occurs
        // in BOTH
        // nums1[] and nums2[].
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                list.add(nums2[i]);
            }
        }

        // Now we just turn our list into an array and return.
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        System.out.println(res);
    }
}
