import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                answer[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            answer[st.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <n; i++){
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}
