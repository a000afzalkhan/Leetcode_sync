class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] res = new int[n][n];

        for(int i =0;i<n;i++){
            int k = rowShift[i];
            for(int j=0;j<n;j++){
                int newCol = (j-k%n+n) %n;
                res[i][newCol] = grid[i][j];
            }
        }

        int[][] finalGrid = new int[n][n];
        for(int j =0;j<n;j++){
            int k = colShift[j];
            for(int i = 0;i<n;i++){
                int newRow = (i-k%n+n)%n;
                finalGrid[newRow][j] = res[i][j];
            }
        }
        return finalGrid;
    }
}