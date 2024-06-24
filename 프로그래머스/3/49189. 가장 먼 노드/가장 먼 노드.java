import java.util.*;

class Solution {
    static int n;
    static List<List<Integer>> adjList;
    static boolean[] check;
    static int[] dist;
    public int solution(int n, int[][] edge) {
        this.n = n;
        adjList = new ArrayList<>();
        dist = new int[n+1];
        for(int i = 0; i <= n; i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : edge){
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }
        bfs(1);
        int max = Arrays.stream(dist).max().getAsInt();
        int answer = (int)Arrays.stream(dist).filter(a->a==max).count();
        return answer;
    }
    static void bfs(int start){
        check = new boolean[n+1];
        dist = new int[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;
        dist[start] = 1;
        while(!q.isEmpty()){
            int now = q.poll();
            for(int next : adjList.get(now)){
                if(!check[next]){
                    q.add(next);
                    check[next] = true;
                    dist[next] = dist[now] + 1;
                }
            }
        }
    }
}