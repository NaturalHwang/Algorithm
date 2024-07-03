import java.util.*;

public class Main {
    static List<Node>[] list;
    static int[] dp;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        list = new ArrayList[n+1];
        for(int i = 1; i <= n; i++){
            list[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            list[u].add(new Node(v, w));
        }
        int start = sc.nextInt();
        int to = sc.nextInt();
        dijkstra(start, n);

        System.out.println(dp[to]);
    }
    public static void dijkstra(int start, int n){
        dp = new int[n+1];
        check = new boolean[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while(!pq.isEmpty()){
            Node current = pq.poll();
            int currentNode = current.to;

            if(check[currentNode]) continue;
            check[currentNode] = true;

            for(Node neighbor : list[currentNode]){
                if(dp[neighbor.to] > dp[currentNode] + neighbor.weight){
                    dp[neighbor.to] = dp[currentNode] + neighbor.weight;
                    pq.add(new Node(neighbor.to, dp[neighbor.to]));
                }
            }
        }
    }
    static class Node implements Comparable<Node> {
        int to;
        int weight;

        Node(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o){
            return Integer.compare(this.weight, o.weight);
        }
    }
}
