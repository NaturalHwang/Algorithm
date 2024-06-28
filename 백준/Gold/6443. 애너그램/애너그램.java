import java.io.IOException;
import java.util.*;

public class Main {
    static char[] words;
    static List<String> result;
    static int[] alpha = new int[26];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            result = new ArrayList<>();
            alpha = new int[26];
            words = sc.nextLine().toCharArray();
            for(char c : words){
                int index = c - 'a';
                alpha[index]++;
            }
            dfs(0, new StringBuilder());
            for (String s : result) {
                sb.append(s).append("\n");
            }
        }
        System.out.println(sb);
    }
    static void dfs(int depth, StringBuilder sb){
        if(depth== words.length){
            result.add(sb.toString());
            return;
        }
        for(int i = 0; i < 26; i++){
            if(alpha[i] != 0){
                char index = (char) (i+ 'a');
                alpha[i]--;
                sb.append(index);
                dfs(depth+1, sb);
                sb.deleteCharAt(sb.length()-1);
                alpha[i]++;
            }
        }
    }
}