class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int result = Integer.MAX_VALUE;

        for (int k = l; k <= r; k++) {

            int sum = 0;

            // Calculate first window
            for (int i = 0; i < k; i++) {
                sum += nums.get(i);
            }

            if (sum > 0) {
                result = Math.min(result, sum);
            }

            // Slide the window
            for (int high = k; high < nums.size(); high++) {

                sum = sum - nums.get(high - k) + nums.get(high);

                if (sum > 0) {
                    result = Math.min(result, sum);
                }
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}