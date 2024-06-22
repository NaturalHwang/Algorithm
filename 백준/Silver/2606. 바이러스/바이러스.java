import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int pair = Integer.parseInt(br.readLine());
        List<Integer>[] com = new ArrayList[N+1];
        for(int i = 1; i <= N; i++){
            com[i] = new ArrayList<>();
        }
        for(int i = 0; i < pair; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
//            양방향 그래프이므로 반대도 추가
            com[a].add(b);
            com[b].add(a);
        }

        boolean[] visited = new boolean[N+1];
        int virused = bfs(com, visited, 1);
//        자기 자신 제외
        System.out.println(virused-1);

    }
    public static int bfs(List<Integer>[] com, boolean[] visited, int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        int count = 0;

        while(!q.isEmpty()){
            int node = q.poll();
            count++;

            for(int i : com[node]){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return count;
    }
}
