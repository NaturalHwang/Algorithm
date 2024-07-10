import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] classes = new int[n][2];

        for(int i = 0; i < n; i++){
            classes[i][0] = sc.nextInt();
            classes[i][1] = sc.nextInt();
        }

        Arrays.sort(classes, (a,b) ->{
            if(a[0]==b[0])return a[1]-b[1];
            return a[0]-b[0];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(classes[0][1]);

        for(int i = 1; i < n; i++){
            if(pq.peek() <= classes[i][0]){
                pq.poll();
            }

            pq.add(classes[i][1]);
        }
        System.out.println(pq.size());
    }
}
