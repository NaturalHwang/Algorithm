import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String a = st.nextToken();
        String b = st.nextToken();

        char[] arr1 = a.toCharArray();
        char temp = arr1[0];
        arr1[0] = arr1[2];
        arr1[2] = temp;

        char[] arr2 = b.toCharArray();
        char temp2 = arr2[0];
        arr2[0] = arr2[2];
        arr2[2] = temp2;

        String sA = new String(arr1);
        String sB = new String(arr2);
        int newA = Integer.parseInt(sA);
        int newB = Integer.parseInt(sB);
        System.out.println(Math.max(newA,newB));
    }
}
