package AStudy;

import java.util.*;

public class BJ_10871 {
	static int n, x, a;

	public static void main(String[] args) /*throws Exception*/ {
		Scanner sc = new Scanner(System.in);
		//첫째 줄에 n과 x가 주어진다.
		n = sc.nextInt();
		x = sc.nextInt();

		for (int i = 0; i < n; i++) {//
			a = sc.nextInt();
			if (a < x) {//A에서 X보다 작은 수를 출력
				System.out.print(a + " ");
			}
		}
	}

}
