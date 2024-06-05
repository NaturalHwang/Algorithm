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
        minBurger = Math.min(menu[0], Math.min(menu[1],menu[2]));
        minBev = Math.min(menu[3], menu[4]);

        System.out.println(minBurger + minBev - 50);
    }
}