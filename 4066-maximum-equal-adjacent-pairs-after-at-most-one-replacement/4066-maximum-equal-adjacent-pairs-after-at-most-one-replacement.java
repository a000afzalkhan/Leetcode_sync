import java.util.Arrays;
class Solution
{
    public int maxEqualAdjacentPairs(int[] nums)
    {
        int n = nums.length;
        int basePairs = 0;
        long[] pairs = new long[n - 1];
        int diffCount = 0;
        for (int i = 0; i < n - 1; i++)
        {
            int u = nums[i];
            int v = nums[i + 1];
            if (u == v)
            {
                basePairs++;
            }
            else
            {
                long min = Math.min(u, v);
                long max = Math.max(u, v);
                pairs[diffCount++] = (min << 32) | max;
            }
        }
        Arrays.sort(pairs, 0, diffCount);
        int maxGain = 0;
        int currentStreak = 0;
        for (int i = 0; i < diffCount; i++)
        {
            currentStreak++;
            if (i == diffCount - 1 || pairs[i] != pairs[i + 1])
            {
                maxGain = Math.max(maxGain, currentStreak);
                currentStreak = 0;
            }
        }
        return basePairs + maxGain;
    }
}