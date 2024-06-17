import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String key = sc.nextLine();
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < word.length(); i++){
            s.push(word.charAt(i));
            if(s.size() >= key.length()){
                boolean bomb = true;
                for(int j = 0; j < key.length(); j++){
                    if (s.get(s.size() - key.length() + j)!= key.charAt(j)){
                        bomb = false;
                        break;
                    }
                }
                if(bomb){
                    for(int k = 0; k < key.length(); k++){
                        s.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c: s){
            sb.append(c);
        }
        if(sb.length()==0){
            System.out.println("FRULA");
        } else{
            System.out.println(sb);
        }
    }
}
