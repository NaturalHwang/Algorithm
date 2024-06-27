import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            int max = 100000;
            int[] dis = new int[max + 1];
            Arrays.fill(dis, Integer.MAX_VALUE);

            Deque<Integer> dq = new ArrayDeque<>();
            dq.offer(n);
            dis[n] = 0;

            while (!dq.isEmpty()) {
                int now = dq.poll();

                if (now == k) {
                    break;
                }
                if (now * 2 <= max && dis[now * 2] > dis[now]) {
                    dis[now * 2] = dis[now];
                    dq.offerFirst(now * 2);
                }
                if (now + 1 <= max && dis[now + 1] > dis[now] + 1) {
                    dis[now + 1] = dis[now] + 1;
                    dq.offer(now + 1);
                }
                if (now - 1 >= 0 && dis[now - 1] > dis[now] + 1) {
                    dis[now - 1] = dis[now] + 1;
                    dq.offer(now - 1);
                }
            }
            System.out.println(dis[k]);
        }
}