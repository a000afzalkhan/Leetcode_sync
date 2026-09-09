class Solution {
    public long countCommas(long n) {
        long ans = 0;

        long start = 1000;
        long commas = 1;

        while (start <= n) {
            long next = start * 1000;

            long end = Math.min(n, next - 1);

            long count = end - start + 1;

            ans += count * commas;

            start = next;
            commas++;
        }

        return ans;
    }
}