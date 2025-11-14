class lc62 {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m - 1][n - 1];
        return function(0, 0, m, n, dp);
    }

    public int function(int row, int col, int m, int n, int[][] dp) {
        if (row == m - 1 || col == n - 1) {
            return 1;
        }
        if (dp[row][col] != 0)
            return dp[row][col];
        int right = function(row + 1, col, m, n, dp);
        int down = function(row, col + 1, m, n, dp);
        dp[row][col] = right + down;
        return dp[row][col];
    }
}