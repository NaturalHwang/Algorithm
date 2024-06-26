import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = kruskal(n, costs);
        return answer;
    }
    public static class Edge implements Comparable<Edge> {
        int from, to, cost;

        Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge o) {
            // 비용을 기준으로 오름차순 정렬
            return this.cost - o.cost;
        }
    }
    // Union-Find 알고리즘에서 부모 노드를 찾는 함수
    public static int find(int[] parent, int x) {
        if (parent[x] == x) {
            return x;
        }
        // 경로 압축 최적화
        return parent[x] = find(parent, parent[x]);
    }
    // Union-Find 알고리즘에서 두 노드를 합치는 함수
    public static void union(int[] parent, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        if (rootX != rootY) {
            // 두 노드의 루트를 하나로 합침
            parent[rootY] = rootX;
        }
    }
    // 크루스칼 알고리즘을 사용하여 최소 스패닝 트리를 구하는 함수
    public static int kruskal(int n, int[][] costs) {
        List<Edge> edges = new ArrayList<>();
        // 입력된 비용 배열을 Edge 객체로 변환하여 리스트에 추가
        for (int[] cost : costs) {
            edges.add(new Edge(cost[0], cost[1], cost[2]));
        }
        // 간선을 비용 기준으로 정렬
        Collections.sort(edges);
        int[] parent = new int[n];
        // 각 노드의 부모를 자기 자신으로 초기화 (Union-Find 구조 초기화)
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int totalCost = 0;
        // 최소 스패닝 트리를 구성하기 위해 간선을 하나씩 선택
        for (Edge edge : edges) {
            // 두 노드가 같은 부모를 가지지 않는 경우에만 간선을 선택 (사이클 방지)
            if (find(parent, edge.from) != find(parent, edge.to)) {
                // 두 노드를 같은 집합으로 합침
                union(parent, edge.from, edge.to);
                // 총 비용에 선택한 간선의 비용을 추가
                totalCost += edge.cost;
            }
        }
        // 최소 스패닝 트리의 총 비용 반환
        return totalCost;
    }
}