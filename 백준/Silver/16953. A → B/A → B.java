import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        System.out.println(bfs(A, B));
    }

    public static int bfs(long A, long B) {
        Queue<long[]> queue = new LinkedList<>();
        queue.offer(new long[]{A, 1});  // {현재 값, 연산 횟수}

        while (!queue.isEmpty()) {
            long[] current = queue.poll();
            long currentValue = current[0];
            int currentOperations = (int) current[1];

            if (currentValue == B) {
                return currentOperations;
            }

            long nextValue1 = currentValue * 2;
            long nextValue2 = currentValue * 10 + 1;

            if (nextValue1 <= B) {
                queue.offer(new long[]{nextValue1, currentOperations + 1});
            }

            if (nextValue2 <= B) {
                queue.offer(new long[]{nextValue2, currentOperations + 1});
            }
        }

        return -1; // A에서 B로 변환 불가능한 경우
    }
}
