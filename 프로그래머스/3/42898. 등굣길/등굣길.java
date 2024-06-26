class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        //가장 왼쪽 위, 즉 집이 있는 곳의 좌표는 (1, 1)
        int[][] dp = new int[n+1][m+1];

        for(int[] p : puddles) {
            dp[p[1]][p[0]] = -1;
        }

        dp[1][1] = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                if(i > 1) {
                    dp[i][j] += dp[i-1][j] % 1000000007;
                }
                if(j > 1) {
                    dp[i][j] += dp[i][j-1] % 1000000007;
                }
                dp[i][j] %= 1000000007;
            }
        }
        answer = dp[n][m];
        return answer;
    }
}