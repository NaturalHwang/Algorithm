import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char []strArr = str.toCharArray();
        int []num = new int[26];
        int temp;
        for(int i = 0; i < 26; i++){
            num[i] = -1;
        }
        for(int j = 0; j < strArr.length; j++){
            temp = strArr[j]-97;
            if(num[temp]== -1){
                num[temp] = j;
            }
        }
        for(int k = 0; k < 26; k++){
            System.out.print(num[k] + " ");
        }
    }
}

