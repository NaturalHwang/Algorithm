import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;

public class Main {
    static int[][] box;
    static boolean[][] visited; // 중복 탐색 방지용
    static int m, n; // m은 행, n은 열
    static int[] dx = { 0, 1, 0, -1 }; // 우, 하, 좌, 상
    static int[] dy = { 1, 0, -1, 0 }; // 우, 하, 좌, 상
    static Queue<int[]> q = new LinkedList<>(); // BFS에 사용할 큐

    // BFS 함수
    public static void bfs() {
        while (!q.isEmpty()) {
            int[] now = q.poll(); // 큐에서 현재 위치를 꺼냄
            for (int k = 0; k < 4; k++) { // 상하좌우로 이동
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < n && y < m) { // 유효한 좌표인지 확인
                    if (!visited[x][y] && box[x][y] == 0) { // 방문하지 않았고, 토마토가 익지 않은 경우
                        q.add(new int[]{x, y}); // 큐에 추가
                        visited[x][y] = true; // 방문 표시
                        box[x][y] = box[now[0]][now[1]] + 1; // 익은 일수 기록
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // 첫 줄에서 m과 n을 입력받음
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            box = new int[n][m];
            visited = new boolean[n][m];

            // 그래프 입력 받기
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < m; j++) {
                    box[i][j] = Integer.parseInt(st.nextToken());
                    if (box[i][j] == 1) { // 익은 토마토인 경우
                        q.add(new int[]{i, j}); // 큐에 추가
                        visited[i][j] = true; // 방문 표시
                    }
                }
            }

            bfs();

            int result = 0; // 결과를 저장할 변수
            for (int i = 0; i < n; i++) { // 모든 칸을 확인
                for (int j = 0; j < m; j++) {
                    if (box[i][j] == 0) { // 익지 않은 토마토가 있으면
                        System.out.println(-1); // -1 출력
                        return;
                    }
                    result = Math.max(result, box[i][j]); // 최대 일수를 계산
                }
            }

            System.out.println(result - 1); // 시작을 1로 했으므로 1을 빼줌
        } catch (NoSuchElementException e) {
            System.out.println("입력을 잘못 읽었습니다.");
        }
    }
}
