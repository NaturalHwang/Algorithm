import java.util.*;

public class Main {
    static List<Node>[] list; // 그래프의 인접 리스트를 저장하는 배열
    static int[] dp; // 최단 거리를 저장하는 배열
    static boolean[] check; // 각 노드의 방문 여부를 저장하는 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 노드 수
        int m = sc.nextInt(); // 간선 수
        int start = sc.nextInt(); // 시작 노드


        // 인접 리스트 초기화
        list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        // 간선 정보를 입력받아 인접 리스트에 추가
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); // 시작 노드
            int v = sc.nextInt(); // 도착 노드
            int w = sc.nextInt(); // 가중치
            list[u].add(new Node(v, w));
        }
        dijkstra(start,n);
        // 각 노드까지의 최단 거리를 출력
        for (int i = 1; i <= n; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(dp[i]);
            }
        }
    }
    // 다익스트라 알고리즘
    public static void dijkstra(int start, int n) {
        dp = new int[n + 1]; // 최단 거리를 저장할 배열을 초기화
        check = new boolean[n + 1]; // 각 노드의 방문 여부를 저장할 배열을 초기화
        Arrays.fill(dp, Integer.MAX_VALUE); // 최단 거리 배열을 무한대로 초기화
        dp[start] = 0; // 시작 노드의 거리는 0으로 설정

        PriorityQueue<Node> pq = new PriorityQueue<>(); 
        pq.add(new Node(start, 0)); // 시작 노드를 우선순위 큐에 추가

        // 큐가 비어있지 않을 때까지 반복
        while (!pq.isEmpty()) {
            Node current = pq.poll(); // 큐에서 가장 가까운 노드를 꺼냄
            int currentNode = current.to;

            // 이미 방문한 노드는 무시합니다.
            if (check[currentNode]) continue;
            check[currentNode] = true; // 현재 노드를 방문 처리

            // 현재 노드와 연결된 모든 인접 노드를 확인
            for (Node neighbor : list[currentNode]) {
                // 현재 노드를 거쳐 인접 노드로 가는 경로가 더 짧으면 최단 거리를 업데이트
                if (dp[neighbor.to] > dp[currentNode] + neighbor.weight) {
                    dp[neighbor.to] = dp[currentNode] + neighbor.weight;
                    pq.add(new Node(neighbor.to, dp[neighbor.to])); // 갱신된 노드를 큐에 추가
                }
            }
        }
    }
    static class Node implements Comparable<Node>{
        int to;
        int weight;

        Node(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.weight, o.weight);
        }
    }
}
