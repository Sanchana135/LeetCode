class Solution {
    public int smallestRangeI(int[] nums, int k) {

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int range = (max - k) - (min + k);

        if (range < 0) {
            return 0;
        }

        return range;
    }
}