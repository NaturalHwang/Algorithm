import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[26];
        char []temp = sc.next().toCharArray();

        for(int i = 0; i < temp.length; i++){
            a[temp[i]-97]++;
        }
        for(int j = 0; j < a.length; j++){
            System.out.print(a[j] + " ");
        }
    }
}
