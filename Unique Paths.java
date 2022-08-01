class Solution {
    /*
                                          //recursive aproch it will lead to TLE bz ( (2^100) > (10^9) )
    static int count=0;
    public int uniquePaths(int m, int n) {
        count=0;
        solve(0,0,m-1,n-1);
        return count;
    }
    public void solve(int str,int stc,int m,int n)
    {
        if(str==m+1 || stc==n+1)
        {
            return ;
        }
        if(str==m && stc==n)
        {
            count++;
        }
        
        solve(str,stc+1,m,n);
        solve(str+1,stc, m, n);
    }
    */
    
                                                                      // dp code 
    public int uniquePaths(int m, int n) {
      int [][]dp=new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j]=0;
                }
                if(i==0 || j==0)
                {
                    dp[i][j]=1;
                }
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        
        return dp[m-1][n-1];
    }
}
