import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> words = new HashMap<>();
        for(int i = 0; i < n; i++){
            String word = sc.nextLine();
            words.put(word, word.length());
        }
        String[] sortedWords = words.keySet().stream()
                .sorted((word1, word2) -> {
                         // compare 메서드는 같으면 0 반환
                        int length = Integer.compare(words.get(word1), words.get(word2));  // 단어 길이 비교
                        if(length == 0){
                            return word1.compareTo(word2);   // 단어 길이 같으면 사전순으로 비교
                        }
                        return length;
                })
                .toArray(String[]::new);   // 정렬된 결과 배열로
        for(String s: sortedWords){
            System.out.println(s);
        }
    }
}
