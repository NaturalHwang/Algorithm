class Solution {
    static int maxCount = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] check = new boolean[dungeons.length];
        dfs(k,dungeons,check,0);
        int answer = maxCount;
        return answer;
    }
    public static void dfs(int k, int[][] dungeons, boolean[] check, int count){
        for(int i = 0; i < dungeons.length; i++){
            if(k >= dungeons[i][0] && !check[i]){
                check[i] = true;
                dfs(k-dungeons[i][1], dungeons, check, count+1);
                check[i] = false;
            }
        }
        maxCount = Math.max(maxCount, count);
    }
}