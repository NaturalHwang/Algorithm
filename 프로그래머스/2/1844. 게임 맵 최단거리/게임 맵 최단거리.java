import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] dx = {1, -1, 0, 0}; // 좌,우,상,하
    static int[] dy = {0, 0, 1, -1}; // 좌,우,상,하

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        return bfs(maps, visited, 0, 0, n, m);
    }

    public static int bfs(int[][] maps, boolean[][] visited, int startX, int startY, int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {
                        q.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        maps[nx][ny] = maps[x][y] + 1;
                    }
                }
            }
        }

        return maps[n - 1][m - 1] == 1 ? -1 : maps[n - 1][m - 1];
    }
}
