import java.util.*;
import java.lang.Math;

public class Main {
	public static int circle(int x1, int y1, int r1, int x2, int y2, int r2) {
		int dis = (int)Math.pow((x2 - x1), 2) + (int)Math.pow((y2 - y1), 2);
		int rr = (int)Math.pow((r2 - r1), 2);
		if(x1 == x2 && y1 == y2 && r1 == r2)	// 같은 원
			return -1;
		else if(dis < rr)	// 원이 원 안에 있고 접하지 않음
			return 0;
		else if(dis > (int)Math.pow((r1 + r2), 2))	// 원이 접하지 않음
			return 0;
		else if(dis == rr)		// 내접
			return 1;
		else if(dis == (int)Math.pow((r1 + r2), 2))		// 외접
			return 1;
		else
			return 2;		// 나머지 경우 두개의 접점
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2, r1, r2, t;
		t = sc.nextInt();
		while(t != 0) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			System.out.println(circle(x1, y1, r1, x2, y2, r2));
			t--;
		}
	}
}