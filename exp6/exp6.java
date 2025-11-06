class exp6 {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        Boolean[][] dp = new Boolean[arr.length + 1][sum + 1];

        return recursion(arr, sum, 0, dp);
    }

    static Boolean recursion(int arr[], int target, int i, Boolean[][] dp) {
        if (dp[i][target] != null)
            return dp[i][target];
        if (target == 0)
            return true;
        if (i == arr.length || target < 0)
            return false;
        boolean np = recursion(arr, target, i + 1, dp);
        boolean p = false;
        if (arr[i] <= target)
            p = recursion(arr, target - arr[i], i + 1, dp);
        dp[i][target] = np || p;
        return dp[i][target];
    }
}
