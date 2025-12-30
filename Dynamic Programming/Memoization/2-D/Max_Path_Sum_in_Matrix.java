import java.util.*;

public class Max_Path_Sum_in_Matrix {
    public int path(int[][] arr, int r, int c, int[][] dp){
        int n = arr.length;
        int m = arr[0].length;
        
        if(c<0 || c >= m || r == n)
            return Integer.MIN_VALUE;
            
        if(r == n-1)
            return arr[r][c];
            
        if(dp[r][c] != 0)
            return dp[r][c];
            
        int left = path(arr, r+1, c-1, dp);
        int down = path(arr, r+1, c, dp);
        int right = path(arr, r+1, c+1, dp);
        
        return dp[r][c] = arr[r][c] + Math.max(left, Math.max(down, right));
    }
    public int maximumPath(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        
        int[][] dp = new int[n][m];
        
        int ans = -1;
        //first row ke koi bhi element se start kar skte haii
        for(int j=0;j<m;j++)
            ans = Math.max(ans, path(arr, 0, j, dp));
        return ans;
        
    }
}
