
class Solution {
    public int countCommas(int n) {
        int commas = 0;

        for (long start = 1000; start <= n; start *= 1000) {
            commas += n - start + 1;
            
            if (start > n / 1000) {
                break;
            }
        }

        return commas;
    }
}

