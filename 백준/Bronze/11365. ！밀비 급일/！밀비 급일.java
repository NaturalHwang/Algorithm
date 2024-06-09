import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            try {
                if(str.equals("END")) break;
                String reverse_str = new StringBuilder(str).reverse().toString();
                System.out.println(reverse_str);
            } catch(NullPointerException e){
                System.out.println("NPE");
            }
        }
    }
}
