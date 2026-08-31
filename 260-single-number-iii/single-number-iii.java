import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int[] ans = new int[2];
        int k = 0;

        for (int n : nums) {
            if (map.get(n) == 1) {
                ans[k++] = n;
            }
        }

        return ans;
    }
}