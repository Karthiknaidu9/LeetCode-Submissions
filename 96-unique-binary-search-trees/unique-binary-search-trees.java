class Solution {
    public int numTrees(int n) {
     int dp[]=new int[n+1];
     dp[0]=1;
     dp[1]=1;
     for(int i=2;i<=n;i++){
        dp[i]=countNumTrees(i, dp);
     }
     return dp[n];
    }
    public static int countNumTrees(int num, int dp[]) {
        int sum=0;
          for(int i=0;i<num;i++){
            int left=dp[i];
            int right =dp[num-i-1];
            sum+=left*right;
          }
        return sum;
    }
}