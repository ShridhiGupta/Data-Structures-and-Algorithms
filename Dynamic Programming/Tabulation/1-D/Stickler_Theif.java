import java.util.Arrays;

public class Stickler_Theif {
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        if(n>1)
            dp[1] = Math.max(arr[0], arr[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
        }
        return dp[n-1];
    }
}
