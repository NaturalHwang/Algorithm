import java.util.Scanner;

public class Main {
    static boolean[] alpha = new boolean[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String word = sc.nextLine();
            if(isGroup(word)) count++;
        }
        System.out.println(count);
    }
    public static boolean isGroup(String word){
        alpha = new boolean[26];
        char[] arr = word.toCharArray();
        for(int i =0; i < word.length(); i++){
            if(i < word.length()-1 && arr[i] == arr[i+1]) continue;
            if(alpha [arr[i]-97]){
                return false;
            } else alpha [arr[i]-97] = true;
        }
        return true;
    }
}
