import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        int[] alpha = new int[26];
        for(char c : input.toCharArray()){
            alpha[c-'A']++;
        }
        int odds = 0;
        char odd = 0;
        for(int i = 0; i < 26; i++){
            if(alpha[i] % 2 != 0){
                odds++;
                odd = (char)(i + 'A');
            }
        }
        if(odds > 1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        Deque<Character> dq = new ArrayDeque<>();
        for(int i = 0; i < 26; i++){
            char c = (char)(i+'A');
            for(int j = 0; j < alpha[i] / 2; j++){
                dq.addLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()){
            sb.append(dq.removeFirst());
        }
        if(odds == 1){
            sb.append(odd);
        }
        for(int i = 25; i >= 0; i--){
            char c = (char)(i + 'A');
            for(int j = 0; j < alpha[i] / 2; j++){
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
