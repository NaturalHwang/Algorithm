import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, R;
    static List<Integer>[] adjList;
    static int[] order;
    static boolean[] visited;
    static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        adjList = new List[N + 1];
        for(int i = 1; i <= N; i++){
            adjList[i] = new ArrayList<>();
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adjList[u].add(v);
            adjList[v].add(u);
        }
        for(int i = 1; i <= N; i++){
           Collections.sort(adjList[i]);
        }
        visited = new boolean[N + 1];
        order = new int[N + 1];

        dfs(R);

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++){
            sb.append(order[i]).append("\n");
        }
        System.out.println(sb);
    }
    static void dfs(int start){
        visited[start] = true;
        order[start] = count++;
        for(int next : adjList[start]){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}
