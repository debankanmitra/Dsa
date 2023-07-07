import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        // NOT SO EFFICEINT ONLY 36% FASTER
        int[] nums1 = { 4, 9, 5 }, nums2 = { 9, 4, 9, 8, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < nums1.length) {
            map.put(nums1[i], i);
            i++;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        i = 0;
        while (i < nums2.length) {
            if (map.containsKey(nums2[i]) == true && arr.contains(nums2[i]) == false) {
                arr.add(nums2[i]);
            }
            i++;
        }
        System.out.println(arr);
        int[] arr2 = new int[arr.size()];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = arr.get(j);
        }
        System.out.println(arr2);
    }
}
