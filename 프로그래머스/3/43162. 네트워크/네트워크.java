import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(i, computers, visited);
                answer++;
            }
        }
        return answer;
    }
    public static void bfs(int start, int [][] com, boolean[] visted){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visted[start] = true;

        while(!q.isEmpty()){
            int node = q.poll();

            for(int i = 0; i < com.length; i++){
                if(com[node][i] == 1 && !visted[i]){
                    q.add(i);
                    visted[i] = true;
                }
            }
        }
    }
}