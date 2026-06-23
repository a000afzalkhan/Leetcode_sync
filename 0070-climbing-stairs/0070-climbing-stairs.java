class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        long[][] M = {{1, 1}, {1, 0}};
        long[][] R = power(M, n);

        return (int) R[0][0];
    }

    private long[][] power(long[][] M, int n) {
        long[][] res = {{1, 0}, {0, 1}};

        while (n > 0) {
            if ((n & 1) == 1) res = multiply(res, M);
            M = multiply(M, M);
            n >>= 1;
        }
        return res;
    }

    private long[][] multiply(long[][] A, long[][] B) {
        return new long[][]{
            {
                A[0][0] * B[0][0] + A[0][1] * B[1][0],
                A[0][0] * B[0][1] + A[0][1] * B[1][1]
            },
            {
                A[1][0] * B[0][0] + A[1][1] * B[1][0],
                A[1][0] * B[0][1] + A[1][1] * B[1][1]
            }
        };
    }
}