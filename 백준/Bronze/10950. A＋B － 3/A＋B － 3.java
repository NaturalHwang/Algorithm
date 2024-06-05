import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int a, b;
		for(int i = 0; i < M; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
		sc.close();
	}
}
