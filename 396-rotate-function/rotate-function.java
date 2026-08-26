class Solution {
    public int maxRotateFunction(int[] nums) {

        long sum = 0;
        long f = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            f += (long) i * nums[i];
        }

        long max = f;

        for (int k = 1; k < nums.length; k++) {
            f = f + sum - (long) nums.length * nums[nums.length - k];

            max = Math.max(max, f);
        }

        return (int) max;
    }
}