import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu[] = new int[5];
        int minBurger = 0;
        int minBev = 0;

        for(int i = 0; i < 5; i++){
            menu[i] = sc.nextInt();
        }
        minBurger = menu[0];
        for(int j = 1; j < 3; j++){
            if(minBurger > menu[j]) minBurger = menu[j];
        }
        if(menu[3] < menu[4]) minBev = menu[3];
        else minBev = menu[4];

        System.out.println(minBurger + minBev - 50);
    }
}
