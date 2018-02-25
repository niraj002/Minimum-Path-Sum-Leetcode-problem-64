class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[][] dp = new int[r][c];
        dp[r-1][c-1]=grid[r-1][c-1];
        for(int i=r-1,j=c-2; j>=0 ;j--)
            dp[i][j]= grid[i][j]+dp[i][j+1];
        for(int i=r-2,j=c-1;i>=0;i--)
            dp[i][j]= grid[i][j]+dp[i+1][j];
        for(int i=r-2 ; i>=0  ; i--){
            for(int j=c-2 ; j>=0 ; j--){
                dp[i][j] = grid[i][j]+ Math.min(dp[i][j+1], dp[i+1][j]);
            }
        }
         return dp[0][0];
    }
}
