import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        int weight;

        while(true){
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            name = st.nextToken();
            age = Integer.parseInt(st.nextToken());
            weight = Integer.parseInt(st.nextToken());
            if(name.equals("#") && age == 0 && weight == 0){
                break;
            } else{
                if(age>17 || weight >= 80){
                    System.out.println(name + " Senior");
                } else{
                    System.out.println(name + " Junior");
                }
            }
        }
    }
}
