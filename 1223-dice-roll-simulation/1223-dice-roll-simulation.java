class Solution {
    int MOD = 1_000_000_007;
    
    public int dieSimulator(int n, int[] rollMax) {
        long[][][] dp = new long[n+1][6][16];
        
        for(int j=0;j<6;j++)dp[1][j][1]=1;
        
        for(int i=2;i<=n;i++)
            for(int j=0;j<6;j++)
                for(int k=1; k<=rollMax[j]; k++)
                    if(dp[i -1][j][k] > 0)
                        for(int nj =0;nj<6; nj++)
                            if(nj==j){
                                if(k < rollMax[j])
                                    dp[i][j][k+1]=(dp[i][j][k+1] + dp[i -1][j][k]) %MOD;
                            
                            }else
                                dp[i][nj][1]=(dp[i][nj][1] + dp[i-1][j][k]) % MOD;
        
        long ans =0;
        for(int j =0; j<6; j++)
            for(int k =1; k<=rollMax[j];k++)
                ans = (ans + dp[n][j][k])%MOD;
        return (int) ans;
    }
}