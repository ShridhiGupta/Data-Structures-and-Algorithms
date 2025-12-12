public class Knapsack_Memoization {
    int[][] memo;

    public int knapsack(int W, int[] val, int[] wt) {
        int n = val.length;
        memo = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                memo[i][j] = -1;
            }
        }

        return solve(n, W, val, wt);
    }

    private int solve(int n, int W, int[] val, int[] wt) {
        if (n == 0 || W == 0)
            return 0;

        if (memo[n][W] != -1)
            return memo[n][W];

        if (wt[n - 1] <= W) {
            memo[n][W] = Math.max(
                val[n - 1] + solve(n - 1, W - wt[n - 1], val, wt),
                solve(n - 1, W, val, wt)
            );
        } else {
            memo[n][W] = solve(n - 1, W, val, wt);
        }

        return memo[n][W];
    }
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 8, 7, 4};
        int[] values = {10, 15, 40, 50, 40, 30};
        int capacity = 7;

        Knapsack_Memoization ks = new Knapsack_Memoization();
        int maxValue = ks.knapsack(capacity, values, weights);
        System.out.println("Maximum value in Knapsack = " + maxValue);                                                                  
    }
}
