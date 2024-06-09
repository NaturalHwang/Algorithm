import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            try {
                int cnt = 0;
                String str = br.readLine();
                if(str.equals("#")) break;
                char [] strArr = str.toCharArray();
                for(int i = 0; i < strArr.length; i++){
                    char ch = Character.toLowerCase(strArr[i]);
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') cnt++;
                }
                System.out.println(cnt);
            } catch (NullPointerException e){
                System.out.println("NPE");
            }
        }
    }
}
