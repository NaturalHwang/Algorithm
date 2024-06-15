import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double way = 2;
        double h = sc.nextDouble();
        way = Math.pow(2,h);
        System.out.println(Math.round(way));
    }
}
